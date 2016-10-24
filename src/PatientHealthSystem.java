import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PatientHealthSystem {
	public static String userID;
	public static int isHS;
	public static int isPatient;
	public static int isSick;
	public static String userName;
	//private int userInput;
	static Scanner reader;
	
	
	
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
		//clearScreen();
		System.out.println("###########################################");
		System.out.println("### Patient Health Management System ######");
		System.out.println("###########################################");
		
	}
	
	public static void main(String args[]){
		//String userInput="";
		reader = new Scanner(System.in);
		while(true){
			showInitialScreen();
			displayLoginScreen();
			
		}
	}
	
	public static void displayLoginScreen(){
		showInitialScreen();
		
		System.out.println("Enter Option: ");
		System.out.println("1. Login");
		System.out.println("2. SignUp");
		System.out.println("3. Quit");
		int userInput = reader.nextInt();
		if(userInput==1){
			displayEnterUIDAndPassword();
		}
	}
	public static void displayEnterUIDAndPassword(){
		
		System.out.println("Enter UID");
		String UID = reader.nextLine();
		System.out.println("Enter Password");
		String Password = reader.nextLine();
		
		boolean isLogin = CommandRunner.runLoginCommand(UID,Password);
		if(isLogin){
			System.out.println("Login Successfull, Welcome " + userName);
			if(isPatient==1 && isHS==1){
				System.out.println("Selection your Role");
				System.out.println("1. Patient");
				System.out.println("2. Health Supporter");
				int loginRole = reader.nextInt();
				if(loginRole==1){
					displayPatientHome();
				}
				if(loginRole ==2){
					displayHealthSupporterHome();
				}
				// call display based on user selection
			}else if(isPatient==1){
				displayPatientHome();
			}else if(isHS==1){
				displayHealthSupporterHome();
			}
		}else{
			
		}
	}
	
	public static void displayPatientHome(){
		System.out.println("Enter any below options: ");
		System.out.println("\n1. My Disease");
		System.out.println("\n2. My Observation");
		System.out.println("\n3. My Recommendation");
		System.out.println("\n4. My Health Supporters");
	}
	
	public static void displayHealthSupporterHome(){
		System.out.println("Enter any below options: ");
		System.out.println("\n1. My Disease");
		System.out.println("\n2. My Observation");
		System.out.println("\n3. My Recommendation");
		System.out.println("\n4. My Health Supporters");
	}
	
	
}
