package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CT_HoaDonPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6023556584117657397L;
	
	private String hoaDon;

	private String sach;

	public CT_HoaDonPK() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hoaDon == null) ? 0 : hoaDon.hashCode());
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
		CT_HoaDonPK other = (CT_HoaDonPK) obj;
		if (hoaDon == null) {
			if (other.hoaDon != null)
				return false;
		} else if (!hoaDon.equals(other.hoaDon))
			return false;
		if (sach == null) {
			if (other.sach != null)
				return false;
		} else if (!sach.equals(other.sach))
			return false;
		return true;
	}
	
	
}
