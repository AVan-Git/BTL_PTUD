package dao;

import java.util.List;

import entity.HoaDon;

public abstract interface HoaDonDAO {

	/**
	 * them moot HoaDon moi
	 * @param a
	 * @return true and false
	 */
	public boolean themHoaDon(HoaDon a);
	/**
	 * sua mot HoaDon
	 * @param a
	 * @return true and false
	 */
	public boolean suaHoaDon(HoaDon a);
	/**
	 * xoa mot HoaDon theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaHoaDon(String maXoa);
	
	/**
	 * danh sach HoaDon 
	 * @param tenTim
	 * @return ds HoaDon
	 */
	public List<HoaDon> getDsHoaDon();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoi();

	/**
	 * tim kiem HoaDon theo ma 
	 * @param maTim
	 * @return 1 HoaDon
	 */
	public HoaDon getHoaDon_Id(String maTim);
	public int soHoaDon_MocTG(String date);
	public int soHoaDon_KhoangTG(String date1, String date2);



	
	
}
