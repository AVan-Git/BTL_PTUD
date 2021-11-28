package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CT_PhieuNhapPK.class)
public class CT_PhieuNhap {

//	private String maCTPN;
	@Id
	@ManyToOne
	@JoinColumn(name = "maPN")
	private PhieuNhap phieuNhap;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maSach")
	private Sach sach;

	@Column(nullable = false)
	private int soluong;
//	

	public PhieuNhap getPhieuNhap() {
		return phieuNhap;
	}

	public void setPhieuNhap(PhieuNhap phieuNhap) {
		this.phieuNhap = phieuNhap;
	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
//	

	public CT_PhieuNhap(PhieuNhap phieuNhap, Sach sach, int soluong) {
		super();
		this.phieuNhap = phieuNhap;
		this.sach = sach;
		this.soluong = soluong;
	}



	public CT_PhieuNhap() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
	@Override
	public String toString() {
		return "CT_PhieuNhap [phieuNhap=" + phieuNhap + ", sach=" + sach + ", soluong=" + soluong + "]";
	}


	
	


}//end CT_PhieuNhap