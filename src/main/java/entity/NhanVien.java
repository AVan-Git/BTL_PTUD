package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class NhanVien {

	@Id
	private String maNV;
	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String tenNV;
	private Date namSinh;
	@Column(nullable = false, columnDefinition = "varchar(10)")
	private String soDT;
	@Column(columnDefinition = "nvarchar(255)")
	private String diaChi;
	private int caLam;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<PhieuChamCong> dsPhieuChamCong;

	@OneToMany(mappedBy = "nhanVien")
	private List<HoaDon> dsHoaDon;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<PhieuNhap> dsPhieuNhap;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<TaiKhoan> dsTaiKhoan;
	
	
	@ManyToOne
	@JoinColumn(name = "quanLyId")
	private NhanVien QuanLyNV;
	
	@OneToMany(mappedBy = "QuanLyNV")
	private List<NhanVien> dsnhanVien;
	

	public NhanVien getQuanLyNV() {
		return QuanLyNV;
	}


	public void setQuanLyNV(NhanVien quanLyNV) {
		QuanLyNV = quanLyNV;
	}


	//
	public NhanVien() {
		super();
	}


	public String getMaNV() {
		return maNV;
	}


	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}


	public String getTenNV() {
		return tenNV;
	}


	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}


	public Date getNamSinh() {
		return namSinh;
	}


	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}


	public String getSoDT() {
		return soDT;
	}


	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public int getCaLam() {
		return caLam;
	}


	public void setCaLam(int caLam) {
		this.caLam = caLam;
	}


	public NhanVien(String maNV, String tenNV, Date namSinh, String soDT, String diaChi, int caLam) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.soDT = soDT;
		this.diaChi = diaChi;
		this.caLam = caLam;
	}


	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}


	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", namSinh=" + namSinh + ", soDT=" + soDT + ", diaChi="
				+ diaChi + ", caLam=" + caLam + ", QuanLyNV=" + QuanLyNV.getMaNV() + "]";
	}


	



}//end NhanVien