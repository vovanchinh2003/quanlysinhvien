package pxu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pxu.com.exception.ResourceNotFoundException;
import pxu.com.model.KhoaHoc;
import pxu.com.model.SinhVien;
import pxu.com.repository.KhoaHocRepository;
import pxu.com.repository.SinhVienRepository;
import pxu.com.service.KhoaHocService;
import pxu.com.service.SinhVienService;

@Controller
@RequestMapping("/sinhvien")
public class SinhvieenController {

	@Autowired
	private SinhVienService sinhVienService;

	@Autowired
	private KhoaHocService khoaHocService;

	@GetMapping("/listsinhvien")
	public String listsinhvien(Model model) {
		List<SinhVien> sinhViens = sinhVienService.getAllSinhVien();
		model.addAttribute("sinhViens", sinhViens);
		return "listsinhvien";
	}

	@GetMapping("/showformsinhvien")
	public String showForm(Model model) {
		SinhVien sinhVien = new SinhVien();
		List<KhoaHoc> listKhoaHoc = khoaHocService.getAllKhoaHoc();
		model.addAttribute("sinhVien", sinhVien);
		model.addAttribute("listKhoaHoc", listKhoaHoc);
		return "formsinhvien";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("sinhvienId") int id) throws ResourceNotFoundException {
		sinhVienService.deleteSinhVien(id);
		return "redirect:/sinhvien/listsinhvien";
	}

	@PostMapping("/savesinhvien")
	public String savesinhvien(@ModelAttribute("sinhVien") SinhVien sinhVien, KhoaHoc khoaHoc) {
		int khoaHocId = sinhVien.getKhoaHoc().getKhoahoc_id();
		khoaHocService.getKhoaHocById(khoaHocId).orElse(null);
		if (khoaHoc != null) {
			sinhVien.setKhoaHoc(khoaHoc);
			sinhVienService.createSinhVien(sinhVien);
		}
		return "redirect:/sinhvien/listsinhvien";
	}
}
