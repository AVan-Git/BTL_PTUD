package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class HoaDon {

	@Id
	private String maHD;
	@Column(nullable = false)
	private Date ngaylap;
	private double tongTien;

	@ManyToOne
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	@ManyToOne
	@JoinColumn(name = "maKH")
	private KhachHang khachHang;
	
	@OneToMany(mappedBy = "hoaDon")
	private List<CT_HoaDon> dsCT_HoaDon;
	
	@OneToOne
	@JoinColumn(name = "maDD", referencedColumnName = "maDD", nullable = true)
	public DonDat donDat ;

	public NhanVien getNhanVien() {
		return nhanVien;
	}


	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}


	public KhachHang getKhachHang() {
		return khachHang;
	}


	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}


	public DonDat getDonDat() {
		return donDat;
	}


	public void setDonDat(DonDat donDat) {
		this.donDat = donDat;
	}


	public String getMaHD() {
		return maHD;
	}


	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}


	public Date getNgaylap() {
		return ngaylap;
	}


	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}


	public double getTongTien() {
		return tongTien;
	}
//	
	public HoaDon(){
		super();
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}


	public HoaDon(String maHD, Date ngaylap, double tongTien, NhanVien nhanVien, KhachHang khachHang) {
		super();
		this.maHD = maHD;
		this.ngaylap = ngaylap;
		this.tongTien = tongTien;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
	}

	public HoaDon(String maHD, Date ngaylap, double tongTien, NhanVien nhanVien, KhachHang khachHang, DonDat donDat) {
		super();
		this.maHD = maHD;
		this.ngaylap = ngaylap;
		this.tongTien = tongTien;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.donDat = donDat;
	}


	public HoaDon(String maHD) {
		super();
		this.maHD = maHD;
	}


	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngaylap=" + ngaylap + ", tongTien=" + tongTien + ", nhanVien=" + nhanVien.getMaNV()
				+ ", khachHang=" + khachHang.getMaKH() + ", dsCT_HoaDon=" + "]";
	}



}//end HoaDon