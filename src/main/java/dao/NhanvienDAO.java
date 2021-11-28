package dao;

import java.util.List;

import entity.KhachHang;
import entity.NhanVien;

public abstract interface NhanvienDAO {

	/**
	 * them moot NhanVien moi
	 * @param a
	 * @return true and false
	 */
	public boolean themNhanVien(NhanVien a);
	/**
	 * sua mot NhanVien
	 * @param a
	 * @return true and false
	 */
	public boolean suaNhanVien(NhanVien a);
	/**
	 * xoa mot NhanVien theo ma
	 * @param a
	 * @return T | F
	 */
	public boolean xoaNhanVien(String maXoa);
	/**
	 * tim kiem NhanVien theo ma 
	 * @param maTim
	 * @return 1 NhanVien
	 */
	public NhanVien timKiem_id(String maTim);
	
	/**
	 * tim kiem NhanVien theo so DT
	 * @param soDT
	 * @return 1 NhanVien
	 */
	public List<NhanVien> getDsNhanVien_soDT(List<NhanVien> lists , String maTim);
	/**
	 * tim kiem KhachHang theo ten
	 * @param tenTim
	 * @return ds NhanVien
	 */
	public 	List<NhanVien> getDsNhanVien_Ten(List<NhanVien> lists, String maTim);
	/**
	 * danh sach NhanVien 
	 * @param tenTim
	 * @return ds NhanVien
	 */
	public List<NhanVien> getDsNhanVien();
	/**
	 * tra về ma cuoi cung trong bang
	 * @return
	 */
	public String getMaCuoiNV();
	/**
	 * danh sach NhanVien 
	 * @param tenTim
	 * @return ds NhanVien
	 */
	public List<NhanVien> getDsNhanVien_DiaChi(List<NhanVien> lists , String DiaChiTim);
	/**
	 * tim kiem NhanVien theo ngaySinh
	 * @param tenTim
	 * @return ds NhanVien
	 */
	public List<NhanVien> getDsNhanVien_NgaySinh(List<NhanVien> lists , String dd, String mm, String yy);
	/**
	 * tim kiem NhanVien theo Email
	 * @param lists
	 * @param maTim
	 * @return
	 */
	public List<NhanVien> getDsNhanVien_Calam(List<NhanVien> lists , String cb);
	/**
	 * tim kiem NhanVien theo mã người quản lý
	 * @param maTim
	 * @return 1 NhanVien
	 */
	public NhanVien getNhanVien_TaiKhoan(String tk);
	public int soNhanVienDuocQL(String maNV);
//	public List<NhanVien> getDsNhanVien_NguoiQL(String maNguoiQL);
	public List<NhanVien> getDsNhanVien_0_NguoiQL();
	
	


	
	
}
