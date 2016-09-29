package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputInfo = new Scanner (System.in);

		
		System.out.println("Welcome to Drixtel's Might(beta):");
		System.out.println("In the is (beta) Create Your Own Adventure, you will have not have as many options avaible to you per the usual type of game.");
		System.out.println("Note that at the end of a description in the story. You will be presented with choices make sure to correctly type the choices presented. ");
		System.out.println("Do you understand? Yes/No:");
		String str = inputInfo.nextLine();
			switch (str){
				case "Yes" : str = "Good you are ready to go!";
					break;
				case "No": str = "Nice Try!";
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
		
		System.out.println("Do you go down the ravine or try and find a way around: Ravine/Explore");
		String fc = inputInfo.nextLine();
			switch(fc){
				case "Ravine" : fc = "You venture down the Ravine.";
					break;
				case "Explore" : fc = "You explore for the next few hours around the ravine and ways to navigate some craig like rock out crops till you conclude you must travel down the Ravine.";
					break;
						}
		System.out.println(fc);
		
	}

}
