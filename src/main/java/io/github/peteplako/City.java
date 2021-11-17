package io.github.peteplako;

public class City {
	//instance variables
	public String name;
	public long population;
	
	
	
	public City(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}


	
	public void display() {
		System.out.println("City name "+name);
		System.out.println("Population: "+population);
		
	}
	
	
	public static void main(String args[]) {
		
		City athens = new City("Athens",600000);
		//City thessaloniki = new City();
		
		athens.name="Athina";
		//thessaloniki.name="Salonica";
		
		//athens.population=5000000;
		//thessaloniki.population=2000000;
		
		athens.display();
		//thessaloniki.display();
		
		
	}

}
