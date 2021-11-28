package dao;

import java.util.List;

import entity.PhieuChamCong;

public interface PhieuChamCongDAO {

	/**
	 * them moot PhieuChamCong moi
	 * @param a
	 * @return true and false
	 */
	public boolean themPhieuChamCong(PhieuChamCong a);
	/**
	 * sua mot PhieuChamCong
	 * @param a
	 * @return true and false
	 */
	public boolean suaPhieuChamCong(PhieuChamCong a);
	/**
	 * xoa mot PhieuChamCong theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaPhieuChamCong(String maXoa);

	
	
}
