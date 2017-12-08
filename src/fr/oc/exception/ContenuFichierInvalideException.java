package fr.oc.exception;

import java.io.EOFException;

public class ContenuFichierInvalideException extends EOFException{

	private static final long serialVersionUID = 3084726044216569170L;

	public ContenuFichierInvalideException( ) {
		System.err.println( "Le contenu du fichier est invalide." );
	}
	
}
