package fr.oc.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.Serializable;
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
		voitures.add( voit );
		serialArray( voitures );

	}
	
	//Methode de serialization
	public void serialArray( List<Vehicule> vSerial ) {
		try {
			FileOutputStream fos = new FileOutputStream( "garage.txt" );
			ObjectOutputStream oos = new ObjectOutputStream( fos );
			oos.writeObject( vSerial );
			oos.close();
		} catch ( IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Methode de dé-serialization
	@SuppressWarnings("unchecked")
	public List<Vehicule> unserialArray( List<Vehicule> vUnserial ) {
		File f = new File( "garage.txt" );
		if( f.exists() ) {
			try {
				FileInputStream fis = new FileInputStream( "garage.txt" );
				ObjectInputStream ois = new ObjectInputStream( fis );
				retraitDoublons( vUnserial );
				vUnserial = ( List<Vehicule> )ois.readObject();
				System.out.println( logo );
				ois.close();
			} catch ( IOException e ) {
				e.printStackTrace();
			} catch ( ClassNotFoundException e ) {
				e.printStackTrace();
			}
		}else {
			System.out.println( "Aucune voiture sauvegardée !\n" + logo );
		}
		return vUnserial;
	}
	
	public List<Vehicule> retraitDoublons( List<Vehicule> V ){
		for( int i = 0; i < V.size(); i++ ){
			for( int j = i + 1; j<V.size(); j++ ){
				if( V.get( i ).equals( V.get(j) ) ){
					V.remove( j );
					j--;
				}
			}
		}
		return V;
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Vehicule voiture : voitures) {
			str += ( "+ " + voiture );
		};
		return str;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((voitures == null) ? 0 : voitures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garage other = (Garage) obj;
		if (voitures == null) {
			if (other.voitures != null)
				return false;
		} else if (!voitures.equals(other.voitures))
			return false;
		return true;
	}
	
	
}
