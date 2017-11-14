package fr.oc.option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nomOption;
	private Double prixOption;


	//----------CONSTRUCTEUR----------
	//par défaut
	public BarreDeToit() {
		this.setNomOption( "BarreDeToit" );
		this.setPrixOption( 29.9 );
	}
	
	//avec paramètres
	public BarreDeToit( String nomOption, Double prixOption ) {
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
