package pxu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pxu.com.model.KhoaHoc;
import pxu.com.model.SinhVien;


@Repository("khoaHocRepository")
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Integer> {

}
