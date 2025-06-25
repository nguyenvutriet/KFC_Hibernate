package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Promotion {
	@Id
	private int MaKM;
	private String DieuKien;
	private BigDecimal MucGiamGia;
	
	@ManyToMany(mappedBy = "danhSachPromotion")
	private Set<Customer> danhSachKhachHang = new HashSet<Customer>();
	
	
	public Promotion(int maKM, String dieuKien, BigDecimal mucGiamGia) {
		super();
		MaKM = maKM;
		DieuKien = dieuKien;
		MucGiamGia = mucGiamGia;
	}
	public Promotion() {
		super();
	}
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	public String getDieuKien() {
		return DieuKien;
	}
	public void setDieuKien(String dieuKien) {
		DieuKien = dieuKien;
	}
	public BigDecimal getMucGiamGia() {
		return MucGiamGia;
	}
	public void setMucGiamGia(BigDecimal mucGiamGia) {
		MucGiamGia = mucGiamGia;
	}
	
}
