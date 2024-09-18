import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What Year Comes to mind?");
		int yeAr = in.nextInt();
		System.out.println("Give me a country");
		in.nextLine();
		String couNtry = in.nextLine();
		System.out.println("Give me an animal");
		String aniMal = in.nextLine();
		System.out.println("Five me a planet");
		String plaNet = in.nextLine();
		System.out.println("Give me a name");
		String friendName = in.nextLine();
		System.out.println("Give me a random object");
		String oBject = in.nextLine();
		System.out.println("Give Me a sport");
		String sPort = in.nextLine();
		System.out.println("Give me a number");
		int numberOfDays = in.nextInt();
		System.out.println("Give me a dance");
		String danCe = in.nextLine();
		System.out.println("Give me an attack");
		String aTtack = in.nextLine();
		
		
		System.out.println("The Year is (Year) And aliens have landed in (Place), The aliens closleyb resemble (animal). They claim they come from (Planet) and are here to make friends. (NAME2) and I offer to be thier friend and they let us in thier spaceship it kind of looks like a (Random object) Once we are inside we teach them how to play (sport) and they love it. WE play for (numberofdays) days but we then realize they wont let us leave.So when one comes over we do the (dance) to distract them and when hen isnt paying attention we (ATTACK) Him and escape.  ");

	}

}
