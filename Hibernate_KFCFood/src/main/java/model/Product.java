package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	private int MaSP;
	private String TenSP;
	private String TinhTrang;
	private BigDecimal DonGia;
	
	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoice_detail> danhSachChiTietSP = new ArrayList<Invoice_detail>();
	
	public Product(int maSP, String tenSP, String tinhTrang, BigDecimal donGia) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		TinhTrang = tinhTrang;
		DonGia = donGia;
	}
	public Product() {
		super();
	}
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public BigDecimal getDonGia() {
		return DonGia;
	}
	public void setDonGia(BigDecimal donGia) {
		DonGia = donGia;
	}
	@Override
	public String toString() {
		return "Product [MaSP=" + MaSP + ", TenSP=" + TenSP + ", TinhTrang=" + TinhTrang + ", DonGia=" + DonGia + "]";
	}
	
}
