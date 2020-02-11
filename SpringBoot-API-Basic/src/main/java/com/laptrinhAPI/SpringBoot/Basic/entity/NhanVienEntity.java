package com.laptrinhAPI.SpringBoot.Basic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity extends BaseEntity {

	@Column(name = "hoten")
	private String hoTen;

	@Column(name = "dantoc")
	private String danToc;

	@Column(name = "sdt")
	private Integer sdt;

	// Nhan vien - hop dong lao dong ;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maHdld", referencedColumnName = "id")
	private HopDongEntity hopdong;

	// NhanVien-PhongBan ;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ma_pb")
	private PhongBanEntity phongban;

	// NhanVien-TrinhDoHocVan ;
	@ManyToOne
	@JoinColumn(name = "maTdhv")
	private TrinhDoEntity trinhdo;

	// NhanVien-ChucVu
	@ManyToMany
	@JoinTable(name = "nv_cv", joinColumns = @JoinColumn(name = "nhanvienid"), inverseJoinColumns = @JoinColumn(name = "chucvuid"))
	private List<ChucVuEntity> chucvu = new ArrayList<>();

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

	public HopDongEntity getHopdong() {
		return hopdong;
	}

	public void setHopdong(HopDongEntity hopdong) {
		this.hopdong = hopdong;
	}

	public PhongBanEntity getPhongban() {
		return phongban;
	}

	public void setPhongban(PhongBanEntity phongban) {
		this.phongban = phongban;
	}

	public TrinhDoEntity getTrinhdo() {
		return trinhdo;
	}

	public void setTrinhdo(TrinhDoEntity trinhdo) {
		this.trinhdo = trinhdo;
	}

	public List<ChucVuEntity> getChucvu() {
		return chucvu;
	}

	public void setChucvu(List<ChucVuEntity> chucvu) {
		this.chucvu = chucvu;
	}

}
