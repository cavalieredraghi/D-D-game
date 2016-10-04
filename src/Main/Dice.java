package Main;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
//random range 1-20 to simulate a 20 sided die or D20
	public void getd20(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 20 + 1));
	}
//This one is for a 12 sided die
	public void getd12(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 12 + 1));
	}
	
	
	
	
}
