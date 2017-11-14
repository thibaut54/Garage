package fr.oc.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomOption;
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public SiegeChauffant() {
		nomOption = "SiegeChauffant";
		prixOption =  562.9 ;
	}
	

	//----------GETTERS----------
	public String getNomOption() {
		return nomOption;
	}
	
	public Double getPrixOption() {
		return prixOption;
	}

	public String toString() {
		return this.getNomOption() + " (" + getPrixOption() + "€)" ;
	}
}
