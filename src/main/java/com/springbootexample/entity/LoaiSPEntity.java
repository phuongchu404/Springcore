package com.springbootexample.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loaiSP")
public class LoaiSPEntity extends BaseEntity{

	@Id
	/* @Column(name="maloaiSP") */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long maLoaiSP;
	
	@Column(name="tenloaiSP")
	private String tenLoaiSP;
	
	@OneToMany(mappedBy = "loaiSPs")
	private List<SanPhamEntity> sanphams = new ArrayList<>();

	public String getTenLoaiSP() {
		return tenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}

	public List<SanPhamEntity> getSanphams() {
		return sanphams;
	}

	public void setSanphams(List<SanPhamEntity> sanphams) {
		this.sanphams = sanphams;
	}

	public Long getMaLoaiSP() {
		return maLoaiSP;
	}
	
	
}
