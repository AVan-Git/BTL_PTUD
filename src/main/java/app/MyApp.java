package app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import dao.NhaXuatBanDAO;
import dao.NhanvienDAO;
import dao.TacGiaDAO;
import dao.TaiKhoanDAO;
import dao.impl.KhachHangImpl;
import dao.impl.NhaXuatBanImpl;
import dao.impl.NhanvienImpl;
import dao.impl.SachImpl;
import dao.impl.TacGiaImpl;
import dao.impl.TaiKhoanImpl;
import entity.KhachHang;
import entity.NhaXuatBan;
import entity.NhanVien;
import entity.Sach;
import entity.TacGia;
import entity.TaiKhoan;

public class MyApp {

	private static KhachHangImpl khachHangDAO;
	private static SachImpl sachDAO ;
	private static TacGiaImpl tacGiaDAO;
	private static NhaXuatBanImpl nhaXuatBanDAO;
	private static NhanvienDAO nhanvienDAO;
	private static TaiKhoanDAO taiKhoanDAO;

	public static void main(String[] args) {

		sachDAO = new SachImpl();
		
		System.out.println("Complete!");
		
		List<String> list = sachDAO.getDsLoaiSach();
		if (list.size() > 0) {
			for (String a : list) {
				System.out.println(a);
			}
			
		}
		




	}

}
