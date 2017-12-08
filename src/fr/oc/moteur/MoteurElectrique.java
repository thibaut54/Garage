package fr.oc.moteur;

public class MoteurElectrique extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurElectrique( String cylindre, double prixMoteur ) {
		super( cylindre,prixMoteur );
		this.type = TypeMoteur.ELECTRIQUE ;
	}
}
