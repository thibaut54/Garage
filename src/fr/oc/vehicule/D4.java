package fr.oc.vehicule;

public class D4 extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par défaut
	public D4() {
		this.setPrixVehicule( 25147d );
		this.setNom( "D4" );
		this.setMarque( Marque.TROEN );
		this.setMoteur( null );
	}
}
