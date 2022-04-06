package com.springbootexample.dto;

public class SanPhamDTO extends AbstractDTO<SanPhamDTO> {

	private Long maSP;

	private Long maLoaiSP;

	private String tenSP;

	private String moTa;

	private int soLuong;

	private Long donGia;

	private Long maloaiSP;

	public Long getMaSP() {
		return maSP;
	}

	public void setMaSP(Long maSP) {
		this.maSP = maSP;
	}

	public Long getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(Long maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
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

	public Long getMaloaiSP() {
		return maloaiSP;
	}

	public void setMaloaiSP(Long maloaiSP) {
		this.maloaiSP = maloaiSP;
	}

	
}
