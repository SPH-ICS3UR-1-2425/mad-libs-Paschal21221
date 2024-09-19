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
		
		Scanner in = new Scanner(System.in){
		System.out.println("Welcome to Mad Libs Whats your name?");
		String name = in.nextLine();
		System.out.println("What Year Comes to mind?");
		int year = in.nextInt();
		System.out.println("Give me a country");
		in.nextLine();
		String country = in.nextLine();
		System.out.println("Give me an animal");
		String animal = in.nextLine();
		System.out.println("Five me a planet");
		String planet = in.nextLine();
		System.out.println("Give me a name");
		String friendname = in.nextLine();
		System.out.println("Give me a random object");
		String object = in.nextLine();
		System.out.println("Give Me a sport");
		String sport = in.nextLine();
		System.out.println("Give me a number");
		int numberofdays = in.nextInt();
		System.out.println("Give me a dance");
		in.nextLine();
		String dance = in.nextLine();
		System.out.println("Give me an attack");
		String attack = in.nextLine();
		System.out.println("The Year is "+year+"  And aliens have landed in "+country+" , The aliens closley resemble "+animal+" . They claim they come from "+planet+" and are here to make friends. "+friendname+" and I offer to be thier friend and they let us in thier spaceship it kind of looks like a "+object+" Once we are inside we teach them how to play "+sport+" and they love it. WE play for "+numberofdays+" days but we then realize they wont let us leave.So when one comes over we do the "+dance+" to distract them and when hen isnt paying attention we "+attack+" Him and escape.  ");
	}


