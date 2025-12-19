package app;

import service.ElementService;
import java.util.List;
import java.util.Scanner;

public class PeriodicTableApp {

    public static void main(String[] args) { 
    	String str = "I love India";
    	
    	String rev = new StringBuilder(str).reverse().toString();
    	ElementService es = new ElementService();
    	Scanner sc = new Scanner(System.in);
    	  	
    	while(true) {
    		System.out.println("\n=== PERIODIC TABLE MENU ===");
    		System.out.println("1. Search by Atomic Number");
    		System.out.println("2. Search by Symbol");
    		System.out.println("3. Exit");
    		System.out.println("Choose option: ");
    		
    		int choice = sc.nextInt();
    		
    		switch(choice) {
    		case 1:
    			System.out.print("Enter Atomic Number: ");
    			es.findByAtomicNumber(sc.nextInt());
    			break;
    			
    		case 2:
    			System.out.print("Enter Atomic Symbol: ");
    			es.findByAtomicSymbol(sc.next());
    			break;
    		case 3:
    			System.out.println("Thank you!");
                System.exit(0);
    		default:
                System.out.println("Invalid choice!");    
    		}
    	}
    }
}
