package fr.oc.moteur;

public class MoteurElectrique extends Moteur {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEURS----------
	//avec param�tres
	public MoteurElectrique( String cylindre, Double prixMoteur ) {
		this.setType( TypeMoteur.ELECTRIQUE );
		this.setCylindre( cylindre );
		this.setPrixMoteur( prixMoteur );
	}
}
