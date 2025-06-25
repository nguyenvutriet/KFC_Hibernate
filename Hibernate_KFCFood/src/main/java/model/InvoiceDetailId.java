package model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class InvoiceDetailId implements Serializable {
	private int MaHoaDon;
	private int MaSanPham;
	public InvoiceDetailId(int maHoaDon, int maSanPham) {
		super();
		MaHoaDon = maHoaDon;
		MaSanPham = maSanPham;
	}
	public InvoiceDetailId() {
		super();
	}
	public int getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public int getMaSanPham() {
		return MaSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		MaSanPham = maSanPham;
	}
	
}
