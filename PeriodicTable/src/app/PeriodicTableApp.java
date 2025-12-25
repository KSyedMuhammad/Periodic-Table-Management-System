package app;
import service.ElementService;
import service.UserService;
import java.util.List;
import java.util.Scanner;

import model.User;

public class PeriodicTableApp {

    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in);
    	UserService userservice = new UserService();
       	ElementService es = new ElementService();
    	
       	while(true) {
    		System.out.println("\n==== WELCOME TO PERIODIC TABLE APP ====");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch(choice) {
            case 1: 
            	System.out.print("Enter Username: ");
            	String suUsername = sc.next();
            	
            	System.out.print("Enter Password: ");
            	String suPassword = sc.next();
            	
            	if (userservice.signup(suUsername, suPassword)) {
                    System.out.println("Signup successful! Please login.");
                } else {
                    System.out.println("Signup failed! Try another username.");
                }
                break;
                case 2: 
            	System.out.print("Enter Username: ");
            	String liUsername = sc.next();
            	System.out.print("Enter Password: ");
                String liPassword = sc.next();
                
                User user = userservice.login(liUsername, liPassword);
                if(user !=null) {
                	System.out.println("\nLogin Successful! Welcome "+user.getUsername());
                	
                	while(true) {
                		System.out.println("\n=== PERIODIC TABLE MENU ===");
                		System.out.println("1. Search by Atomic Number");
                		System.out.println("2. Search by Symbol");
                		System.out.println("3. View Full Periodic Table");
                		System.out.println("4. Logout");
                		System.out.print("Choice Option: ");
                		int opt = sc.nextInt();
                		switch(opt) {
                		     case 1: 
                		    	 System.out.print("Enter Atomic Number: ");
                                 es.findByAtomicNumber(sc.nextInt());
                                 break;
                		     case 2:
                		    	 System.out.print("Enter Atomic Symbol: ");
                		    	 es.findByAtomicSymbol(sc.next());
                		    	 break;
                		     case 3:
                		    	 es.viewAllElements();
                		    	 break;
                		     case 4: 
                		    	 System.out.print("Logged out successfully!");
                			     break;
                			 default : 
                				 System.out.println("Invalid option!");
                		}
                		if (opt == 4) break;
                	}
                } else {
                	System.out.println("Invalid username or password!");
                }
                break;
                case 3: 
            	System.out.println("Thank you for using Periodic Table App!");
                System.exit(0);
            default :
                System.out.println("Invalid choice!");

            } 
    	}
   }
}
