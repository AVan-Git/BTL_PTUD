package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class DonDat {

	@Id
	private String maDD;
	@Column(nullable = false)
	private Date ngayDat;
	@Column(nullable = false)
	private Date ngayNhan;
	@Column(nullable = false)
	private int soLuong;
	
	@ManyToOne
	@JoinColumn(name = "maKH")
	private KhachHang khachHang;
	
//	@OneToMany(mappedBy = "donDat")
//	private List<Sach> dsSach;
	
	@ManyToOne
	@JoinColumn(name = "maSach")
	private Sach sach;
	

	
	@OneToOne(mappedBy = "donDat", fetch = FetchType.EAGER)
	private HoaDon hoaDon;
	
	public DonDat() {
		super();
	}
	
	




}//end DonDat