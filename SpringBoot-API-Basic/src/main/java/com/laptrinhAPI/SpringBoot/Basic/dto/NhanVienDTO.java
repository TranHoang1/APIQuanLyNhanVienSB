package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.util.ArrayList;
import java.util.List;

public class NhanVienDTO extends BaseDTO {

	private String hoTen;

	private String danToc;

	private Integer sdt;

	private HopDongDTO hopdong;

	private PhongBanDTO phongban;

	private TrinhDoDTO trinhdo;

	// NhanVien-ChucVu
	private List<ChucVuDTO> chucvu = new ArrayList<>();

	public List<ChucVuDTO> getChucvu() {
		return chucvu;
	}

	public void setChucvu(List<ChucVuDTO> chucvu) {
		this.chucvu = chucvu;
	}

	public PhongBanDTO getPhongban() {
		return phongban;
	}

	public void setPhongban(PhongBanDTO phongban) {
		this.phongban = phongban;
	}

	public TrinhDoDTO getTrinhdo() {
		return trinhdo;
	}

	public void setTrinhdo(TrinhDoDTO trinhdo) {
		this.trinhdo = trinhdo;
	}

	public HopDongDTO getHopdong() {
		return hopdong;
	}

	public void setHopdong(HopDongDTO hopdong) {
		this.hopdong = hopdong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public Integer getSdt() {
		return sdt;
	}

	public void setSdt(Integer sdt) {
		this.sdt = sdt;
	}
}
