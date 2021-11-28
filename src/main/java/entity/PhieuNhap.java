package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhieuNhap {

	@Id
	private String maPN;
	private Date ngayNhap;
	
	@ManyToOne
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	@OneToMany(mappedBy = "phieuNhap")
	private List<CT_PhieuNhap> ds_ct_PhieuNhap;
//

	public String getMaPN() {
		return maPN;
	}

	public void setMaPN(String maPN) {
		this.maPN = maPN;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
//	

	public PhieuNhap(String maPN, Date ngayNhap) {
		super();
		this.maPN = maPN;
		this.ngayNhap = ngayNhap;
	}

	public PhieuNhap() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PhieuNhap [maPN=" + maPN + ", ngayNhap=" + ngayNhap + "]";
	}
	

}//end PhieuNhap