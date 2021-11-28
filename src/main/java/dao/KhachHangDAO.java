package dao;

import java.util.Date;
import java.util.List;

import entity.KhachHang;

public abstract interface KhachHangDAO {

	/**
	 * them moot KhachHang moi
	 * @param a
	 * @return true and false
	 */
	public boolean themKhachHang(KhachHang a);
	/**
	 * sua mot KhachHang
	 * @param a
	 * @return true and false
	 */
	public boolean suaKhachHang(KhachHang a);
	/**
	 * xoa mot KhachHang theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaKhachHang(String maXoa);
	/**
	 * tim kiem KhachHang theo ma 
	 * @param maTim
	 * @return 1 KhachHang
	 */
	public KhachHang timKiem_id(String maTim);
	/**
	 * tim kiem KhachHang theo so DT
	 * @param soDT
	 * @return 1 KhachHang
	 */
	public List<KhachHang> getDsKhachHang_soDT(List<KhachHang> lists , String maTim);
	/**
	 * danh sach KhachHang 
	 * @param tenTim
	 * @return ds KhachHang
	 */
	public List<KhachHang> getDsKhachHang();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoi();
	/**
	 * tim kiem KhachHang theo ten
	 * @param tenTim
	 * @return ds KhachHang
	 */
	public List<KhachHang> getDsKhachHang_Ten(List<KhachHang> lists , String maTim);
	/**
	 * tim kiem KhachHang theo Dia Chi
	 * @param tenTim
	 * @return ds KhachHang
	 */
	public List<KhachHang> getDsKhachHang_DiaChi(List<KhachHang> lists , String DiaChiTim);
	/**
	 * tim kiem KhachHang theo ngaySinh
	 * @param tenTim
	 * @return ds KhachHang
	 */
	public List<KhachHang> getDsKhachHang_NgaySinh(List<KhachHang> lists , String dd, String mm, String yy);
	/**
	 * tim kiem KhachHang theo Email
	 * @param lists
	 * @param maTim
	 * @return
	 */
	public List<KhachHang> getDsKhachHang_Email(List<KhachHang> lists , String emailTim);
	
	public KhachHang getKhachHang_SoDT(String soDTTim);


	
	
}
