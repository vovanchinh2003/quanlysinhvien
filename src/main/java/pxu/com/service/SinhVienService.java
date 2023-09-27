package pxu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pxu.com.model.SinhVien;
import pxu.com.repository.SinhVienRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SinhVienService {

	private SinhVienRepository sinhVienRepository;

	@Autowired
	public SinhVienService(SinhVienRepository sinhVienRepository) {
		this.sinhVienRepository = sinhVienRepository;
	}

	public List<SinhVien> getAllSinhVien() {
		return sinhVienRepository.findAll();
	}

	public Optional<SinhVien> getSinhVienById(int id) {
		return sinhVienRepository.findById(id);
	}

	public SinhVien createSinhVien(SinhVien sinhVien) {
		return sinhVienRepository.save(sinhVien);
	}

	public Optional<SinhVien> updateSinhVien(int id, SinhVien sinhVien) {
		if (!sinhVienRepository.existsById(id)) {
			return Optional.empty();
		}
		sinhVien.setSinhvien_id(id);
		return Optional.of(sinhVienRepository.save(sinhVien));
	}

	public boolean deleteSinhVien(int id) {
		if (!sinhVienRepository.existsById(id)) {
			return false;
		}
		sinhVienRepository.deleteById(id);
		return true;
	}
}
