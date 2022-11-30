package com.anderson.java_encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		HumanBeing human1 = new HumanBeing();
		
	// using setters of HumanBeing Class to set variables to values
		
		human1.setHeight(1.65f);
		human1.setWeight(68);
		human1.setBmi(calculateBmi(human1));
		
		// using getters of HumanBeing Class
		System.out.println("This human has " + human1.getWeight() + " kgs and is " + human1.getHeight() + " meters in height, which results in a BMI of " + human1.getBmi());
	}
	
	public static float calculateBmi(HumanBeing human1) {
		return human1.getWeight()/(human1.getHeight() * human1.getHeight());
	}

}
