package com.activity11;

public class SolarSystem {
	
	String [] planets;
	String solarSystemName;
	int numberOfKnownPlanets;
	
	//Planet Properties
	String planetName;
	double planetDistanceFromSum;
	int orbitalPeriod;
	double radius;


	public SolarSystem(String name, int numberOfPlanets, String [] planets) {
		this.planets = planets;
		this.numberOfKnownPlanets = numberOfPlanets;
		this.solarSystemName = name;
	}
	
	public void displayAllPlanets() {
		System.out.println(this.numberOfKnownPlanets + " Planets of " + this.solarSystemName + ":");
		for(int i = 0; i < planets.length; i++) {
			if(i < planets.length - 1) {
				System.out.print(planets[i] + ", ");
			}else {
				System.out.print(planets[i]);
			}
		}
	}
	
	public void displayPlanets(String [] planets) {
		for(int i = 0; i < planets.length; i++) {
			if(i < planets.length - 1) {
				System.out.print(planets[i] + ", ");
			}else {
				System.out.print(planets[i]);
			}
		}
	}
	
	public void setPlanetProperty(double distanceFromSun, int orbitalPeriod, double radius){
		this.planetDistanceFromSum = distanceFromSun;
		this.orbitalPeriod = orbitalPeriod;
		this.radius = radius;
	}
	
	public void showPlanetProperty() {
		System.out.println("Distance From Sun: " + this.planetDistanceFromSum + " km");
		System.out.println("Orbital Period: " + this.orbitalPeriod + " days");
		System.out.println("Radius: " + this.radius + " km");
	}
	
	public void planetName(String name) {
		System.out.println(name + ": ");
	}
	
	
	
	
	


}


