package dao;

import java.util.Date;
import java.util.List;

import entity.NhaXuatBan;

public interface NhaXuatBanDAO {

	/**
	 * them moot NhaXuatBan moi
	 * @param a
	 * @return true and false
	 */
	public boolean themNhaXuatBan(NhaXuatBan a);
	/**
	 * sua mot NhaXuatBan
	 * @param a
	 * @return true and false
	 */
	public boolean suaNhaXuatBan(NhaXuatBan a);
	/**
	 * xoa mot NhaXuatBan theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaNhaXuatBan(String maXoa);
	
	/**
	 * danh sach NhaXuatBan 
	 * @param tenTim
	 * @return ds NhaXuatBan
	 */
	public List<NhaXuatBan> getDsNhaXuatBan();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoi();
	/**
	 * tim kiem NhaXuatBan theo ten
	 * @param tenTim
	 * @return ds NhaXuatBan
	 */
	public List<NhaXuatBan> getDsNhaXuatBan_Ten(List<NhaXuatBan> lists , String maTim);
	/**
	 * tim kiem NhaXuatBan theo ma 
	 * @param maTim
	 * @return 1 NhaXuatBan
	 */
	public NhaXuatBan getDsNhaXuatBan_Id(String maTim);
	/**
	 * tim kiem NhaXuatBan theo DiaChi
	 * @param tenTim
	 * @return ds NhaXuatBan
	 */
	public List<NhaXuatBan> getDsNhaXuatBan_DiaChi(List<NhaXuatBan> lists , String diaChiTim);
	/**
	 * hiện số sách hiện có trong cửa hàng của NhaXuatBan
	 * @param maNhaXB
	 * @return
	 */
	public int getSoSachHienCoCuaNhaXB(String maNhaXB);
	
	


	
	
}
