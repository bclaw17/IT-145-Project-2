package graziosoSalvare;
import java.util.Scanner;



public class Driver {

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);

        // Instance variables
    	String customersCountry;
    	String typeOfPetRequested;



        // Create New Dog
    	Dog chosenDog = new Dog();
    	


        // Create New Monkey
    	Monkey chosenMonkey = new Monkey();
    	

        // Method to process request for a rescue animal
    	System.out.println("Please enter pet type - Dog or Monkey: ");
    	typeOfPetRequested = scnr.nextLine();
    	System.out.println("Please enter your country of origin: ");
    	customersCountry = scnr.nextLine();
    	
    	if (customersCountry.equals(chosenDog.getInServiceCountry())&& typeOfPetRequested.equals("Dog")) {
    		System.out.println("A Dog in your country is available and has been reserved!!");
    		chosenDog.setReserved(true);
    	}
    	else if (customersCountry.equals(chosenDog.getInServiceCountry())&& typeOfPetRequested.equals("Monkey")) {
    		System.out.println("A Monkey in your country is available and has been reserved!!");
    		chosenMonkey.setReserved(true);
    	}
    	else {
    		System.out.println("No Monkeys or Dogs available in your country.");
    	}
    	
    	
    	
    	


        // Method(s) to update information on existing animals



        // Method to display matrix of aninmals based on location and status/training phase



        // Method to add animals



        // Method to out process animals for the farm or in-service placement



        // Method to display in-service animals



        // Process reports from in-service agencies reporting death/retirement



    }
}
