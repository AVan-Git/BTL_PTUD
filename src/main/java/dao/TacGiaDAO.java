package dao;

import java.util.List;

import entity.TacGia;

public interface TacGiaDAO {

	/**
	 * them moot TacGia moi
	 * @param a
	 * @return true and false
	 */
	public boolean themTacGia(TacGia a);
	/**
	 * sua mot TacGia
	 * @param a
	 * @return true and false
	 */
	public boolean suaTacGia(TacGia a);
	/**
	 * xoa mot TacGia theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaTacGia(String maXoa);
	
	/**
	 * danh sach TacGia 
	 * @param tenTim
	 * @return ds TacGia
	 */
	public List<TacGia> getDsTacGia();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoi();
	/**
	 * tim kiem TacGia theo ten
	 * @param tenTim
	 * @return ds TacGia
	 */
	public List<TacGia> getDsTacGia_Ten(List<TacGia> lists , String maTim);
	/**
	 * tim kiem TacGia theo ma 
	 * @param maTim
	 * @return 1 TacGia
	 */
	public TacGia getTacGia_Id(String maTim);
	/**
	 * tim kiem TacGia theo DiaChi
	 * @param diaChiTim
	 * @return ds TacGia
	 */
	public List<TacGia> getDsTacGia_DiaChi(List<TacGia> lists , String diaChiTim);

	/**
	 * tim kiem TacGia theo ngay
	 * @param lists
	 * @param dd
	 * @param mm
	 * @param yy
	 * @return dsTacgia
	 */
	public List<TacGia> getDsTacGia_NgaySinh(List<TacGia> lists, String dd, String mm, String yy);
	/**
	 * hiện số sách hiện có trong cửa hàng của TacGia
	 * @param maNhaXB
	 * @return
	 */
	public int getSoSachHienCoCuaTacGia(String maTacGia);


	
	
}
