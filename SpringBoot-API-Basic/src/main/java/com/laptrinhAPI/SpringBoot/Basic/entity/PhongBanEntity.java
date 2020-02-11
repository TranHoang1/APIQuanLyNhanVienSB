package com.laptrinhAPI.SpringBoot.Basic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "phongban")
public class PhongBanEntity extends BaseEntity {

	@Column(name = "tenPb")
	private String tenPB;
	@Column(name = "sdtPb")
	private String sdthPB;
	@Column(name = "diaChi")
	private String diaChi;

	@OneToMany(mappedBy = "phongban")
	private List<NhanVienEntity> nhanVienPB = new ArrayList<>();

	public List<NhanVienEntity> getNhanVienPB() {
		return nhanVienPB;
	}

	public void setNhanVienPB(List<NhanVienEntity> nhanVienPB) {
		this.nhanVienPB = nhanVienPB;
	}

	public String getTenPB() {
		return tenPB;
	}

	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	public String getSdthPB() {
		return sdthPB;
	}

	public void setSdthPB(String sdthPB) {
		this.sdthPB = sdthPB;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

}
