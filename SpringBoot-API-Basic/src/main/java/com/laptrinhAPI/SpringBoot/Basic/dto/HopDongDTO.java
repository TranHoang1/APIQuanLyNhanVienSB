package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.sql.Date;

public class HopDongDTO extends BaseDTO {

	private String loaiHD;
	private Date tuNgay;
	private Date denNgay;

	private NhanVienDTO nhanvienHD;

	public String getLoaiHD() {
		return loaiHD;
	}

	public NhanVienDTO getNhanvienHD() {
		return nhanvienHD;
	}

	public void setNhanvienHD(NhanVienDTO nhanvienHD) {
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
