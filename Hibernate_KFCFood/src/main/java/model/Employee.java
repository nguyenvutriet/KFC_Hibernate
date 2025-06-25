package model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int MaNV;
	private String TenNV;
	private String ChucVu;
	private String SDT;
	private Date NgayBatDau;
	
	@OneToMany(mappedBy = "Manhanvien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoice> danhSachHD;
	
	
	public Employee(int maNV, String tenNV, String chucVu, String sDT, Date ngayBatDau) {
		super();
		MaNV = maNV;
		TenNV = tenNV;
		ChucVu = chucVu;
		SDT = sDT;
		NgayBatDau = ngayBatDau;
	}
	public Employee() {
		super();
	}
	public int getMaNV() {
		return MaNV;
	}
	public void setMaNV(int maNV) {
		MaNV = maNV;
	}
	public String getTenNV() {
		return TenNV;
	}
	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}
	public String getChucVu() {
		return ChucVu;
	}
	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public Date getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}
	@Override
	public String toString() {
		return "Employee [MaNV=" + MaNV + ", TenNV=" + TenNV + ", ChucVu=" + ChucVu + ", SDT=" + SDT + ", NgayBatDau="
				+ NgayBatDau + "]";
	}
	
}
