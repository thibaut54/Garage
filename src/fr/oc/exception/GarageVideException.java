package fr.oc.exception;

import java.io.FileNotFoundException;

public class GarageVideException extends FileNotFoundException{

	private static final long serialVersionUID = -7231239137246447338L;

	public GarageVideException() {
		System.err.println( "Aucune voiture sauvegardée !" );
	}
	
}
