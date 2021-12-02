package app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.JOptionPane;

import dao.HoaDonDAO;
import dao.NhaXuatBanDAO;
import dao.NhanvienDAO;
import dao.TacGiaDAO;
import dao.TaiKhoanDAO;
import dao.impl.HoaDonImpl;
import dao.impl.KhachHangImpl;
import dao.impl.NhaXuatBanImpl;
import dao.impl.NhanvienImpl;
import dao.impl.SachImpl;
import dao.impl.TacGiaImpl;
import dao.impl.TaiKhoanImpl;
import entity.HoaDon;
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
	private static HoaDonDAO hoaDonDAO;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

//		nhanvienDAO = new NhanvienImpl();
//		
//		System.out.println("Complete!");
//        NhanVien a = new NhanVien("NV00001", "System Admin", new Date(2001 - 1900, 01, 01), "0123456789", "Việt Nam", -1);
//        System.out.println(a);
//
//        
//        if (nhanvienDAO.suaNhanVien(a)) {
//			System.out.println("TRUE");
//		}
//        else System.out.println("False");
		
		hoaDonDAO = new HoaDonImpl();
		System.out.println("Complete!");
		List<HoaDon> dsHoaDon = hoaDonDAO.getDsHoaDon();
		for (HoaDon hd : dsHoaDon) {
			if (hd.getNgaylap().getMonth() == getHienTai().getMonth()) {
				System.out.println(hd);
			}
//			if (hd.getNgaylap().compareTo(getHienTai()) == 0) {
//				System.out.println(hd);
//			}
		}

	}
//	
	private static Date getHienTai() {
		GregorianCalendar gcalendar = new GregorianCalendar();

		int dd = gcalendar.get(Calendar.DATE);
		int mm = gcalendar.get(Calendar.MONTH);
		int yy = gcalendar.get(Calendar.YEAR);
		Date a = new Date(yy - 1900, mm, dd);
		return a;
	}


}
