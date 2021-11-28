package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class TaiKhoan {

	@Id
	@Column(nullable = false, columnDefinition = "varchar(20)")
	private String tenTK;
	@Column(columnDefinition = "varchar(50)")
	private String matKhau;

	@ManyToOne
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
//	

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public TaiKhoan(String tenTK, String matKhau) {
		super();
		this.tenTK = tenTK;
		this.matKhau = matKhau;
	}

	public TaiKhoan(String tenTK, String matKhau, NhanVien nhanVien) {
		super();
		this.tenTK = tenTK;
		this.matKhau = matKhau;
		this.nhanVien = nhanVien;
	}

	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TaiKhoan [tenTK=" + tenTK + ", matKhau=" + matKhau + ", nhanVien=" + nhanVien.getMaNV() + "]";
	}

	

}
