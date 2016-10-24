import java.io.IOException;
import java.util.Scanner;

public class PatientHealthSystem {
	public static void showMainMenu(){
		
	}
	
	public static void clearScreen(){
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
        */
	}
	
	public static void showInitialScreen(){
		clearScreen();
		System.out.println("###########################################");
		System.out.println("### Patient Health Management System ######");
		System.out.println("###########################################");
	}
	
	public static void main(String args[]){
		String userInput="";
		while(!userInput.equals("QUIT")){
			showInitialScreen();
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter Option: ");
			userInput = reader.nextLine();
		}
	}
}
