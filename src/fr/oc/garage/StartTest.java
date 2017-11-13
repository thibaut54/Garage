package fr.oc.garage;

import java.util.ArrayList;
import java.util.List;

public class StartTest {

	public static void main(String[] args) {
		List<Option> options = new ArrayList<>();
		
		GPS gps = new GPS();
		System.out.println( gps );
		 
		Climatisation clim = new Climatisation();
		System.out.println( clim );

		options.add( gps );
		options.add( clim );
		System.out.println( options );
		
	}

}
