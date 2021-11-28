package dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.TacGiaDAO;
import entity.KhachHang;
import entity.TacGia;

public class TacGiaImpl implements TacGiaDAO {
	private SessionFactory sessionFactory;

	public TacGiaImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themTacGia(TacGia a) {
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
	public boolean suaTacGia(TacGia a) {
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
	public boolean xoaTacGia(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(TacGia.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(TacGia.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public List<TacGia> getDsTacGia() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<TacGia> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[TacGia]";

			list = session.createNativeQuery(sql, TacGia.class).getResultList();

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

			String sql = "select max([maTG]) from [dbo].[TacGia]";

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
	public List<TacGia> getDsTacGia_Ten(List<TacGia> lists, String maTim) {
		if (lists.size() != 0) {
			List<TacGia> dsTacGia = new ArrayList<>();
			for (TacGia a : lists) {
				if (a.getTenTG().matches(".*" + maTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsTacGia.add(a);
				}
			}

			return dsTacGia;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<TacGia> dsTacGia = new ArrayList<>();
			try {
				tr.begin(); // bat dau

//				SELECT * FROM [dbo].[TacGia]  where [tenTG] like N'%Rosie%'
				String query = "SELECT * FROM [dbo].[TacGia]  where [tenTG] like N'%" + maTim + "%'";

				System.out.println("getDsTacGia_Ten");

				dsTacGia = session.createNativeQuery(query, TacGia.class).getResultList();

				tr.commit(); // ket thuc
				return dsTacGia;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public TacGia getTacGia_Id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			TacGia nv = session.find(TacGia.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<TacGia> getDsTacGia_DiaChi(List<TacGia> lists, String diaChiTim) {
		if (lists.size() != 0) {
			List<TacGia> dsTacGia = new ArrayList<>();
			for (TacGia a : lists) {
				if (a.getDiachi().matches(".*" + diaChiTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsTacGia.add(a);
				}
			}

			return dsTacGia;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<TacGia> dsTacGia = new ArrayList<>();
			try {
				tr.begin(); // bat dau

//				SELECT * FROM [dbo].[TacGia]  where [diachi] like N'%HN%'
				String query = "SELECT * FROM [dbo].[TacGia]  where [diachi] like N'%" + diaChiTim + "%'";

				System.out.println("getDsTacGia_Ten");

				dsTacGia = session.createNativeQuery(query, TacGia.class).getResultList();

				tr.commit(); // ket thuc
				return dsTacGia;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public List<TacGia> getDsTacGia_NgaySinh(List<TacGia> lists, String dd, String mm, String yy) {

		if (dd.equals("00")) {
			dd = "";
		} else
			dd = "-" + dd;
		if (mm.equals("00")) {
			mm = "";
		} else
			mm = "-" + mm;
		if (yy.equals("0000")) {
			yy = "";
		}

		if (lists.size() != 0) {
			String date1 = yy + mm + dd; // ngay tim
			String date = ""; // luu ngayf trong ds
			List<TacGia> dsTacGia = new ArrayList<>();
			for (TacGia a : lists) {
				date = a.getNamsinh().toString();
				if (date.matches(".*" + date1 + ".*")) {
					dsTacGia.add(a);
				}

			}

			return dsTacGia;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<TacGia> dsTacGia = new ArrayList<>();
			try {
				tr.begin(); // bat dau

//				SELECT * FROM [dbo].[TacGia] WHERE [namsinh] LIKE '1981-06-25%'
				String query = "SELECT * FROM [dbo].[TacGia] WHERE [namsinh] LIKE '%" + yy + mm + dd + "%'";

				dsTacGia = session.createNativeQuery(query, TacGia.class).getResultList();

				tr.commit(); // ket thuc
				return dsTacGia;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}
		return null;
	}

	@Override
	public int getSoSachHienCoCuaTacGia(String maTacGia) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			String sql = "SELECT COUNT(*)	FROM     Sach INNER JOIN	TacGia ON Sach.maTG = TacGia.maTG	WHERE TacGia.maTG like '"+maTacGia+"'";
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
