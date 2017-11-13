package fr.oc.garage;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomOption;
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public GPS() {
		this.setNomOption( "GPS" );
		this.setPrixOption( 113.5 );
	}
	
	//avec paramètres
	public GPS( String nomOption, Double prixOption ) {
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

	@Override
	public String toString() {
		return this.getNomOption() + " (" + getPrixOption() + "€)" ;
	}
}
