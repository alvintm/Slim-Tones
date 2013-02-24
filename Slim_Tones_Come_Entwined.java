/*
* Slim Tones: Come Entwined
* 
* With source text from "Aftermath" by Sylvia Plath
* 
* Created by Alvin T. Mwijuka
* Copyright (c) 2012 Massachusetts Institute of Technology. 
* All rights reserved.
* 
*/
package Slim_Tones;
import java.util.Random;

public class Slim_Tones_Come_Entwined {

	static Random generator = new Random();

	static String[] consonant = {"b","c","d","f","g","h","k","l","m","n","p","r","s","t","ch","ph","st","sh"};
	static String[] vowel = {"a","e","i","o", "u", "y"};
	static String[] article = {"A","The"};
	static String[] source = {"Compelled by calamity's magnet",
		"They loiter and stare as if the house", 
		"Burnt-out were theirs, or as if they thought",
		"Some scandal might any minute ooze",
		"From a smoke-choked closet into light;",
		"No deaths, no prodigious injuries",
		"Glut these hunters after an old meat,",
		"Blood-spoor of the austere tragedies.",
		"Mother Medea in a green smock",
		"Moves humbly as any housewife through",
		"Her ruined apartments, taking stock",
		"Of charred shoes, the sodden upholstery:",
		"Cheated of the pyre and the rack,",
		"The crowd sucks her last tear and turns away."};

	public static void main(String[] args) {	

		while (true){

			String noun = getNoun();
			String verb = getVerb();
			System.out.println(get(source));
			System.out.println("The" + noun + " has come and has"+ verb+"d");
			
			System.out.println(get(source));
			System.out.println(get(source));
			System.out.println("A" + noun + " will come and"+ verb);			
			System.out.println();

			try {				
				Thread.sleep(14000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

	public static String get (String[] array) {
		int rnd = generator.nextInt(array.length);
		return array[rnd];
	}

	public static String getVerb(){
		String[] bConsonant = {"ch","ph","cr","tr","st","sh"}; // beginning
		String[] eConsonant = {"b","c","d","f","g","k","l","m","n","p","r","t"}; // ending
		return " " + get(bConsonant)+get(vowel)+get(eConsonant) + 'e';
	}

	public static String getNoun(){	
		return " " + get(consonant) + get(vowel) + get(consonant) + get(vowel);
	}

}

