package fr.oc.garage;


public class D4 extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par d�faut
	public D4() {
		this.setPrixVehicule( 25147d );
		this.setNom( "D4" );
		this.setMarque( Marque.TROEN );
		this.setMoteur( null );
	}
	
	//avec param�tres
	public D4( Double prix, String nom, Marque nomMarque ) {
		super();
	}
}
