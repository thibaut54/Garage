package fr.oc.garage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import fr.oc.exception.GarageVideException;
import fr.oc.vehicule.Vehicule;

public class Garage {
	
	//private static final long serialVersionUID = 1L;
	

	public List<Vehicule> voitures;
	private String logo = "****************************\n"
 						+ "*  Garage OpenClassrooms   *\n"
 						+ "****************************";

	//----------CONSTRUCTEURS
	//par défaut
	public Garage() {
		voitures = new ArrayList<>();
		voitures = unserialArray( voitures );
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
	public List<Vehicule> serialArray( List<Vehicule> vSerial ) {
		try {
			FileOutputStream fos = new FileOutputStream( "garage.txt" );
			ObjectOutputStream oos = new ObjectOutputStream( fos );
			oos.writeObject( vSerial );
			oos.close();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		return vSerial;
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Vehicule> unserialArray( List<Vehicule> vUnserial ) {
//		File f = new File( "garage.txt" );
//		
//		try {
//			testFichierExist(f);
//		} catch ( GarageVideException e ) {
//			e.getMessage();
//		}
//		FileInputStream fis = null;
//		ObjectInputStream ois = null;
//		
//		boolean doNext = true;
//		
//
//		// open the stream now
//		try {
//			fis = new FileInputStream( f );
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			
//			// Tempt to read object from stream :
//			ois = new ObjectInputStream( fis );
//			
//			
//		} catch( EOFException | StreamCorruptedException e ) {
//			System.err.println( "Le contenu du fichier spécifié est invalide." );
//			doNext = false;
//		} catch ( IOException e ) {
//			System.err.println( "IO shit" );
//			doNext = false;
//		}
//		
//		if (doNext) {
//			try {
//				try {
//					vUnserial = ( List<Vehicule> ) ois.readObject();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					System.err.println( "IO shit 2" );
//				}
//
//			} catch (ClassNotFoundException e) {
//				
//			}
//		}
//
//		
//		try {
//			Thread.sleep( 10 );
//		} catch ( InterruptedException e ) {
//			e.printStackTrace();
//		}
//		System.out.println( logo );
//		return vUnserial;
//	}
	
	//Methode de dé-serialization
	@SuppressWarnings("unchecked")
	public List<Vehicule> unserialArray( List<Vehicule> vUnserial ) {
		
		try {
			File f = new File( "garage.txt" ); 
			testFichierExist(f);
			try {
			FileInputStream fis = new FileInputStream( "garage.txt" );
			ObjectInputStream ois = new ObjectInputStream( fis );
//			testFichier( ois );
			vUnserial = ( List<Vehicule> )ois.readObject();
//			testFichier( vUnserial ); 									//Fonctionne pas... pb à régler avec Etienne
			ois.close();
			} catch ( EOFException | StreamCorruptedException e ) {
				 System.err.println( "Le contenu du fichier spécifié est invalide." );
			} catch ( IOException | ClassNotFoundException e ) {
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
		return vUnserial;
	}
	
	//Methode visant à tester le contenu du fichier garage.txt afin de s'assurer qu'il contient bien une arrayList d'objet de type Voiture...
	//...mais j'arrive pas à la faire fonctionner !!!
//	private  testFichier ( ObjectInputStream list , List<Vehicule> vUnserialTemp ) throws ContenuFichierInvalideException {
//		if( !( list instanceof List ) ) {
//			throw new ContenuFichierInvalideException( );
//		} else {
//			vUnserialTemp = ( List<Vehicule> )list.readObject() );
//		}
//		return vUnserialTemp;
//	}
	
//	private List<T> void testFichier( Object objectList ) {
//		List<Vehicule> list = new ArrayList<>();
//		if ( objectList instanceof List<?> ) {
//			for ( Object object : (List<?> ) objectList) {
//				if ( object instanceof Vehicule ) {
//					list.add( ( Vehicule ) object );
//				}
//			}
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
