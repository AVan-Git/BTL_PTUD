package dao;

import java.util.List;

import entity.CT_HoaDon;

public abstract interface CT_HoaDonDAO {

	/**
	 * them moot CT_HoaDon moi
	 * @param a
	 * @return true and false
	 */
	public boolean themCT_HoaDon(CT_HoaDon a);
	/**
	 * sua mot CT_HoaDon
	 * @param a
	 * @return true and false
	 */
	public boolean suaCT_HoaDon(CT_HoaDon a);
	/**
	 * xoa mot CT_HoaDon theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaCT_HoaDon(String maXoa);
	
	/**
	 * danh sach CT_HoaDon 
	 * @param tenTim
	 * @return ds CT_HoaDon
	 */
	public List<CT_HoaDon> getDsCT_HoaDon();
	/**
	 * danh sach CT_HoaDon 
	 * @param tenTim
	 * @return ds CT_HoaDon
	 */
	public List<CT_HoaDon> getDsCT_HoaDon(String maHD);





	
	
}
