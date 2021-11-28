package connect;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import entity.CT_HoaDon;
import entity.CT_HoaDonPK;
import entity.CT_PhieuNhap;
import entity.CT_PhieuNhapPK;
import entity.DonDat;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhaXuatBan;
import entity.NhanVien;
import entity.PhieuChamCong;
import entity.PhieuNhap;
import entity.Sach;
import entity.TacGia;
import entity.TaiKhoan;

public class DatabaseSQL {
	private SessionFactory sessionFactory;
	private static DatabaseSQL instance = null;

	private  DatabaseSQL() {

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure()
				.build();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(NhanVien.class)
				.addAnnotatedClass(TaiKhoan.class)
				.addAnnotatedClass(PhieuChamCong.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(CT_HoaDon.class)
				.addAnnotatedClass(CT_HoaDonPK.class)
				.addAnnotatedClass(PhieuNhap.class)
				.addAnnotatedClass(CT_PhieuNhap.class)
				.addAnnotatedClass(CT_PhieuNhapPK.class)
				.addAnnotatedClass(DonDat.class)
				.addAnnotatedClass(Sach.class)
				.addAnnotatedClass(NhaXuatBan.class)
				.addAnnotatedClass(TacGia.class)
				.getMetadataBuilder()
				.build();

		sessionFactory = metadata
				.getSessionFactoryBuilder()
				.build();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public synchronized static DatabaseSQL getInstance() {
		if (instance == null) {
			instance = new DatabaseSQL();
		}
		return instance;
	}
	public void close() {
		sessionFactory.close();
	}

	
}
