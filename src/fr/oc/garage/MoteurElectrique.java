package fr.oc.garage;

public class MoteurElectrique extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//par défaut
	public MoteurElectrique() {
		this.setType( TypeMoteur.ELECTRIQUE );
		this.setCylindre( null );
		this.setPrixMoteur( 0d );
	}
	
	//avec paramètres
	public MoteurElectrique( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.ELECTRIQUE );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
