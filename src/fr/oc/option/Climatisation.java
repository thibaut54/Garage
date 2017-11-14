package fr.oc.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomOption;
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public Climatisation() {
		this.setNomOption( "Climatisation" );
		this.setPrixOption( 347.3 );
	}
	
	//avec paramètres
	public Climatisation( String nomOption, Double prixOption ) {
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
		return this.getNomOption() + " (" + getPrixOption() + "€)" ;
	}
}