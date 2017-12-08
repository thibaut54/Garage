package fr.oc.exception;

public class ContenuFichierInvalideException extends Exception{

	private static final long serialVersionUID = 3084726044216569170L;

	public ContenuFichierInvalideException( String message ) {
		super( message );
	}
	
	public ContenuFichierInvalideException(  ) {
		System.out.println( "bla" );
		
	}
}
