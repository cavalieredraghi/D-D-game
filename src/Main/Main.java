package Main;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dice sets are made here
		Dice d = new Dice();
		int die = 0;

		Scanner inputInfo = new Scanner(System.in);

		System.out.println("Welcome to Drixtel's Might(beta):");
		System.out.println(
				"In the is (beta) Create Your Own Adventure, you will have not have as many options avaible to you per the usual type of game.");
		System.out.println(
				"Note that at the end of a description in the story. You will be presented with choices make sure to correctly type the choices presented. ");
		System.out.println("Do you understand? (y)es/(n)o:");
		String str = inputInfo.nextLine();
		switch (str) {
		case "y":
			str = "Good you are ready to go!";
			break;
		case "n":
			str = "Nice Try!";
			break;
		}
		System.out.println(str);

		System.out.println("Now to set the stage:");
		System.out.println("Your journey has taken you far and wide. Your experience had given you");
		System.out.println("a name in the land, here and possibly beyond. That is what you think at");
		System.out.println("least when you receive a letter from a well known Lord Drixtel. He has");
		System.out.println("called for you personally to aid him in a possible job. His letter ");
		System.out.println("explains that he wished to see you. It was properly sealed so it had to");
		System.out.println("genuine. You then set out toward the Desert City-State of Conil, the ");
		System.out.println("jewel of the Azure Desert. You travel from the city known as Crossroads.");
		System.out.println("Your journey West takes several days as the air grows drier and drier. ");
		System.out.println("Till eventually you come across a ravine that looks like a keen place for ");
		System.out.println("an ambush.");

		System.out.println("Do you go down the ravine or try and find a way around: (r)avine/(e)xplore");
		String fc = inputInfo.nextLine();
		switch (fc) {
		case "r":
			fc = "You venture down the Ravine.";
			break;
		case "e":
			fc = "You explore for the next few hours around the ravine and ways to navigate some craig like rock out crops till you conclude you must travel down the Ravine.";
			break;
		}
		System.out.println(fc);
		System.out.println("Thank you for playing that initial version of the Drixtel's Might game.");
		System.out.println(" feel free to play around now with a dice roller program, which will hopfully be implemented later into the game.");
		
		// test for some of the dice integrations
		
		while (die != -1) {
			System.out.println("100) for 100 sided die");
			System.out.println("20) for 20 sided die");
			System.out.println("12) for 12 sided die");
			System.out.println("10) for 10 sided die");
			System.out.println("8) for 8 sided die");
			System.out.println("6) for 6 sided die");
			System.out.println("4) for 4 sided die");
			System.out.println("-1) to escape");

			die = inputInfo.nextInt();
			if (die == 100) {
				d.getd100();
			}
			if (die == 20){
				d.getd20();
			}
			if (die == 12){
				d.getd12();
			}
			if (die == 10){
				d.getd10();
			}
			if (die == 8){
				d.getd8();
			}
			if (die == 6){
				d.getd6();
			}
			if (die == 4){
				d.getd4();
			}else{
				System.out. println ( "Error please try again.");
			}
		}

	}

}
