package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.util.ArrayList;
import java.util.List;

public class PhongBanDTO extends BaseDTO {

	private String tenPB;
	private String sdthPB;
	private String diaChi;

	private List<NhanVienDTO> nhanVienPB = new ArrayList<>();

	public List<NhanVienDTO> getNhanVienPB() {
		return nhanVienPB;
	}

	public void setNhanVienPB(List<NhanVienDTO> nhanVienPB) {
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
