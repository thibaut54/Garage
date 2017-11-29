package fr.oc.vehicule;

public class A300B extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par défaut
	public A300B() {
		this.setPrixVehicule( 28457d );
		this.setMarque( Marque.RENO );
		this.setMoteur( null );
	}
	
}
