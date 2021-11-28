package dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.NhaXuatBanDAO;
import entity.NhaXuatBan;

public class NhaXuatBanImpl implements NhaXuatBanDAO {
	private SessionFactory sessionFactory;

	public NhaXuatBanImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themNhaXuatBan(NhaXuatBan a) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			session.save(a); // them

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public boolean suaNhaXuatBan(NhaXuatBan a) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			session.update(a); // sửa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public boolean xoaNhaXuatBan(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(NhaXuatBan.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(NhaXuatBan.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}


	@Override
	public List<NhaXuatBan> getDsNhaXuatBan() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<NhaXuatBan> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[NhaXuatBan]";

			list = session.createNativeQuery(sql, NhaXuatBan.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	public String getMaCuoi() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		String n = null;
		try {
			tr.begin(); // bat dau

			String sql = "select max([maNXB]) from [dbo].[NhaXuatBan]";

			Object o = session.createNativeQuery(sql).getSingleResult();

			n = o.toString();

			tr.commit(); // ket thuc
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return n;
	}

	@Override
	public List<NhaXuatBan> getDsNhaXuatBan_Ten(List<NhaXuatBan> lists, String maTim) {
		if (lists.size() != 0) {
			List<NhaXuatBan> dsNhaXuatBan = new ArrayList<>();
			for (NhaXuatBan a : lists) {
				if (a.getTenNXB().matches(".*" + maTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsNhaXuatBan.add(a);
				}
			}
			
			return dsNhaXuatBan;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<NhaXuatBan> dsNhaXuatBan = new ArrayList<>();
			try {
				tr.begin(); // bat dau
//				SELECT * FROM [QLCuaHangSach].[dbo].[NhaXuatBan]  where [tenNXB] like N'%nhà Sách%'
				String query = "SELECT * FROM [QLCuaHangSach].[dbo].[NhaXuatBan]  where [tenNXB] like N'%"+ maTim+"%'";
				
				System.out.println("getDsNhaXuatBan_Ten");
				
				dsNhaXuatBan = session.createNativeQuery(query, NhaXuatBan.class).getResultList();

				tr.commit(); // ket thuc
				return dsNhaXuatBan;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public NhaXuatBan getDsNhaXuatBan_Id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			NhaXuatBan nv = session.find(NhaXuatBan.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<NhaXuatBan> getDsNhaXuatBan_DiaChi(List<NhaXuatBan> lists, String diaChiTim) {
		if (lists.size() != 0) {
			List<NhaXuatBan> dsNhaXuatBan = new ArrayList<>();
			for (NhaXuatBan a : lists) {
				if (a.getDiachi().matches(".*" + diaChiTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsNhaXuatBan.add(a);
				}
			}
			
			return dsNhaXuatBan;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<NhaXuatBan> dsNhaXuatBan = new ArrayList<>();
			try {
				tr.begin(); // bat dau
//				SELECT * FROM [QLCuaHangSach].[dbo].[NhaXuatBan]  where [diachi] like N'%HCM%'
				String query = "SELECT * FROM [QLCuaHangSach].[dbo].[NhaXuatBan]  where [diachi] like N'%"+diaChiTim+"%'";

				
				System.out.println("getDsNhaXuatBan_DiaChi");
				
				dsNhaXuatBan = session.createNativeQuery(query, NhaXuatBan.class).getResultList();

				tr.commit(); // ket thuc
				return dsNhaXuatBan;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public int getSoSachHienCoCuaNhaXB(String maNhaXB) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			String sql = "SELECT COUNT(*)	FROM     NhaXuatBan INNER JOIN	Sach ON NhaXuatBan.maNXB = Sach.maNXB	WHERE NhaXuatBan.maNXB like '"+maNhaXB+"'";
			int n = (int) session.createNativeQuery(sql).getSingleResult();

			tr.commit(); // ket thuc
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return 0;
	}



}
