package app;


/* Asking questions.
 * 
 * What we want to do now is get you getting data into your programs.
 * This though is a little tricky so we have to have you learn to do two things that
 * may not make sense right away.
 *
 * Most of what software does is the following:
 *
 * -Take some kind of input from a person.
 * -Change it.
 * -Print out something to show how it changed.
 * 
 * So far you've only been printing, but you haven't been able to get any input from
 * a person, or change it. You may not even know what "input" means, so rather than talk
 * about it, let's have you do some and see if you get it.
 * 
 * Change the program so that it reads in the height in two parts. The first part should
 * read in an int for the number of feet. Then read in a second int for the number of inches.
 * Make the output look the same.
 * 
 * 
 */


import java.util.Scanner;

public class App {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " old, " + height + " tall and " + weight + " heavy." );
        
        keyboard.close();
	}
}