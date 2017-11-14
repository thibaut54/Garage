package fr.oc.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurDiesel( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.DIESEL );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
