package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class NhaXuatBan {

	@Id
	private String maNXB;
	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String tenNXB;
	@Column(columnDefinition = "nvarchar(255)")
	private String diachi;
	
	@OneToMany(mappedBy = "nhaXB")
	private List<Sach> dsSach;
	
//	
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getMaNXB() {
		return maNXB;
	}
	public void setMaNXB(String maNXB) {
		this.maNXB = maNXB;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
//	
	public NhaXuatBan(String diachi, String maNXB, String tenNXB) {
		super();
		this.diachi = diachi;
		this.maNXB = maNXB;
		this.tenNXB = tenNXB;
	}
	public NhaXuatBan(String maNXB) {
		super();
		this.maNXB = maNXB;
	}
	public NhaXuatBan(String maNXB, String tenNXB) {
		super();
		this.maNXB = maNXB;
		this.tenNXB = tenNXB;
	}
	public NhaXuatBan() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
	@Override
	public String toString() {
		return "NhaXuatBan [diachi=" + diachi + ", maNXB=" + maNXB + ", tenNXB=" + tenNXB + "]";
	}

	
	

}//end NhaXuatBan