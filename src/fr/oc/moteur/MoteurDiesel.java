package fr.oc.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;
	
	//----------CONSTRUCTEURS----------
	//avec param�tres
	//Remarque : l'attribut prixMoteur n'est pas utilis� pour l'affichage demand� dans l'�nonc�, un peu �trange...
	public MoteurDiesel( String cylindre, Double prixMoteur ) {
		super( cylindre , prixMoteur );
		this.type = TypeMoteur.DIESEL ;
	}
}
