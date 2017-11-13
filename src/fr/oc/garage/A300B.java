package fr.oc.garage;


public class A300B extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par défaut
	public A300B() {
		this.setPrixVehicule( 28457d );
		this.setNom( "A300B" );
		this.setMarque( Marque.RENO );
		this.setMoteur( null );
	}
	
	//avec paramètres
	public A300B( Double prix, String nom, Marque nomMarque ) {
		super();
	}
}
