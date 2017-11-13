package fr.oc.garage;

public class MoteurEssence extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//par défaut
	public MoteurEssence() {
		this.setType( TypeMoteur.ESSENCE );
		this.setCylindre( null );
		this.setPrixMoteur( 0d );
	}
	
	//avec paramètres
	public MoteurEssence( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.ESSENCE );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
