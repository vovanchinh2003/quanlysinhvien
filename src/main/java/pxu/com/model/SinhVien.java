package pxu.com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "sinhvien")
public class SinhVien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sinhvien_id;
	private String hoTen;
	private Date ngaySinh;
	private String diaChiHienTai;
	private String cccd;
	private String gioiTinh;
	private String queQuan;

	@ManyToOne
	@JoinColumn(name = "khoahoc_id")
	private KhoaHoc khoaHoc;

	public SinhVien() {
		super();
	}

	public int getSinhvien_id() {
		return sinhvien_id;
	}

	public void setSinhvien_id(int sinhvien_id) {
		this.sinhvien_id = sinhvien_id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChiHienTai() {
		return diaChiHienTai;
	}

	public void setDiaChiHienTai(String diaChiHienTai) {
		this.diaChiHienTai = diaChiHienTai;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public SinhVien(int sinhvien_id, String hoTen, Date ngaySinh, String diaChiHienTai, String cccd, String gioiTinh,
			String queQuan, KhoaHoc khoaHoc) {
		super();
		this.sinhvien_id = sinhvien_id;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChiHienTai = diaChiHienTai;
		this.cccd = cccd;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.khoaHoc = khoaHoc;
	}

}
