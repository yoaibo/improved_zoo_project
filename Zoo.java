package improved_zoo_project;

import java.util.ArrayList; 
import java.util.Scanner;  

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> zooList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Upgraded Zoo Management System!");
        
        try {
            System.out.print("Enter a name for your Mammal: ");
            String mammalName = scanner.nextLine();
            
            System.out.print("Enter a name for your Reptile: ");
            String reptileName = scanner.nextLine();
            
            zooList.add(new Mammal(mammalName, "Golden"));
            zooList.add(new Reptile(reptileName, true));
            
            System.out.println("\n--- Processing Zoo Animals ---");
            
            for (Animal animal : zooList) {
                animal.makeSound(); 
                System.out.println(animal.name + " belongs to kingdom: " + animal.getKingdom());
                System.out.println("--------------------");
            }
            
        } catch (Exception e) {
            System.out.println("An error occurred during data entry: " + e.getMessage());
        } finally {
            scanner.close(); // Clean up resource
        }
    }
}