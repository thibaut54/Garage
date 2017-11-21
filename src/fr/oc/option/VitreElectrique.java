package fr.oc.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public VitreElectrique() {
		prixOption = 212.35 ;
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
		result = prime * result + ((prixOption == null) ? 0 : prixOption.hashCode());
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
		VitreElectrique other = (VitreElectrique) obj;
		if (prixOption == null) {
			if (other.prixOption != null)
				return false;
		} else if (!prixOption.equals(other.prixOption))
			return false;
		return true;
	}
}
