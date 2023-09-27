package pxu.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pxu.com.model.KhoaHoc;
import pxu.com.repository.KhoaHocRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KhoaHocService {

	private KhoaHocRepository khoaHocRepository;

	@Autowired
	public KhoaHocService(KhoaHocRepository khoaHocRepository) {
		this.khoaHocRepository = khoaHocRepository;
	}

	public List<KhoaHoc> getAllKhoaHoc() {
		return khoaHocRepository.findAll();
	}

	public Optional<KhoaHoc> getKhoaHocById(int id) {
		return khoaHocRepository.findById(id);
	}

	public KhoaHoc createKhoaHoc(KhoaHoc khoaHoc) {
		return khoaHocRepository.save(khoaHoc);
	}
	

	public Optional<KhoaHoc> updateKhoaHoc(int id, KhoaHoc khoaHoc) {
		if (!khoaHocRepository.existsById(id)) {
			return Optional.empty();
		}
		khoaHoc.setKhoahoc_id(id);
		return Optional.of(khoaHocRepository.save(khoaHoc));
	}

	public boolean deleteKhoaHoc(int id) {
		if (!khoaHocRepository.existsById(id)) {
			return false;
		}
		khoaHocRepository.deleteById(id);
		return true;
	}
}
