package com.laptrinhAPI.SpringBoot.Basic.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hopdonglaodong")
public class HopDongEntity extends BaseEntity {

	@Column(name = "loaihopdong")
	private String loaiHD;
	@Column(name = "tungay")
	private Date tuNgay;
	@Column(name = "denngay")
	private Date denNgay;

	@OneToOne(mappedBy = "hopdong")
	private NhanVienEntity nhanvienHD;

	public String getLoaiHD() {
		return loaiHD;
	}

	public NhanVienEntity getNhanvienHD() {
		return nhanvienHD;
	}

	public void setNhanvienHD(NhanVienEntity nhanvienHD) {
		this.nhanvienHD = nhanvienHD;
	}

	public void setLoaiHD(String loaiHD) {
		this.loaiHD = loaiHD;
	}

	public Date getTuNgay() {
		return tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	public Date getDenNgay() {
		return denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

}
