package fr.oc.garage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import fr.oc.exception.ContenuFichierInvalideException;
import fr.oc.exception.GarageVideException;
import fr.oc.vehicule.Vehicule;

public class Garage {
	
	//private static final long serialVersionUID = 1L;
	

	private List<Vehicule> voitures;
	private String logo = "****************************\n"
 						+ "*  Garage OpenClassrooms   *\n"
 						+ "****************************";

	//----------CONSTRUCTEURS
	//par défaut
	public Garage() {
		voitures = new ArrayList<Vehicule>();
		voitures = deserialArray( voitures );
	}
	
	
	//----------METHODES
	//Methode d'ajout d'un objet voiture passé en paramètre à la liste de voiture que contient l'objet garage
	public void addVoiture( Vehicule voit ) {
		if( ! voitures.contains( voit ) ) {
			voitures.add( voit );
			voitures = serialArray( voitures );
		}
	}
	
	//Methode de serialization
	public List<Vehicule> serialArray( List<Vehicule> voitures ) {
		try {
			FileOutputStream fos = new FileOutputStream( "garage.txt" );
			ObjectOutputStream oos = new ObjectOutputStream( fos );
			oos.writeObject( voitures );
			oos.close();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		return voitures;
	}
	
	
	//Methode de dé-serialization
	@SuppressWarnings("unchecked")
	public List<Vehicule> deserialArray( List<Vehicule> deserial ) {
		
		try {
			File f = new File( "garage.txt" ); 
			testFichierExist(f);
			
			try {
			FileInputStream fis = new FileInputStream( f );
			
				try {
					ObjectInputStream ois = new ObjectInputStream( fis );
//					testFichier( ois  );
					List<Vehicule> obj = ( ArrayList<Vehicule> ) ois.readObject();
//					testFichier( obj );
					deserial = obj;
//					testFichier( deserial ); 									//Fonctionne pas... pb à régler avec Etienne
					ois.close();
				} catch ( ContenuFichierInvalideException e ) {
					 e.getMessage();
				} catch ( EOFException e ) {
					 System.err.println( "Le contenu du fichier spécifié est invalide!" );
				}
				
			}  catch ( IOException | ClassNotFoundException e ) {
				e.printStackTrace();
			}
			
		} catch ( GarageVideException e ) { 
			e.getMessage();
		}
		
		try {
			Thread.sleep( 10 );
		} catch ( InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println( logo );
		return deserial;
	}
	
	
	//Methode visant à tester le contenu du fichier garage.txt afin de s'assurer qu'il contient bien une arrayList d'objet de type Voiture...
	//...mais j'arrive pas à la faire fonctionner !!!

	
//	private <T>  void testFichier( ArrayList<?> arrayList , Class<T> clazz ) throws ContenuFichierInvalideException {
//	    for(Object o : arrayList)
//	    {
//	        if (o != null &&  ! ( o.getClass() == clazz ) ) 
//	        {
//	        	throw new ContenuFichierInvalideException( );
//	        }
//	    }   
//	}
	
//	private <T> void testFichier (T obj) throws ContenuFichierInvalideException {
//		Class<?> zz = List.class;
//		if ( ! ( zz.isInstance( obj ) ) ) {
//			throw new ContenuFichierInvalideException( );
//		}
//	}
	
	private void testFichierExist( File f ) throws GarageVideException {
		if ( !f.exists() ) {
			throw new GarageVideException();
		}
	}

	
	@Override
	public String toString() {
		String str = "";
		for( Vehicule voiture : voitures ) {
			str += ( " + " + voiture );
		}
		return str;
	}
	
}
