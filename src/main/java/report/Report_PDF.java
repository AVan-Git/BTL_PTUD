package report;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import constant.Value;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class Report_PDF {

	public Report_PDF() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void rp_ChiTietHoaDon(String maHD) throws JRException, SQLException {
		JasperReport jasperReport = JasperCompileManager
				.compileReport("./baoCao/rpCT_HoaDon.jrxml");

		// Tham số truyền vào báo cáo.
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("value_maHD", maHD);

		// DataSource
		// Đây là báo cáo đơn giản, không kết nối vào DB
		// vì vậy không cần nguồn dữ liệu.
		//	JRDataSource dataSource = new JREmptyDataSource();

		String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
		String user = Value.user;
		String password = Value.password;

		Connection con = DriverManager.getConnection(url, user, password);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

		// Đảm bảo thư mục đầu ra tồn tại.
		File outDir = new File(Value.linkSave);
		outDir.mkdirs();

		String linkSave = Value.linkSave+"/Xuat"+ maHD + ".pdf";

		// Chạy báo cáo và export ra file PDF.
		JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

		System.out.println("Done!");
	}
//	
	public void rp_HoaDon_TheoNgay(String ngayHT) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_HoaDonNgayHT.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date1", ngayHT);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_TheoNgay.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
//	
	public void rp_HoaDon_TheoThang(String thangString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_HoaDonThang.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", thangString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_TheoThang.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
//	
	public void rp_HoaDon_TheoNam(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_HoaDon_Nam.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("value1", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_TheoNam.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
//
	public void rp_NVTheoDoanhThu_Nam(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoNV_Nam.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsNVTheoDoanhThu_Nam.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
	//
	public void rp_NVTheoDoanhThu_Thang(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoNV_Thang.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsNVTheoDoanhThu_Thang.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
	//
	public void rp_NVTheoDoanhThu_Ngay(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoNV_Ngay.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsNVTheoDoanhThu_Ngay.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
//
	//
	public void rp_KHTheoDoanhThu_Nam(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoHK_Nam.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsKHTheoDoanhThu_Nam.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
	//
	public void rp_KHTheoDoanhThu_Thang(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoHK_Thang.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsKHTheoDoanhThu_Thang.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
	//
	public void rp_KHTheoDoanhThu_Ngay(String namString) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoHK_Ngay.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", namString);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsKHTheoDoanhThu_Ngay.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}

	//
	public void rp_KHTheoDoanhThu_KTG(String ngayBD, String ngayKT) throws JRException, SQLException {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("./baoCao/rp_DoanhThuTheoHK_KTG.jrxml");

			// Tham số truyền vào báo cáo.
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("date", ngayBD);
			parameters.put("date2", ngayKT);

			String url = "jdbc:sqlserver://localhost:1433;databasename=QLCuaHangSach";
			String user = Value.user;
			String password = Value.password;

			Connection con = DriverManager.getConnection(url, user, password);

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);

			// Đảm bảo thư mục đầu ra tồn tại.
			File outDir = new File(Value.linkSave);
			outDir.mkdirs();

			String linkSave = Value.linkSave+"/Report_dsKHTheoDoanhThu_KhoanTG.pdf";
			// Chạy báo cáo và export ra file PDF.
			JasperExportManager.exportReportToPdfFile(jasperPrint, linkSave);

			System.out.println("Done!");

	}
//
	
}
