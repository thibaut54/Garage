package fr.oc.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
	
	private List<Vehicule> voitures;
	
	private String logo = "****************************\n"
 						+ "*  Garage OpenClassrooms   *\n"
 						+ "****************************";
	
	private File f = new File( "garage.ser" );

	//----------CONSTRUCTEURS
	//par défaut
	public Garage() {
		voitures = new ArrayList<Vehicule>();
		voitures = deserialArray( voitures );
	}
	
	
	//----------METHODES
	//Methode d'ajout d'un objet Vehicule à la liste de voiture que contient l'objet garage
	//Avant d'ajouter l'objet, on vérifie qu'il n'est pas déjà présent dans la liste
	public void addVoiture( Vehicule voit ) {
		if( ! voitures.contains( voit ) ) {
			voitures.add( voit );
			voitures = serialArray( voitures );
		}
	}
	
	//Methode de serialization
	public List<Vehicule> serialArray( List<Vehicule> voitures ) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( f ) ) );
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
			testFichierExist( f );
			ObjectInputStream ois = new ObjectInputStream( new BufferedInputStream( new FileInputStream( f ) ) );
			deserial = ( ArrayList<Vehicule> ) ois.readObject();
			ois.close();
		} catch ( EOFException | StreamCorruptedException e ) {
			System.err.println( "Le contenu du fichier spécifié est invalide." );
		} catch ( GarageVideException e ) {
			e.getMessage();
		} catch ( IOException | ClassNotFoundException e ) {
			e.printStackTrace();
		}

		try {
			//Appelle à la methode sleep afin de garantir un affichage correcte. 
			//Sans ça, au 1er lancement du garage, le message d'erreur peut apparaître après le logo.
			Thread.sleep(10);
		} catch ( InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println(logo);
		return deserial;
	}
	
	
	//Methode qui teste l'existence du fichier garage.ser et affiche un message d'erreur conformément à l'énoncé du TP
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
