package dao;

import java.util.List;

import entity.TaiKhoan;

public abstract interface TaiKhoanDAO {

	/**
	 * them moot TaiKhoan moi
	 * @param a
	 * @return true and false
	 */
	public boolean themTaiKhoan(TaiKhoan a);
	/**
	 * sua mot TaiKhoan
	 * @param a
	 * @return true and false
	 */
	public boolean suaTaiKhoan(TaiKhoan a);
	/**
	 * xoa mot TaiKhoan theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaTaiKhoan(String maXoa);

	
	/**
	 * danh sach TaiKhoan 
	 * @param tenTim
	 * @return ds TaiKhoan
	 */
	public List<TaiKhoan> getDsTaiKhoan();

	/**
	 * tim kiem TaiKhoan theo ma 
	 * @param maTim
	 * @return 1 TaiKhoan
	 */
	public TaiKhoan getTaiKhoan_Id(String maTim);
	/**
	 * tim kiem TaiKhoan theo ma 
	 * @param maTim
	 * @return 1 TaiKhoan
	 */
	public List<TaiKhoan> getTaiKhoan_maNV(String maNV);



	
	
}
