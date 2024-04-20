package com.activity11;

public class Main {

	public static void main(String[] args) {
		//Solar System
			String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
			SolarSystem ourSystem = new SolarSystem("Solar System", planets.length, planets);
			ourSystem.displayAllPlanets();
			System.out.println("\n");
			
		//Inner Planets
			String [] innerPlanets = {"Mercury", "Venus", "Earth", "Mars"};
			InnerPlanets innerPlanet = new InnerPlanets("Solar System", planets.length, planets);
			innerPlanet.showInnerPlanets(innerPlanets);
			System.out.println("\n");
		
		//Outer Planets
			String [] outerPlanets = {"Jupiter", "Saturn", "Uranus", "Neptune"};
			OuterPlanets outerPlanet = new OuterPlanets("Solar System", planets.length, planets);
			outerPlanet.showOuterPlanets(outerPlanets);
			System.out.println("\n");
			
		//Mercury
			InnerPlanets.Mercury mercury = innerPlanet.new Mercury("Solar System", planets.length, planets);
			ourSystem.planetName("Mercury");
			mercury.planetProperty(58 , 88, 2439.7, 59, 4.879);
			System.out.println("");
			
		//Venus
			InnerPlanets.Venus venus = innerPlanet.new Venus("Solar System", planets.length, planets);
			ourSystem.planetName("Venus");
			venus.planetProperty(108000000.2 , 225 , 6051.8, "Light Yellowish", 475.0);
			System.out.println("");
		
		//Earth
			InnerPlanets.Earth earth = innerPlanet.new Earth("Solar System", planets.length, planets, true);
			ourSystem.planetName("Earth");
			earth.planetProperty(149000000.6 , 365, 6371, true, 9.807);
			
			InnerPlanets.Earth.Moon moon = earth.new Moon("Solar System", planets.length, planets, true);
			moon.moonProperties();
			System.out.println("\n");
			
		//Mars
			InnerPlanets.Mars mars = innerPlanet.new Mars("Solar System", planets.length, planets);
			ourSystem.planetName("Mars");
			mars.planetProperty(227000000.9 , 687 , 3389.5, 6.518, "Very thin");
			System.out.println("");
			
			
		//Jupiter
			OuterPlanets.Jupiter jupiter = outerPlanet.new Jupiter("Solar System", planets.length, planets);
			ourSystem.planetName("Jupiter");
			jupiter.planetProperty(778000000.5 , 4380, 69911, 10, "Helium and Hydrogen");
			System.out.println("");
		
		//Saturn
			OuterPlanets.Saturn saturn = outerPlanet.new Saturn("Solar System", planets.length, planets);
			ourSystem.planetName("Saturn");
			saturn.planetProperty(1000000000.434  , 10585, 58232, 5.683, "D ring, C ring, B ring, Cassini Division, A ring, F ring, G ring, and finally, the E ring");
			System.out.println("");
			
		//Uranus
			OuterPlanets.Uranus uranus = outerPlanet.new Uranus("Solar System", planets.length, planets);
			ourSystem.planetName("Uranus");
			uranus.planetProperty(2000000000.871 , 30660, 25362, "Bulls-eye planet", 27);
			System.out.println("");
		
		//Neptune
			OuterPlanets.Neptune neptune = outerPlanet.new Neptune("Solar System", planets.length, planets);
			ourSystem.planetName("Neptune");
			neptune.planetProperty(4000000000.495 , 60225, 24622, "Ice giant", false);
			System.out.println("");
			
			
		

	}

}
