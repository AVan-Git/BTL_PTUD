package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.TaiKhoanDAO;
import entity.TaiKhoan;

public class TaiKhoanImpl implements TaiKhoanDAO {
	private SessionFactory sessionFactory;

	public TaiKhoanImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themTaiKhoan(TaiKhoan a) {
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
	public boolean suaTaiKhoan(TaiKhoan a) {
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
	public boolean xoaTaiKhoan(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(TaiKhoan.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(TaiKhoan.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public List<TaiKhoan> getDsTaiKhoan() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<TaiKhoan> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[TaiKhoan]";

			list = session.createNativeQuery(sql, TaiKhoan.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}


	@Override
	public TaiKhoan getTaiKhoan_Id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			TaiKhoan nv = session.find(TaiKhoan.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<TaiKhoan> getTaiKhoan_maNV(String maNV) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<TaiKhoan> list = new ArrayList<>();

			String sql = "SELECT * FROM  [dbo].[TaiKhoan]	WHERE maNV like '"+ maNV +"'";

			list = session.createNativeQuery(sql, TaiKhoan.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}





}
