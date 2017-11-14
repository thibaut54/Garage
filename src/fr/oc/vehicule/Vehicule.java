package fr.oc.vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.oc.moteur.Moteur;
import fr.oc.option.Option;

public abstract class Vehicule implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//----------ATTRIBUTS----------
	private Double prixVehicule;
	private Double prixVehiculeAvecOptions; // Comment se passe de cette variable pour récupérer les prix des options de chaque véhicule dans Vehicule ?
	private String nom;
	private List<Option> options = new ArrayList<>();
	private Marque nomMarque;
	private Moteur moteur;

	
	//----------CONSTRUCTEUR----------
	//par défaut
	public Vehicule() {

	}
	
	//----------GETTERS----------
	public Double getPrixVehicule() {
		return prixVehicule;
	}
	
	public Double getPrixVehiculeAvecOptions() {
		prixVehiculeAvecOptions = this.getPrixVehicule();
		for (Option option : options) {
			prixVehiculeAvecOptions = ( prixVehiculeAvecOptions + option.getPrixOption() );
		}
		return prixVehiculeAvecOptions;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Marque getMarque() {
		return nomMarque;
	}
	
	public Moteur getMoteur() {
		return moteur;
	}
	
	public List<Option> getOptions() {
		return options;
	}
	
	
	//----------SETTERS----------
	public void setPrixVehicule(Double prixVehicule) {
		this.prixVehicule = prixVehicule;
	}
	
	public void setPrixVehiculeAvecOptions(Double prixVehiculeAvecOptions) {
		this.prixVehiculeAvecOptions = prixVehiculeAvecOptions;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	public void addOption(Option opt) {
		options.add( opt );
	}
	
	@Override
	public  String toString() {
		return this.getMarque() + " : " + this.getNom() + " Moteur " + this.getMoteur() 
				+ " (" + this.getPrixVehicule() + "€) "  + this.getOptions() + " d'une valeur total de " 
				+ this.getPrixVehiculeAvecOptions() + " €\n";   	
	}
}
