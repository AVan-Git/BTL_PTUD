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
				.compileReport("D:/khaiThacDL/test_java/baoCao/rpCT_HoaDon.jrxml");

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
}