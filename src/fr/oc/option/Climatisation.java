package fr.oc.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double prixOption = 347.3;

		
	//----------GETTERS----------
	public Double getPrix() {
		return prixOption;
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
		Climatisation other = (Climatisation) obj;
		if (prixOption == null) {
			if (other.prixOption != null)
				return false;
		} else if (!prixOption.equals(other.prixOption))
			return false;
		return true;
	}
	
}