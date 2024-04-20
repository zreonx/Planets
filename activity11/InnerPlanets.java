package com.activity11;

	public class InnerPlanets extends SolarSystem {
		
		public InnerPlanets(String name, int numberOfPlanets, String[] planets) {
			super(name, numberOfPlanets, planets);
		}
		
		public void showInnerPlanets(String [] innerPlanets) {
			System.out.println(super.solarSystemName + " Inner Planets: ");
			super.displayPlanets(innerPlanets);
		}
		
		
		//Mercury
		public class Mercury extends InnerPlanets{
			
			int rotation;
			double diameter;

			public Mercury(String name, int numberOfPlanets, String[] planets) {
				super(name, numberOfPlanets, planets);
			}
			
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, int rotation, double diameter) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				this.rotation = rotation;
				this.diameter = diameter;
				super.showPlanetProperty();
				System.out.println("Days of Rotation: " + this.rotation);
				System.out.println("Diameter: " + this.diameter);
			}
		}
		
		//Venus
			public class Venus extends InnerPlanets{
				double temperature;
				String color;
				
				public Venus(String name, int numberOfPlanets, String[] planets) {
					super(name, numberOfPlanets, planets);
				}
				
				
				public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, String color, double temperature) {
					super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
					super.showPlanetProperty();
					this.color = color;
					this.temperature = temperature;
					System.out.println("Color: " + this.color);
					System.out.println("Temperature: " + this.temperature + " degree celcius");
				}
			}
		//Earth
		public class Earth extends InnerPlanets{
			
			boolean hasMoon;
			boolean containsOxygen;
			double gravity;

			public Earth(String name, int numberOfPlanets, String[] planets, boolean hasMoon) {
				super(name, numberOfPlanets, planets);
				this.hasMoon = hasMoon;
			}
			
			
			public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, boolean oxygen, double gravity) {
				super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
				super.showPlanetProperty();
				this.containsOxygen = oxygen;
				this.gravity = gravity;
				System.out.println("Gravity: " + this.gravity);
				System.out.println("Has Oxygen: " + this.containsOxygen);
			}
			
			public class Moon extends Earth {	
				String [] moonPhases = {"New Moon", "Warning Crescent", "Third Quarter", "Warning Gibbous", "Full Moon", "Waxing Gibous", "First Quarter", "Waxing Crescent"};
				int moonPhaseCount = moonPhases.length;
				
				public Moon(String name, int numberOfPlanets, String[] planets, boolean hasMoon) {
					super(name, numberOfPlanets, planets, hasMoon);
				}
				
				public void moonProperties() {
					System.out.println("No. Of Moon Phases: " + this.moonPhaseCount);
					System.out.println("Moon Phases List: ");
					for(int i = 0; i < this.moonPhases.length; i++) {
						if(i < this.moonPhases.length - 1) {
							System.out.print(moonPhases[i] + ", ");
						}else {
							System.out.print(moonPhases[i]);
						}
					}
				}
				
			}
			
		}
		
		//Mars
			public class Mars extends InnerPlanets{
				double pressure;
				String atmosphere;
				
				public Mars(String name, int numberOfPlanets, String[] planets) {
					super(name, numberOfPlanets, planets);
				}
				
				
				public void planetProperty(double distanceFromSun, int orbitalPeriod, double radius, double pressure, String atmosphere) {
					super.setPlanetProperty(distanceFromSun, orbitalPeriod, radius);
					super.showPlanetProperty();
					this.pressure = pressure;
					this.atmosphere = atmosphere;
					System.out.println("Pressure: " + this.pressure);
					System.out.println("Atmosphere: " + this.atmosphere);
				}
			}
	
		
	}
	
	