package com.laptrinhAPI.SpringBoot.Basic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "trinhdohocvan")
public class TrinhDoEntity extends BaseEntity {

	@Column(name = "tenTdhv")
	private String tenTDHV;
	@Column(name = "chuyennganh")
	private String chuyenNganh;

	// TrinhDoHocVan - NhanVien ;
	@OneToMany
	@JoinColumn(name = "maTdhv")
	private List<NhanVienEntity> nhanVienHV = new ArrayList<>();

	public List<NhanVienEntity> getNhanVienHV() {
		return nhanVienHV;
	}

	public void setNhanVienHV(List<NhanVienEntity> nhanVienHV) {
		this.nhanVienHV = nhanVienHV;
	}

	public String getTenTDHV() {
		return tenTDHV;
	}

	public void setTenTDHV(String tenTDHV) {
		this.tenTDHV = tenTDHV;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

}
