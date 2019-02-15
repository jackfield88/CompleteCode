import java.text.DecimalFormat;
import java.util.Scanner;

 
public class MenuExample {
	
	public static void main(String[]args) {
		double no=12.7856;
		DecimalFormat dec = new DecimalFormat("#0.000");
		System.out.println(dec.format(no));
		runMenu();
		
	}
	
// Running the menu 
    public static void runMenu() {
        printHeader();
        boolean exit = false;
		while (!exit) {
            printMenu();
            int choice = getMenuChoice();
            performAction(choice);
        }
    }

    private static void performAction(int choice) {
    	switch(choice){
    	case 1 : 
    		 System.out.println("please input accuracy option");
    		 Scanner in = new Scanner(System.in);
    		 OptionMethod.setdp(in.nextInt());
    		break;
    	case 2 :
    		 System.out.println("please input 3 vaules");
    		 Scanner input = new Scanner(System.in);
    		float a = input.nextInt();
    		float b = input.nextInt();
    		float c = input.nextInt();
    		System.out.println(Equations.linearEquation ( a,  b,  c ));
    		
    	case 3 : System.out.println("Please input student ID");
    			Scanner input = new Scanner 
    			
    					
    			
		
	}
// Introducing the user to the program//
    
	private static void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|Welcome to the console application|");
        System.out.println("|        Console Application         |");
        System.out.println("+-----------------------------------+");
    }
// Give the user all the options avaliable 
    private static void printMenu() {
        displayHeader("Please make a selection");
        System.out.println("1) Change Accuary ");
        System.out.println("2) Equations");
        System.out.println("3) Bubble Sort");
        System.out.println("4) Exit");
    }

    private static void displayHeader(String string) {
		// TODO Auto-generated method stub
		
	}
//
	private static int getMenuChoice() {
        Scanner d = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(d.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("Choice outside of range. Please chose again.");
            }
//Not allowing the user to enter a number outside the range 
//Range 1 - 4 
        } while (choice < 0 || choice > 4);
        return choice;
	
}
	
}