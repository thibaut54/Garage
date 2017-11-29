package fr.oc.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public SiegeChauffant() {
		prixOption =  562.9 ;
	}
	

	//----------GETTERS----------
	public double getPrixOption() {
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
		SiegeChauffant other = (SiegeChauffant) obj;
		if (Double.doubleToLongBits(prixOption) != Double.doubleToLongBits(other.prixOption))
			return false;
		return true;
	}

}
