package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TacGia {

	public TacGia(String maTG, String tenTG) {
		super();
		this.maTG = maTG;
		this.tenTG = tenTG;
	}
	public TacGia(String maTG) {
		super();
		this.maTG = maTG;
	}
	@Id
	@Column(columnDefinition = "varchar(10)")
	private String maTG;
	@Column(nullable = false, columnDefinition = "nvarchar(255)")
	private String tenTG;
	private Date namsinh;
	@Column(columnDefinition = "nvarchar(255)")
	private String diachi;
	@Column(columnDefinition = "text")
	private String tieusu;
	

	@OneToMany(mappedBy = "tacGia")
	private List<Sach> dsSach;

	
	public String getMaTG() {
		return maTG;
	}
	public void setMaTG(String maTG) {
		this.maTG = maTG;
	}
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public Date getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(Date namsinh) {
		this.namsinh = namsinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getTieusu() {
		return tieusu;
	}
	public void setTieusu(String tieusu) {
		this.tieusu = tieusu;
	}
	//
	public TacGia(String maTG, String tenTG, Date namsinh, String diachi, String tieusu) {
		super();
		this.maTG = maTG;
		this.tenTG = tenTG;
		this.namsinh = namsinh;
		this.diachi = diachi;
		this.tieusu = tieusu;
	}
	public TacGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	//
	@Override
	public String toString() {
		return "TacGia [maTG=" + maTG + ", tenTG=" + tenTG + ", namsinh=" + namsinh + ", diachi=" + diachi + ", tieusu="
				+ tieusu + "]";
	}
	


	
}//end TacGia