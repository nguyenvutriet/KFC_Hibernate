package model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Invoice {
	@Id
	private int MaHD;
	private Date ThoiGianTT;
	private BigDecimal TongTien;
	private String HinhThucTT;
	private BigDecimal SoTienNhan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Manhanvien")
	private Employee Manhanvien;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Makhachhang")
	private Customer Makhachhang;
	
	@OneToMany(mappedBy = "invoices", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoice_detail> danhSachChiTiet = new ArrayList<Invoice_detail>();
	

	public Invoice(int maHD, Date thoiGianTT, BigDecimal tongTien, String hinhThucTT, BigDecimal soTienNhan,
			Employee manhanvien, Customer makhachhang) {
		super();
		MaHD = maHD;
		ThoiGianTT = thoiGianTT;
		TongTien = tongTien;
		HinhThucTT = hinhThucTT;
		SoTienNhan = soTienNhan;
		Manhanvien = manhanvien;
		Makhachhang = makhachhang;
	}

	public Invoice(int maHD, Date thoiGianTT, BigDecimal tongTien, String hinhThucTT, BigDecimal soTienNhan) {
		super();
		MaHD = maHD;
		ThoiGianTT = thoiGianTT;
		TongTien = tongTien;
		HinhThucTT = hinhThucTT;
		SoTienNhan = soTienNhan;
	}

	public Invoice() {
		super();
	}

	public int getMaHD() {
		return MaHD;
	}

	public void setMaHD(int maHD) {
		MaHD = maHD;
	}

	public Date getThoiGianTT() {
		return ThoiGianTT;
	}

	public void setThoiGianTT(Date thoiGianTT) {
		ThoiGianTT = thoiGianTT;
	}

	public BigDecimal getTongTien() {
		return TongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		TongTien = tongTien;
	}

	public String getHinhThucTT() {
		return HinhThucTT;
	}

	public void setHinhThucTT(String hinhThucTT) {
		HinhThucTT = hinhThucTT;
	}

	public BigDecimal getSoTienNhan() {
		return SoTienNhan;
	}

	public void setSoTienNhan(BigDecimal soTienNhan) {
		SoTienNhan = soTienNhan;
	}

	public Employee getManhanvien() {
		return Manhanvien;
	}

	public void setManhanvien(Employee manhanvien) {
		Manhanvien = manhanvien;
	}

	public Customer getMakhachhang() {
		return Makhachhang;
	}

	public void setMakhachhang(Customer makhachhang) {
		Makhachhang = makhachhang;
	}

	@Override
	public String toString() {
		return "Invoice [MaHD=" + MaHD + ", ThoiGianTT=" + ThoiGianTT + ", TongTien=" + TongTien + ", HinhThucTT="
				+ HinhThucTT + ", SoTienNhan=" + SoTienNhan + ", Manhanvien=" + Manhanvien + ", Makhachhang="
				+ Makhachhang + "]";
	}
	
}
