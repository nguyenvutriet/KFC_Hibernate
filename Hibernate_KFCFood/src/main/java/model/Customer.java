package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int MaKH;
	private String HoTen;
	private String SDT;
	private int  DiemTichLuy;
	
	@OneToMany(mappedBy = "Makhachhang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoice> invoices;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Customer_Promotion", joinColumns = {@JoinColumn(name="Ma_KH")},
											inverseJoinColumns = {@JoinColumn(name="Ma_KM")})
	private Set<Promotion> danhSachPromotion = new HashSet<Promotion>();
	
	public Customer() {
		
	}
	public Customer(int maKH, String hoTen, String sDT, int diemTichLuy) {
		super();
		MaKH = maKH;
		HoTen = hoTen;
		SDT = sDT;
		DiemTichLuy = diemTichLuy;
	}
	public int getMaKH() {
		return MaKH;
	}
	@Override
	public String toString() {
		return "Customer [MaKH=" + MaKH + ", HoTen=" + HoTen + ", SDT=" + SDT + ", DiemTichLuy=" + DiemTichLuy + "]";
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public int getDiemTichLuy() {
		return DiemTichLuy;
	}
	public void setDiemTichLuy(int diemTichLuy) {
		DiemTichLuy = diemTichLuy;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	public void addDSPromotion(Promotion p) {
		this.danhSachPromotion.add(p);
	}
	
}
