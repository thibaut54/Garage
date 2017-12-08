package fr.oc.garage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

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
	
	//Methode de dé-serialization
	@SuppressWarnings("unchecked")
	public List<Vehicule> unserialArray( List<Vehicule> vUnserial ) {
//		File f = new File( "garage.txt" );
		try {
//			testFichierExist(f);
			FileInputStream fis = new FileInputStream( "garage.txt" );
			ObjectInputStream ois = new ObjectInputStream( fis );
//			testFichier( ois.readObject() );
			//Fonctionne pas... pb à régler avec Etienne
			vUnserial = ( List<Vehicule> )ois.readObject();
			ois.close();
		} catch ( FileNotFoundException e ) {
			System.err.println( "Aucune voiture sauvegardée !" );
		} catch( EOFException | StreamCorruptedException e ) {
			System.err.println( "Le contenu du fichier spécifié est invalide." );
		} catch ( IOException | ClassNotFoundException e ) {
			e.printStackTrace();
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
//	private <T> void testFichier (T obj) throws ContenuFichierInvalideException {
//		if (obj instanceof ArrayList<?>) {
//			throw new ContenuFichierInvalideException( "Le contenu du fichier spécifié est invalide." );
//		}
//	}
	
//	private void testFichierExist(File f) throws GarageVideException {
//		if ( f.exists() ) {
//			throw new GarageVideException();
//		}
//	}

	
	@Override
	public String toString() {
		String str = "";
		for( Vehicule voiture : voitures ) {
			str += ( " + " + voiture );
		}
		return str;
	}
	
}
