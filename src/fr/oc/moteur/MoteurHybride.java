package fr.oc.moteur;

public class MoteurHybride extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurHybride( String cylindre , Double prixMoteur ) {
		super( cylindre , prixMoteur );
		this.type = TypeMoteur.HYBRIDE ;
	}
}
