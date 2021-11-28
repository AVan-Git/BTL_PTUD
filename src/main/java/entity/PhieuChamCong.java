package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class PhieuChamCong {

	@Id
	private String maPhieu;
	@Column(nullable = false, columnDefinition = "money")
	private double luongCB;
	private int soNgayLam;
	private double tienPhat;
	private double tienThuong;
	private Date ngaylapPhieu;

//	@OneToOne
//	@MapsId
//	@JoinColumn(name = "maNV")

	@ManyToOne
	@JoinColumn(name = "maNV")
	public NhanVien nhanVien;

//
	public PhieuChamCong() {
		super();
	}

	public PhieuChamCong(String maPhieu) {
		super();
		this.maPhieu = maPhieu;
	}

}// end PhieuChamCong