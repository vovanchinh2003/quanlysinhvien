package pxu.com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "khoahoc")
public class KhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int khoahoc_id;
	private String tenKhoaHoc;

	@OneToMany(mappedBy = "sinhvien_id")
	private List<SinhVien> sinhViens;

	public int getKhoahoc_id() {
		return khoahoc_id;
	}

	public void setKhoahoc_id(int khoahoc_id) {
		this.khoahoc_id = khoahoc_id;
	}

	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}

	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}

	public List<SinhVien> getSinhViens() {
		return sinhViens;
	}

	public void setSinhViens(List<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

	public KhoaHoc(int khoahoc_id, String tenKhoaHoc, List<SinhVien> sinhViens) {
		super();
		this.khoahoc_id = khoahoc_id;
		this.tenKhoaHoc = tenKhoaHoc;
		this.sinhViens = sinhViens;
	}

	public KhoaHoc() {
		super();
	}

}
