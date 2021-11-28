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

		nhanvienDAO = new NhanvienImpl();
		
		System.out.println("Complete!");
		

		taiKhoanDAO = new TaiKhoanImpl();
	
		taiKhoanDAO.getDsTaiKhoan().forEach(tk -> System.out.println(tk));



	}

}
