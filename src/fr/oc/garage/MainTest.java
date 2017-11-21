package fr.oc.garage;

import fr.oc.moteur.MoteurElectrique;
import fr.oc.moteur.MoteurEssence;
import fr.oc.option.BarreDeToit;
import fr.oc.option.Climatisation;
import fr.oc.option.GPS;
import fr.oc.option.SiegeChauffant;
import fr.oc.option.VitreElectrique;
import fr.oc.vehicule.A300B;
import fr.oc.vehicule.Lagouna;
import fr.oc.vehicule.Vehicule;

public class MainTest {

	public static void main(String[] args) {
		Garage garage = new Garage();   
    	System.out.println(garage);


    	Vehicule lag1 = new Lagouna();
    	lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
    	lag1.addOption(new GPS());
    	lag1.addOption(new SiegeChauffant());
    	lag1.addOption(new VitreElectrique());
    	garage.addVoiture(lag1);
    	
    	Vehicule A300B_2 = new A300B();
    	A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
    	A300B_2.addOption(new Climatisation());
    	A300B_2.addOption(new BarreDeToit());
    	A300B_2.addOption(new SiegeChauffant());
    	garage.addVoiture(A300B_2);
    	
    	Vehicule lag2 = new Lagouna();
    	lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
    	lag1.addOption(new GPS());
    	lag1.addOption(new SiegeChauffant());
    	lag1.addOption(new VitreElectrique());
    	garage.addVoiture(lag2);

    	System.out.println( garage );
    	
	}

}
