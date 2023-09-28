package pxu.com.controller;

import java.util.List;
import java.util.Optional;

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
		List<SinhVien> sinhViens = sinhVienService.getSinhViens();
		model.addAttribute("sinhViens", sinhViens);
		return "listsinhvien";
	}

	@GetMapping("/showformsinhvien")
	public String showForm(Model model) {
		List<KhoaHoc> listKhoaHoc = khoaHocService.getKhoaHocs();
		model.addAttribute("sinhVien", new SinhVien());
		model.addAttribute("listKhoaHoc", listKhoaHoc);
		return "formsinhvienn";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("sinhvienId") Long id) throws ResourceNotFoundException {
		sinhVienService.deleteSinhVien(id);
		return "redirect:/sinhvien/listsinhvien";
	}

	@PostMapping("/savesinhvien")
	public String savesinhvien(@ModelAttribute("sinhVien") SinhVien sinhVien) {
		sinhVienService.saveSinhVien(sinhVien);
		return "redirect:/sinhvien/listsinhvien";
	}

	@GetMapping("/updatesinhvien")
	public String showFormForUpdate(@RequestParam("sinhvienId") Long id, Model theModel)
			throws ResourceNotFoundException {
		Optional<SinhVien> sinhvien = sinhVienService.getSinhVien(id);
		List<KhoaHoc> listKhoaHoc = khoaHocService.getKhoaHocs();
		theModel.addAttribute("listKhoaHoc", listKhoaHoc);
		theModel.addAttribute("sinhvien", sinhvien);
		return "updatesinhvien";
	}

//	@PostMapping("/editsinhvien")
//	public String updateisnhvien(@ModelAttribute("sinhvienId") SinhVien sinhVien) {
//		khoaHocService.updateKhoaHoc(khoaHoc.getId(), khoaHoc);
//		return "redirect:/khoahoc/listkhoahoc";
//	}

}
