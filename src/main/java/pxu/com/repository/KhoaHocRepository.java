package pxu.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pxu.com.model.KhoaHoc;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Long> {


}
