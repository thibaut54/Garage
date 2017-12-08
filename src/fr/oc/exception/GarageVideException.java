package fr.oc.exception;

public class GarageVideException extends Exception{

	private static final long serialVersionUID = -7231239137246447338L;

	public GarageVideException() {
		System.err.println( "Aucune voiture sauvegardée !" );
	}
	
}
