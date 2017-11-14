package fr.oc.moteur;

public class MoteurEssence extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec paramètres
	public MoteurEssence( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.ESSENCE );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
