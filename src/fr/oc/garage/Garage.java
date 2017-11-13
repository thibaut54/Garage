package fr.oc.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Garage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	private List<Vehicule> voitures;
	private String logo = "****************************\n"
 						+ "*  Garage OpenClassrooms   *\n"
 						+ "****************************";

	//----------CONSTRUCTEURS
	//par défaut
	public Garage() {
		voitures = new ArrayList<>();
		voitures = deserialArray(voitures);
	}
	

	//----------GETTERS
	public List<Vehicule> getVoitures() {
		return voitures;
	}
	
	//----------METHODES
	public void addVoiture(Vehicule voit) {
		voitures.add( voit );
//		serialization(this);
		serialArray( voitures );
		
	}
	
	public void serialArray(List<Vehicule> voitures) {
		try {
			FileOutputStream fos = new FileOutputStream( "vehiculeList.txt" );
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject( voitures );
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Vehicule> deserialArray(List<Vehicule> voitures) {
		File f = new File("vehiculeList.txt");
		if( f.exists() ) {
			try {
				FileInputStream fis = new FileInputStream( "vehiculeList.txt" );
				ObjectInputStream ois = new ObjectInputStream(fis);
				voitures = (List<Vehicule>)ois.readObject();
				System.out.println( logo );
//				System.out.println( voitures );
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println( "Aucune voiture sauvegardée !\n" + logo );
		}
		return voitures;
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
