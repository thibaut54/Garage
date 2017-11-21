package fr.oc.garage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vSerial;
	}
	
	//Methode de dé-serialization
	@SuppressWarnings("unchecked")
	public List<Vehicule> unserialArray( List<Vehicule> vUnserial ) {
			try {
				FileInputStream fis = new FileInputStream( "garage.txt" );
				ObjectInputStream ois = new ObjectInputStream( fis );
				vUnserial = ( List<Vehicule> )ois.readObject();
				System.out.println( logo );
				ois.close();
			} catch ( IOException e ) {
				System.err.println( "Aucune voiture sauvegardée !\n" + logo );
			} catch ( ClassNotFoundException e ) {
				e.printStackTrace();
			} 
		return vUnserial;
	}

	
	@Override
	public String toString() {
		String str = "";
		for(Vehicule voiture : voitures) {
			str += ( "+ " + voiture );
		};
		return str;
	}
	
}
