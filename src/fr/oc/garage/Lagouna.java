package fr.oc.garage;


public class Lagouna extends Vehicule {

	private static final long serialVersionUID = 1L;

	//----------CONSTRUCTEUR----------
	//par d�faut
	public Lagouna() {
		this.setPrixVehicule( 23123d );
		this.setNom( "Lagouna" );
		this.setMarque( Marque.PIGEOT );
		this.setMoteur( null );
	}
	
	//avec param�tres
	public Lagouna( Double prixVehicule, String nom, Marque nomMarque ) {
		super();
	}
}

	
	
