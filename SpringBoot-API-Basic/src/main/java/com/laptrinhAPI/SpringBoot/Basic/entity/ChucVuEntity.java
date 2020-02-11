package com.laptrinhAPI.SpringBoot.Basic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "chucvu")
@Entity
public class ChucVuEntity extends BaseEntity {

	@Column(name = "tencv")
	private String tenCV;

	@ManyToMany(mappedBy = "chucvu")
	private List<NhanVienEntity> nhanvienCv = new ArrayList<>();

	public List<NhanVienEntity> getNhanvienCv() {
		return nhanvienCv;
	}

	public void setNhanvienCv(List<NhanVienEntity> nhanvienCv) {
		this.nhanvienCv = nhanvienCv;
	}

	public String getTenCV() {
		return tenCV;
	}

	public void setTenCV(String tenCV) {
		this.tenCV = tenCV;
	}

}
