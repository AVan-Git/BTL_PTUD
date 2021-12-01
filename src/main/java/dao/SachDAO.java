package dao;

import java.util.List;

import entity.NhaXuatBan;
import entity.Sach;
import entity.TacGia;

public abstract interface SachDAO {

	/**
	 * them moot Sach moi
	 * @param a
	 * @return true and false
	 */
	public boolean themSach(Sach a);
	/**
	 * sua mot Sach
	 * @param a
	 * @return true and false
	 */
	public boolean suaSach(Sach a);
	/**
	 * xoa mot Sach theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaSach(String maXoa);
	/**
	 * tim kiem Sach theo ma 
	 * @param maTim
	 * @return 1 Sach
	 */
	public Sach getSach_id(String maTim);
	/**
	 * danh sach Sach 
	 * @param tenTim
	 * @return ds Sach
	 */
	public List<Sach> getDsSach();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoi();
	/**
	 * tim kiem Sach theo ten
	 * @param tenTim
	 * @return ds Sach
	 */
	public List<Sach> getDsSach_Ten(List<Sach> lists , String tenTim);

	/**
	 * Xuuat danh sách nhưng nhà suất bản có trong hiệu sách
	 * @return ds NhaXuatBan
	 */
	public List<NhaXuatBan> getDsNhaXB();
	/**
	 * Xuuat danh sách nhưng nhà TacGia có trong hiệu sách
	 * @return ds TacGia
	 */
	public List<TacGia> getDsTacGia();

	public List<Sach> getDsSach_TheLoai(List<Sach> lists , String theLoaiTim);
	public List<Sach> getDsSach_TacGia(List<Sach> lists , String tacGiaTim);
	public List<Sach> getDsSach_NhaXB(List<Sach> lists , String nhaXBTim);

	public List<String> getDsLoaiSach();




	
	
}
