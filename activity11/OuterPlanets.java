package com.activity11;

public class OuterPlanets extends SolarSystem {

	public OuterPlanets(String name, int numberOfPlanets, String[] planets) {
		super(name, numberOfPlanets, planets);
	}
	
	public void showOuterPlanets(String [] innerPlanets) {
		System.out.println(super.solarSystemName + " Inner Planets: ");
		super.displayPlanets(innerPlanets);
	}
	
	
	//Jupiter
		public class Jupiter extends InnerPlanets{
			int days;
			String composition;
			public Jupiter(String name, int numberOfPlanets, String[] planets) {
				super(name, numberOfPlanets, planets);
			}
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, int days, String composition) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				super.showPlanetProperty();
				this.days = days;
				this.composition = composition;
				System.out.println("Days: " + this.days + " hours");
				System.out.println("Compostion: " + this.composition);
			}
		}
	//Saturn
		public class Saturn extends InnerPlanets{
			double mass;
			String rings;

			public Saturn(String name, int numberOfPlanets, String[] planets) {
				super(name, numberOfPlanets, planets);
			}
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, double mass, String rings) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				super.showPlanetProperty();
				this.mass = mass;
				this.rings = rings;
				System.out.println("Mass: " + mass);
				System.out.println("Rings: " + rings);
			}
		}
	//Uranus
		public class Uranus extends InnerPlanets{
			String nickname;
			int moonCount;
			
			public Uranus(String name, int numberOfPlanets, String[] planets) {
				super(name, numberOfPlanets, planets);
			}
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, String nickname, int moonCount) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				super.showPlanetProperty();
				this.nickname = nickname;
				this.moonCount = moonCount;
				System.out.println("Nickname: " + this.nickname);
				System.out.println("No of Moons: " + this.moonCount);
			}
		}
	//Neptune
		public class Neptune extends InnerPlanets{
			String planetType;
			boolean lifeSupport;
			
			public Neptune(String name, int numberOfPlanets, String[] planets) {
				super(name, numberOfPlanets, planets);
			}
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, String planetType, boolean lifeSupport) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				super.showPlanetProperty();
				this.planetType = planetType;
				this.lifeSupport = lifeSupport;
				
				System.out.println("Planet Type: " + this.planetType);
				System.out.println("Life Support: " + lifeSupport);
				
			}
		}

}
