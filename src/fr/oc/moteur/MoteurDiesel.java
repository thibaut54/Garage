package fr.oc.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;
	
	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurDiesel( String cylindre, double prixMoteur ) {
		super( cylindre , prixMoteur );
		this.type = TypeMoteur.DIESEL ;
	}
}
