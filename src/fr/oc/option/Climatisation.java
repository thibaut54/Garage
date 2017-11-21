package fr.oc.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public Climatisation() {
		prixOption = 347.3 ;
	}
		
	//----------GETTERS----------
	public Double getPrixOption() {
		return prixOption;
	}


	public String toString() {
		return getClass().getSimpleName() + " (" + getPrixOption() + "€)" ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(prixOption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Climatisation other = (Climatisation) obj;
		if (Double.doubleToLongBits(prixOption) != Double.doubleToLongBits(other.prixOption))
			return false;
		return true;
	}
	
}