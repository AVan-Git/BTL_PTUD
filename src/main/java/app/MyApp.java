package app;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import dao.HoaDonDAO;
import dao.NhanvienDAO;
import dao.TaiKhoanDAO;
import dao.impl.HoaDonImpl;
import dao.impl.KhachHangImpl;
import dao.impl.NhaXuatBanImpl;
import dao.impl.SachImpl;
import dao.impl.TacGiaImpl;
import entity.HoaDon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import report.Report_PDF;

public class MyApp {

	private static KhachHangImpl khachHangDAO;
	private static SachImpl sachDAO;
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

//		sachDAO = new SachImpl();
//		System.out.println("Complete!");
//
//		Map<String, Integer> map = sachDAO.getSoLuongSachDaBan();
//		System.out.println("");
//		
//		map.entrySet().iterator().forEachRemaining((value) -> {
//			System.out.println(value.getKey());
//			System.out.println(value.getValue());
//		});
		
		Report_PDF report_PDF = new Report_PDF();
		
		try {
//			report_PDF.rp_HoaDon_TheoNgay("2021-12-04%");
//			report_PDF.rp_ChiTietHoaDon("HD00016");
			report_PDF.rp_HoaDon_TheoThang("2021-11%");
			
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

//
	public static void XuatHoaDon(String maHD) throws JRException, SQLException {
		JasperReport jasperReport = JasperCompileManager
				.compileReport("D:/khaiThacDL/test_java/baoCao/rpCT_HoaDon.jrxml");

		// Tham số truyền vào báo cáo.
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("value_maHD", maHD);

		// DataSource
		// Đây là báo cáo đơn giản, không kết nối vào DB
		// vì vậy không cần nguồn dữ liệu.
//	JRDataSource dataSource = new JREmptyDataSource();

		String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
		String user = "sa";
		String password = "sapassword";

		Connection con = DriverManager.getConnection(url, user, password);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

		// Đảm bảo thư mục đầu ra tồn tại.
		File outDir = new File("D:/Bin");
		outDir.mkdirs();

		// Chạy báo cáo và export ra file PDF.
		JasperExportManager.exportReportToPdfFile(jasperPrint, "D:/Bin/TextReport.pdf");

		System.out.println("Done!");

	}
}
