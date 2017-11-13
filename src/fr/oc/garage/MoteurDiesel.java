package fr.oc.garage;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//par d�faut
	public MoteurDiesel() {
		this.setType( TypeMoteur.DIESEL );
		this.setCylindre( null );
		this.setPrixMoteur( 0d );
	}
	
	//avec param�tres
	public MoteurDiesel( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.DIESEL );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
