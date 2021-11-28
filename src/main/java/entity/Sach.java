package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sach {

	public Sach(String maSach, String tenSach) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
	}

	@Id
	private String maSach;
	@Column(columnDefinition = "nvarchar(255)", nullable = false)
	private String tenSach;
	@Column(columnDefinition = "nvarchar(50)")
	private String loai;
	private double giaThanh;
	private int soLuong;

	@OneToMany(mappedBy = "sach")
	private List<CT_HoaDon> dsCT_HoaDon;

	@OneToMany(mappedBy = "sach")
	private List<CT_PhieuNhap> dsCT_PhieuNhap;

//	@ManyToOne 
//	@JoinColumn(name = "maDD")
//	private DonDat donDat;

	@OneToMany(mappedBy = "sach")
	private List<DonDat> dsDonDat;

	@ManyToOne
	@JoinColumn(name = "maTG")
	private TacGia tacGia;

	@ManyToOne
	@JoinColumn(name = "maNXB")
	private NhaXuatBan nhaXB;

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

	public NhaXuatBan getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(NhaXuatBan nhaXB) {
		this.nhaXB = nhaXB;
	}

	//
	public Sach(String maSach, String tenSach, String loai, double giaThanh, List<CT_HoaDon> dsCT_HoaDon) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.loai = loai;
		this.giaThanh = giaThanh;
		this.dsCT_HoaDon = dsCT_HoaDon;
	}

	public Sach(String maSach, String tenSach, String loai, double giaThanh, int soLuong, TacGia tacGia,
			NhaXuatBan nhaXB) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.loai = loai;
		this.giaThanh = giaThanh;
		this.soLuong = soLuong;
		this.tacGia = tacGia;
		this.nhaXB = nhaXB;
	}

	public Sach() {
		super();
	}

//	
	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", tenSach=" + tenSach + ", loai=" + loai + ", giaThanh=" + giaThanh
				+ ", soLuong=" + soLuong + ", tacGia=" + tacGia.getMaTG() + ", nhaXB=" + nhaXB.getMaNXB() + "]";
	}

}// end Sach