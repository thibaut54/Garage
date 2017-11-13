package fr.oc.garage;

public class MoteurHybride extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//par d�faut
	public MoteurHybride() {
		this.setType( TypeMoteur.HYBRIDE );
		this.setCylindre( null );
		this.setPrixMoteur( 0d );
	}
	
	//avec param�tres
	public MoteurHybride( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.HYBRIDE );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
