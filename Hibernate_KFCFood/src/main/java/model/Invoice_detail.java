package model;

import java.math.BigDecimal;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Invoice_detail {
	
	@EmbeddedId
	private InvoiceDetailId id;
	
	private int SoLuong;
	private BigDecimal ThanhTien;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("MaHoaDon")
	@JoinColumn(name="MaHoaDon")
	private Invoice invoices;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("MaSanPham")
	@JoinColumn(name="MaSanPham")
	private Product products;
}
