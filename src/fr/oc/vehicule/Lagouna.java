package fr.oc.vehicule;

public class Lagouna extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par défaut
	public Lagouna() {
		this.setPrixVehicule( 23123d );
		this.setNom( "Lagouna" );
		this.setMarque( Marque.PIGEOT );
		this.setMoteur( null );
	}
}

	
	
