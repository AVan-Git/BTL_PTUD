package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.NhanvienDAO;
import entity.NhanVien;

public class NhanvienImpl implements NhanvienDAO {
	private SessionFactory sessionFactory;

	public NhanvienImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themNhanVien(NhanVien a) {
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
	public boolean suaNhanVien(NhanVien a) {
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
	public boolean xoaNhanVien(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(NhanVien.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(NhanVien.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public NhanVien timKiem_id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			NhanVien nv = session.find(NhanVien.class, maTim); // timf đến thằng có mã là mã

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public NhanVien getNhanVien_TaiKhoan(String tk) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			NhanVien nv = new NhanVien();

			String query = "SELECT NhanVien.*	FROM     TaiKhoan INNER JOIN	NhanVien ON TaiKhoan.maNV = NhanVien.maNV	WHERE TaiKhoan.tenTK like '"
					+ tk + "'";

			nv = session.createNativeQuery(query, NhanVien.class).getSingleResult();
			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public int soNhanVienDuocQL(String maNV) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau
			int n = 0;

			String query = "SELECT count(*) FROM [dbo].[NhanVien]\r\n" + "where quanLyId like '" + maNV + "'";
			n = (int) session.createNativeQuery(query).getSingleResult();

			tr.commit(); // ket thuc
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return 0;
	}

	@Override
	public List<NhanVien> getDsNhanVien_soDT(List<NhanVien> lists, String maTim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien_Ten(List<NhanVien> lists, String maTim) {
		if (lists.size() != 0) {
			List<NhanVien> dsNhanVien = new ArrayList<>();
			for (NhanVien a : lists) {
				if (a.getTenNV().matches(".*" + maTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsNhanVien.add(a);
				}
			}

			return dsNhanVien;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<NhanVien> dsNhanVien = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "SELECT * FROM [QLCuaHangSach].[dbo].[NhanVien]  where [tenKH] like N'%" + maTim + "%'";

				dsNhanVien = session.createNativeQuery(query, NhanVien.class).getResultList();

				tr.commit(); // ket thuc
				return dsNhanVien;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public String getMaCuoiNV() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		String n = null;
		try {
			tr.begin(); // bat dau

			String sql = "select max([maNV]) from [dbo].[NhanVien]";

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
	public List<NhanVien> getDsNhanVien_DiaChi(List<NhanVien> lists, String DiaChiTim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien_NgaySinh(List<NhanVien> lists, String dd, String mm, String yy) {

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
			List<NhanVien> dsNhanVien = new ArrayList<>();
			for (NhanVien a : lists) {
				date = a.getNamSinh().toString();
				if (date.matches("" + date1 + ".*")) {
					dsNhanVien.add(a);
				}

			}

			return dsNhanVien;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<NhanVien> dsNhanVien = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "SELECT * FROM [dbo].[NhanVien] WHERE [namSinh] LIKE '%" + yy + mm + dd + "%'";

				dsNhanVien = session.createNativeQuery(query, NhanVien.class).getResultList();

				tr.commit(); // ket thuc
				return dsNhanVien;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien_Calam(List<NhanVien> lists, String cb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<NhanVien> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[NhanVien]";

			list = session.createNativeQuery(sql, NhanVien.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien_0_NguoiQL() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<NhanVien> list = new ArrayList<>();

			String sql = "SELECT * FROM  [dbo].[NhanVien] WHERE [quanLyId] is null";

			list = session.createNativeQuery(sql, NhanVien.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<NhanVien> getDsNhanVien_NguoiQL(String maNguoiQL) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<NhanVien> list = new ArrayList<>();

			String sql = "SELECT * FROM     NhanVien 	WHERE quanLyId like '"+maNguoiQL+"'";

			list = session.createNativeQuery(sql, NhanVien.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

}
