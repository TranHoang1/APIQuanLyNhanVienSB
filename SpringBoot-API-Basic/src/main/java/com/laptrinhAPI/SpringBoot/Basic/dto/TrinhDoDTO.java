package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.util.ArrayList;
import java.util.List;

public class TrinhDoDTO extends BaseDTO {

	private String tenTDHV;
	private String chuyenNganh;

	private List<NhanVienDTO> nhanVienHV = new ArrayList<>();

	public List<NhanVienDTO> getNhanVienHV() {
		return nhanVienHV;
	}

	public void setNhanVienHV(List<NhanVienDTO> nhanVienHV) {
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
