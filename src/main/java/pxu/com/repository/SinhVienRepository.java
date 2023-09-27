package pxu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pxu.com.model.SinhVien;


@Repository("sinhVienRepository")
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {

}
