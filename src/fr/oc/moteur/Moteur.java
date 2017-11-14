package fr.oc.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//----------ATTRIBUTS----------
	private TypeMoteur type ;
	private String cylindre ;
	private Double prixMoteur ;
	
	//----------GETTERS----------
	public TypeMoteur getType() {
		return type;
	}
	
	public String getCylindre() {
		return cylindre;
	}
	
	public Double getPrixMoteur() {
		return prixMoteur;
	}
	
	//----------SETTERS----------
	public void setType(TypeMoteur type) {
		this.type = type;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public void setPrixMoteur(Double prixMoteur) {
		this.prixMoteur = prixMoteur;
	}

	@Override
	public String toString() {
		return this.getType() + " " + this.getCylindre();
	}
}
