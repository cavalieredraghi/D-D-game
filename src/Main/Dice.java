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
//This one is for a percentile or 100 sided die
	public void getd100(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 100 + 1));
	}
//This one is for a 10 sided die
	public void getd10(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 10 + 1));
	}
	
	//this one is for a 8 sided die
	public void getd8(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 8 + 1));
	}
	//this one is for a 6 sided die
	public void getd6(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 6 + 1));
	}
	//this is for a 4 sided die
	public void getd4(){
		System.out.println(ThreadLocalRandom.current().nextInt(1, 4 + 1));
	}
	
}
