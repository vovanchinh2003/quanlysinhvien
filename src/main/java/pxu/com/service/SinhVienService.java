package pxu.com.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pxu.com.model.SinhVien;
import pxu.com.repository.SinhVienRepository;

@Service
public class SinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Transactional
    public List<SinhVien> getSinhViens() {
        return sinhVienRepository.findAll();
    }

    @Transactional
    public void saveSinhVien(SinhVien theSinhVien) {
        sinhVienRepository.save(theSinhVien);
    }

    @Transactional
    public Optional<SinhVien> getSinhVien(Long theId) {
        return sinhVienRepository.findById(theId);
    }

    @Transactional
    public void deleteSinhVien(Long theId) {
        sinhVienRepository.deleteById(theId);
    }
    public Optional<SinhVien> updatesinhvien(Long id, SinhVien sinhVien) {
		if (!sinhVienRepository.existsById(id)) {
			return Optional.empty();
		}
		sinhVien.setId(id);
		return Optional.of(sinhVienRepository.save(sinhVien));
	}
}
