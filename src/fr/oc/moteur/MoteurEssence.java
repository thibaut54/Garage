package fr.oc.moteur;

public class MoteurEssence extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurEssence( String cylindre, double prixMoteur ) {
		super( cylindre,prixMoteur );
		this.type = TypeMoteur.ESSENCE ;
	}
}
