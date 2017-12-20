package fr.oc.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;
	
	//----------CONSTRUCTEURS----------
	//avec paramètres
	//Remarque : l'attribut prixMoteur n'est pas utilisé pour l'affichage demandé dans l'énoncé, un peu étrange...
	public MoteurDiesel( String cylindre, Double prixMoteur ) {
		super( cylindre , prixMoteur );
		this.type = TypeMoteur.DIESEL ;
	}
}
