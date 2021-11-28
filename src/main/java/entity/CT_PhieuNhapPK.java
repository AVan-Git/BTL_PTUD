package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CT_PhieuNhapPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6571318013018256484L;

	private String phieuNhap;
	
	private String sach;

	public CT_PhieuNhapPK() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phieuNhap == null) ? 0 : phieuNhap.hashCode());
		result = prime * result + ((sach == null) ? 0 : sach.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CT_PhieuNhapPK other = (CT_PhieuNhapPK) obj;
		if (phieuNhap == null) {
			if (other.phieuNhap != null)
				return false;
		} else if (!phieuNhap.equals(other.phieuNhap))
			return false;
		if (sach == null) {
			if (other.sach != null)
				return false;
		} else if (!sach.equals(other.sach))
			return false;
		return true;
	}
	
}
