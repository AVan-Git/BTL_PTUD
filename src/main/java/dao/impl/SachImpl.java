package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import connect.DatabaseSQL;
import dao.SachDAO;
import entity.KhachHang;
import entity.NhaXuatBan;
import entity.Sach;
import entity.TacGia;

public  class SachImpl implements SachDAO{

	private SessionFactory sessionFactory;
	
	
	public SachImpl() {
		super();
		this.sessionFactory = DatabaseSQL.getInstance().getSessionFactory();
	}

	@Override
	public boolean themSach(Sach a) {
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
	public boolean suaSach(Sach a) {
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
	public boolean xoaSach(String maXoa) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			// session.find(KhachHang.class, maXoa) -- timf đến thằng có mã là mã xóa

			session.delete(session.find(Sach.class, maXoa)); // xoa

			tr.commit(); // ket thuc
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return false;
	}

	@Override
	public Sach getSach_id(String maTim) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			Sach a = session.find(Sach.class, maTim); // timf đến thằng có mã là mã xóa

			tr.commit(); // ket thuc
			return a;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<Sach> getDsSach() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi
		try {
			tr.begin(); // bat dau

			List<Sach> list = new ArrayList<>();

			String sql = "SELECT *  FROM [QLCuaHangSach].[dbo].[Sach]";

			list = session.createNativeQuery(sql, Sach.class).getResultList();

			tr.commit(); // ket thuc
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public String getMaCuoi() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		String n = null;
		try {
			tr.begin(); // bat dau

			String sql = "select max([maSach]) from [dbo].[Sach]";

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
	public List<Sach> getDsSach_Ten(List<Sach> lists, String tenTim) {
		if (lists.size() != 0) {
			List<Sach> dsSach = new ArrayList<>();
			
			for (Sach a : lists) {
				if (a.getTenSach().matches(".*" + tenTim + ".*")) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsSach.add(a);
				}
			}
			
			return dsSach;
		} else {
			Session session = sessionFactory.getCurrentSession(); // goi den csdl

			Transaction tr = session.getTransaction(); // giups stop khi co lỗi

			List<Sach> dsSach = new ArrayList<>();
			try {
				tr.begin(); // bat dau

				String query = "SELECT * FROM [dbo].[Sach]  where [tenSach] like N'%"+ tenTim +"%'";

				dsSach = session.createNativeQuery(query, Sach.class).getResultList();

				tr.commit(); // ket thuc
				return dsSach;
			} catch (Exception e) {
				e.printStackTrace();
				tr.rollback(); // quay lai khi co loi
			}
		}

		return null;
	}

	@Override
	public List<NhaXuatBan> getDsNhaXB() {
//		String sql = "SELECT DISTINCT NhaXuatBan.maNXB, NhaXuatBan.tenNXB	FROM     Sach INNER JOIN	NhaXuatBan ON Sach.maNXB = NhaXuatBan.maNXB";
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		List<NhaXuatBan> dsNhaXB = new ArrayList<>();
		try {
			tr.begin(); // bat dau

			String query = "SELECT DISTINCT NhaXuatBan.maNXB, NhaXuatBan.tenNXB	FROM     Sach INNER JOIN	NhaXuatBan ON Sach.maNXB = NhaXuatBan.maNXB";

			List<?> list = session.createNativeQuery(query).getResultList();

			for (Object obj : list) {
				Object[] o = (Object[]) obj;
				
				String ma = (String) o[0];
				String ten = (String) o[1];
				
				NhaXuatBan a = new NhaXuatBan(ma, ten);
				dsNhaXB.add(a);
			}
			
			tr.commit(); // ket thuc
			return dsNhaXB;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		
		return null;
	}

	@Override
	public List<TacGia> getDsTacGia() {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		List<TacGia> dsTacGia = new ArrayList<TacGia>();
		try {
			tr.begin(); // bat dau

			String query = "SELECT DISTINCT TacGia.maTG, TacGia.tenTG	FROM     Sach INNER JOIN	TacGia ON Sach.maTG = TacGia.maTG";

			List<?> list = session.createNativeQuery(query).getResultList();

			for (Object obj : list) {
				Object[] o = (Object[]) obj;
				
				String ma = (String) o[0];
				String ten = (String) o[1];
				
				TacGia a = new TacGia(ma, ten);
				dsTacGia.add(a);
			}
			
			tr.commit(); // ket thuc
			return dsTacGia;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		
		return null;
	}
//	

	@Override
	public List<Sach> getDsSach_TheLoai(List<Sach> lists, String theLoaiTim) {
		if (lists.size() != 0) {
			List<Sach> dsSach = new ArrayList<>();
			
			for (Sach a : lists) {
				if (a.getLoai().equalsIgnoreCase(theLoaiTim)) {
//					maCheck.matches("DH1[1-6][A-Z]")
					dsSach.add(a);
				}
			}
			
			return dsSach;
		} else {
//			SELECT * FROM [dbo].[Sach] where [loai] like N'Sách giáo khoa'
			String query = "SELECT * FROM [dbo].[Sach] where [loai] like N'"+theLoaiTim+"'";

			return TimKiem_SQL(query);
		}
		
		
	}

	private List<Sach> TimKiem_SQL(String query) {
		Session session = sessionFactory.getCurrentSession(); // goi den csdl

		Transaction tr = session.getTransaction(); // giups stop khi co lỗi

		List<Sach> dsSach = new ArrayList<>();
		try {
			tr.begin(); // bat dau

			dsSach = session.createNativeQuery(query, Sach.class).getResultList();

			tr.commit(); // ket thuc
			return dsSach;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback(); // quay lai khi co loi
		}
		return null;
	}

	@Override
	public List<Sach> getDsSach_TacGia(List<Sach> lists, String tacGiaTim) {
		if (lists.size() != 0) {
			List<Sach> dsSach = new ArrayList<>();
			
			for (Sach a : lists) {
				if (a.getTacGia().getMaTG().equalsIgnoreCase(tacGiaTim)) {
					dsSach.add(a);
				}
			}
			
			return dsSach;
		} else {
//			SELECT * FROM [dbo].[Sach] where [maTG] like 'TG00001'
			String query = "SELECT * FROM [dbo].[Sach] where [maTG] like '"+tacGiaTim+"'";

			return TimKiem_SQL(query);
		}
	}

	@Override
	public List<Sach> getDsSach_NhaXB(List<Sach> lists, String nhaXBTim) {
		if (lists.size() != 0) {
			List<Sach> dsSach = new ArrayList<>();
			
			for (Sach a : lists) {
				if (a.getNhaXB().getMaNXB().equals(nhaXBTim)) {
					dsSach.add(a);
				}
			}
			
			return dsSach;
		} else {
//			SELECT * FROM [dbo].[Sach] where [maNXB] like 'NXB00001'
			String query = "SELECT * FROM [dbo].[Sach] where [maNXB] like '"+nhaXBTim+"'";

			return TimKiem_SQL(query);
		}
	}

	
	

}
