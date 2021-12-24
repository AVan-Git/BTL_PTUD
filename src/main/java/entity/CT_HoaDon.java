package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CT_HoaDonPK.class)
public class CT_HoaDon {

	@Id
	@ManyToOne
	@JoinColumn(name = "maHD")
	private HoaDon hoaDon;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maSach")
	private Sach sach;
	
	@Column(nullable = false)
	private double giaban;
//	private String maCTHD;
	@Column(nullable = false)
	private int soluong;
	private double tongTien; 
	

	
	public double getTongTien() {
		return tongTien;
	}

	public double getGiaban() {
		return giaban;
	}

	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
		this.tongTien = giaban*soluong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

//	

	public CT_HoaDon(double giaban, int soluong) {
		super();
		this.giaban = giaban;
		this.soluong = soluong;
		this.tongTien = giaban*soluong;
	}

	public CT_HoaDon() {
		super();
		this.tongTien = 0;
		// TODO Auto-generated constructor stub
	}

	public CT_HoaDon(HoaDon hoaDon, Sach sach, double giaban, int soluong) {
		super();
		this.hoaDon = hoaDon;
		this.sach = sach;
		this.giaban = giaban;
		this.soluong = soluong;
		this.tongTien = giaban*soluong;
	}

	@Override
	public String toString() {
		return "CT_HoaDon [hoaDon=" + hoaDon.getMaHD() + ", sach=" + sach.getMaSach() + ", giaban=" + giaban + ", soluong=" + soluong
				+ ", tongTien=" + tongTien + "]";
	}

	

	

}//end CT_HoaDon