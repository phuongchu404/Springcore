package com.springbootexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sanpham")
public class SanPhamEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long maSP;
	
	@Column(name="tenSP", columnDefinition = "TEXT")
	private String tenSP;
	
	@Column(name="mota", columnDefinition = "TEXT")
	private String moTa;
	
	@Column(name="soLuong")
	private int soLuong;
	
	@Column(name="donGia")
	private Long donGia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maloaiSP")
    private LoaiSPEntity loaiSPs;

	public Long getMaSP() {
		return maSP;
	}


	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public Long getDonGia() {
		return donGia;
	}

	public void setDonGia(Long donGia) {
		this.donGia = donGia;
	}

	public LoaiSPEntity getLoaiSPs() {
		return loaiSPs;
	}

	public void setLoaiSPs(LoaiSPEntity loaiSPs) {
		this.loaiSPs = loaiSPs;
	}

	
	
	
}
