package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.HoaDonDAO;
import entity.HoaDon;

public class HoaDonImpl implements HoaDonDAO {
	private SessionFactory sessionFactory;

	public HoaDonImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themHoaDon(HoaDon a) {
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
	public boolean suaHoaDon(HoaDon a) {
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
	public boolean xoaHoaDon(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(HoaDon.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(HoaDon.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public List<HoaDon> getDsHoaDon() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<HoaDon> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[HoaDon]";

			list = session.createNativeQuery(sql, HoaDon.class).getResultList();

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

			String sql = "select max([maHD]) from [dbo].[HoaDon]";

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
	public HoaDon getHoaDon_Id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			HoaDon nv = session.find(HoaDon.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}


}