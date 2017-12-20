package fr.oc.vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.oc.moteur.Moteur;
import fr.oc.option.Option;

public abstract class Vehicule implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//----------ATTRIBUTS----------
	private Double prix = 0.0; 		//le type Double est cependant déconseillé pour manipuler des valeurs monétaires
	private List<Option> options = new ArrayList<>();
	private Marque nomMarque;
	private Moteur moteur;

	
	//----------CONSTRUCTEUR----------
	//avec paramètres
	public Vehicule( Double prix , Marque nomMarque ) {
		this.prix = prix;
		this.nomMarque = nomMarque;
	}
	
	
	//----------GETTERS----------
	public Double getPrix() {
		Double prixTotalOptions = 0.0;
		for ( Option option : options ) {
			prixTotalOptions += option.getPrix()  ;
		}
		return prix + prixTotalOptions;
	}
	
	//----------SETTERS----------
	public void setMoteur( Moteur moteur ) {
		this.moteur = moteur;
	}
	
	public void addOption( Option opt ) {
		options.add( opt );
	}
	
	
	@Override
	public  String toString() {
		String str = "";
		//Ici, obligation de faire une boucle un peu complexe pour une question de mise en forme
		//Plus précisement, pour ne pas avoir un ", " de trop à la fin de la liste d'option 
		for (int i = 0 ; i < options.size() ; i++) {
			str += options.get(i).getClass().getSimpleName() + " (" + options.get(i).getPrix() + "€)";
			if(i != (options.size()-1) ) {
				str += ", ";
			} 
		}
		return "Voiture " + nomMarque + " : " + getClass().getSimpleName() + " Moteur " + moteur 
				+ " (" + this.prix + "€) ["  + str + "] d'une valeur total de " 
				+ getPrix() + " €\n";
		//Les valeurs monétaires de nos variables sont ici mieux présentés que ce que l'énoncé demande, 
		//c'est à dire avec moins de chiffres inutiles après la virgule.
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moteur == null) ? 0 : moteur.hashCode());
		result = prime * result + ((nomMarque == null) ? 0 : nomMarque.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
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
		Vehicule other = (Vehicule) obj;
		if (moteur == null) {
			if (other.moteur != null)
				return false;
		} else if (!moteur.equals(other.moteur))
			return false;
		if (nomMarque != other.nomMarque)
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (prix == null) {
			if (other.prix != null)
				return false;
		} else if (!prix.equals(other.prix))
			return false;
		return true;
	}
	
}
