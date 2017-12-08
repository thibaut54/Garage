package fr.oc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.oc.vehicule.A300B;
import fr.oc.vehicule.D4;
import fr.oc.vehicule.Lagouna;
import fr.oc.vehicule.Vehicule;

class TestConstructeurVehicule {

	@Test
	void testCtorLag() {
		Vehicule lag = new Lagouna();
		assertNotNull(lag);
	}
	
	@Test
	void testCtorA300B() {
		Vehicule a300 = new A300B();
		assertNotNull(a300);
	}
	
	@Test
	void testCtorD4() {
		Vehicule d4 = new D4();
		assertNotNull(d4);
	}

}
