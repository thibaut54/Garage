package fr.oc.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;
	
	//----------CONSTRUCTEURS----------
	//avec paramètres
	public MoteurDiesel( String cylindre, double prixMoteur ) {
		super( cylindre , prixMoteur );
		this.type = TypeMoteur.DIESEL ;
	}
}
