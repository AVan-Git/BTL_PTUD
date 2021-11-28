package dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connect.DatabaseSQL;
import dao.KhachHangDAO;
import entity.KhachHang;

public class KhachHangImpl implements KhachHangDAO {
	private SessionFactory sessionFactory;

	public KhachHangImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themKhachHang(KhachHang a) {
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
	public boolean suaKhachHang(KhachHang a) {
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
	public boolean xoaKhachHang(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(KhachHang.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(KhachHang.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public KhachHang timKiem_id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			KhachHang nv = session.find(KhachHang.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return nv;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<KhachHang> getDsKhachHang() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<KhachHang> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[KhachHang]";

			list = session.createNativeQuery(sql, KhachHang.class).getResultList();

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

			String sql = "select max([maKH]) from [dbo].[KhachHang]";

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
	public List<KhachHang> getDsKhachHang_Ten(List<KhachHang> lists, String maTim) {
		if (lists.size() != 0) {
			List<KhachHang> dsKhachHang = new ArrayList<>();
			for (KhachHang a : lists) {
				if (a.getTenKH().matches(".*" + maTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsKhachHang.add(a);
				}
			}
			
			return dsKhachHang;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<KhachHang> dsKhachHang = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "SELECT * FROM [QLCuaHangSach].[dbo].[KhachHang]  where [tenKH] like N'%" + maTim + "%'";

				dsKhachHang = session.createNativeQuery(query, KhachHang.class).getResultList();

				tr.commit(); // ket thuc
				return dsKhachHang;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public List<KhachHang> getDsKhachHang_soDT(List<KhachHang> lists, String soDT_Tim) {
		if (lists.size() != 0) {
			List<KhachHang> dsKhachHang = new ArrayList<>();
			for (KhachHang a : lists) {
				if (a.getSoDT().matches(".*" + soDT_Tim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsKhachHang.add(a);
				}
			}
			
			return dsKhachHang;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<KhachHang> dsKhachHang = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "  SELECT * FROM [QLCuaHangSach].[dbo].[KhachHang]  where [soDT] like N'%"+ soDT_Tim +"%'";

				dsKhachHang = session.createNativeQuery(query, KhachHang.class).getResultList();

				tr.commit(); // ket thuc
				return dsKhachHang;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		
		return null;
		
	}

	@Override
	public List<KhachHang> getDsKhachHang_DiaChi(List<KhachHang> lists, String DiaChiTim) {
		if (lists.size() != 0) {
			List<KhachHang> dsKhachHang = new ArrayList<>();
			for (KhachHang a : lists) {
				if (a.getDiaChi().matches(".*" + DiaChiTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsKhachHang.add(a);
				}
			}
			
			return dsKhachHang;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<KhachHang> dsKhachHang = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "  SELECT * FROM [QLCuaHangSach].[dbo].[KhachHang]  where [diaChi] like N'%"+ DiaChiTim +"%'";

				dsKhachHang = session.createNativeQuery(query, KhachHang.class).getResultList();

				tr.commit(); // ket thuc
				return dsKhachHang;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}
		return null;
	}

	@Override
	public List<KhachHang> getDsKhachHang_NgaySinh(List<KhachHang> lists, String dd, String mm, String yy) {

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
			String date1 = yy+mm+dd; // ngay tim
			String date =""; //luu ngayf trong ds
			List<KhachHang> dsKhachHang = new ArrayList<>();
			for (KhachHang a : lists) {
				date = a.getNamSinh().toString();
				if (date.matches("" + date1 + ".*")) {
					dsKhachHang.add(a);
				}

			}
			
			return dsKhachHang;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<KhachHang> dsKhachHang = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "SELECT * FROM [dbo].[KhachHang] WHERE [namSinh] LIKE '%"+ yy + mm + dd +"%'";

				dsKhachHang = session.createNativeQuery(query, KhachHang.class).getResultList();

				tr.commit(); // ket thuc
				return dsKhachHang;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}
		return null;
	}

	@Override
	public List<KhachHang> getDsKhachHang_Email(List<KhachHang> lists, String emailTim) {
		if (lists.size() != 0) {
			List<KhachHang> dsKhachHang = new ArrayList<>();
			for (KhachHang a : lists) {
				if (a.getEmail().matches(".*" + emailTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsKhachHang.add(a);
				}
			}
			
			return dsKhachHang;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<KhachHang> dsKhachHang = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "  SELECT * FROM [QLCuaHangSach].[dbo].[KhachHang]  where [email] like N'%"+ emailTim +"%'";

				dsKhachHang = session.createNativeQuery(query, KhachHang.class).getResultList();

				tr.commit(); // ket thuc
				return dsKhachHang;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}
		return null;
	}

	@Override
	public KhachHang getKhachHang_SoDT(String soDTTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		KhachHang a = null;
		try {
			tr.begin(); // bat dau

			String query = "  SELECT * FROM [QLCuaHangSach].[dbo].[KhachHang]  where [soDT] like '%"+ soDTTim +"%'";

			a = session.createNativeQuery(query, KhachHang.class).getSingleResult();

			tr.commit(); // ket thuc
			return a;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return a;
		
	}







}
