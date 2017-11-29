package fr.oc.vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.oc.moteur.Moteur;
import fr.oc.option.Option;

public abstract class Vehicule implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//----------ATTRIBUTS----------
	private double prixVehicule;
	private double prixVehiculeAvecOptions; // Comment se passe de cette variable pour récupérer les prix des options de chaque véhicule dans Vehicule ?
	private List<Option> options = new ArrayList<>();
	private Marque nomMarque;
	private Moteur moteur;

	
	//----------CONSTRUCTEUR----------
	//par défaut
	public Vehicule() {

	}
	
	//----------GETTERS----------
	public double getPrixVehicule() {
		return prixVehicule;
	}
	
	public double getPrixVehiculeAvecOptions() {
		prixVehiculeAvecOptions = this.getPrixVehicule();
		for (Option option : options) {
			prixVehiculeAvecOptions = ( prixVehiculeAvecOptions + option.getPrixOption() );
		}
		return prixVehiculeAvecOptions;
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
	public void setPrixVehicule(double prixVehicule) {
		this.prixVehicule = prixVehicule;
	}
	
	public void setPrixVehiculeAvecOptions(double prixVehiculeAvecOptions) {
		this.prixVehiculeAvecOptions = prixVehiculeAvecOptions;
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
		return this.getMarque() + " : " + this.getClass().getSimpleName() + " Moteur " + this.getMoteur() 
				+ " (" + this.getPrixVehicule() + "€) "  + this.getOptions() + " d'une valeur total de " 
				+ this.getPrixVehiculeAvecOptions() + " €\n";   	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moteur == null) ? 0 : moteur.hashCode());
		result = prime * result + ((nomMarque == null) ? 0 : nomMarque.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prixVehicule);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prixVehiculeAvecOptions);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(prixVehicule) != Double.doubleToLongBits(other.prixVehicule))
			return false;
		if (Double.doubleToLongBits(prixVehiculeAvecOptions) != Double.doubleToLongBits(other.prixVehiculeAvecOptions))
			return false;
		return true;
	}


	
}
