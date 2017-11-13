package fr.oc.garage;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomOption;
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par d�faut
	public SiegeChauffant() {
		this.setNomOption( "SiegeChauffant" );
		this.setPrixOption( 562.9 );
	}
	
	//avec param�tres
	public SiegeChauffant( String nomOption, Double prixOption ) {
		this.setNomOption( nomOption );
		this.setPrixOption( prixOption );
	}
	
	
	//----------GETTERS----------
	public String getNomOption() {
		return nomOption;
	}
	
	public Double getPrixOption() {
		return prixOption;
	}

	//----------SETTERS----------
	public void setNomOption(String nomOption) {
		this.nomOption = nomOption;
	}
	
	public void setPrixOption( Double prixOption ) {
		this.prixOption = prixOption;
	}

	public String toString() {
		return this.getNomOption() + " (" + getPrixOption() + "�)" ;
	}
}