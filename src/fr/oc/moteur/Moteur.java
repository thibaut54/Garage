package fr.oc.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//----------ATTRIBUTS----------
	private TypeMoteur type ;
	private String cylindre ;
	private double prixMoteur ;
	
	//----------GETTERS----------
	public TypeMoteur getType() {
		return type;
	}
	
	public String getCylindre() {
		return cylindre;
	}
	
	public double getPrixMoteur() {
		return prixMoteur;
	}
	
	//----------SETTERS----------
	public void setType(TypeMoteur type) {
		this.type = type;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public void setPrixMoteur(double prixMoteur) {
		this.prixMoteur = prixMoteur;
	}

	@Override
	public String toString() {
		return this.getType() + " " + this.getCylindre();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cylindre == null) ? 0 : cylindre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prixMoteur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Moteur other = (Moteur) obj;
		if (cylindre == null) {
			if (other.cylindre != null)
				return false;
		} else if (!cylindre.equals(other.cylindre))
			return false;
		if (Double.doubleToLongBits(prixMoteur) != Double.doubleToLongBits(other.prixMoteur))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}
