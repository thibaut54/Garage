package fr.oc.exception;

import java.io.StreamCorruptedException;

public class ContenuFichierInvalideException extends StreamCorruptedException{

	private static final long serialVersionUID = 3084726044216569170L;

	public ContenuFichierInvalideException( ) {
		System.err.println( "Le contenu du fichier est invalide." );
	}
	
}
