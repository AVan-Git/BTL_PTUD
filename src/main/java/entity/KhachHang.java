package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class KhachHang {

	@Id
	private String maKH;
	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String tenKH;
	@Column(nullable = false, columnDefinition = "nvarchar(10)", unique = true)
	private String soDT;
	@Column(columnDefinition = "varchar(50)")
	private String email;
	private Date namSinh;
	@Column(columnDefinition = "nvarchar(255)")
	private String diaChi;
	
	@OneToMany(mappedBy = "khachHang")
	private List<HoaDon> dsHoaDon;
	
	@OneToMany(mappedBy = "khachHang")
	private List<DonDat> dsDonDat;

	
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	//
	public KhachHang(String maKH, String tenKH, String soDT, String email, Date namSinh, String diaChi) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.soDT = soDT;
		this.email = email;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	//
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", soDT=" + soDT + ", email=" + email + ", namSinh="
				+ namSinh + ", diaChi=" + diaChi + "]";
	}
	
	


}//end KhachHang