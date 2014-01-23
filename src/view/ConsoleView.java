package view;

import model.Thingy;

import java.util.Scanner;

public class ConsoleView 
{
	//Declare a Scanner object to use in the console.
		private Scanner wordScanner;
		/**
		 * Declare a Thingy object from testing purposes
		 */
		private Thingy testThingy;
		/**
		 * 
		 */
		public ConsoleView()
		{
			wordScanner = new Scanner(System.in);
			testThingy = new Thingy();
			
		}
		
	public void start()
		{
//			getWords();
			reallyMeetTheThingyName();
			reallyMeetTheThingyFood();
			reallyMeetTheThingyMovie();
		}
	
	private void reallyMeetTheThingyName()

	{
		System.out.println("Hey im your new buddy, " + testThingy.getName());
		System.out.println("What do you want to change your name to?");
		
		String newName = wordScanner.nextLine();
		
		System.out.println("Are you really sure my name should be, " + newName + " , reaallly");
		System.out.println("Type Yes or No");
		
		String answer1 = wordScanner.nextLine();
			
		
		if (answer1.equalsIgnoreCase("yes"))
		{
			System.out.println("I love that name!");
			testThingy.setName(newName);
			System.out .println("My new name is " + testThingy.getName());	
		}
		else if (answer1.equalsIgnoreCase("no"))
		{
			System.out.println("The name " + newName + "wasn't very good anyways, pbbbt");
			reallyMeetTheThingyName();
		}
		else
		{
			System.out.println("Wow your dumb");
			reallyMeetTheThingyName();
		}	
	}	
	private void reallyMeetTheThingyFood()
	{
		System.out.println("My favorite food is " + testThingy.getFood());
		System.out.println("What do you want my favorite food to be?");
		
		String newFood = wordScanner.nextLine();
		
		System.out.println("Is " + newFood + " Really my favorite?");
		System.out.println("Type Yes or No");
		
		String answer2 = wordScanner.nextLine();
		
		if (answer2.equalsIgnoreCase("yes"))
		{
			System.out.println("Yummy my favorite!");
			testThingy.setFood(newFood);
			System.out.println("My new favorite food is " + testThingy.getFood());
		}
		else if (answer2.equalsIgnoreCase("no"))
		{
			System.out.println("I didn't like " + newFood + "anyways");
			reallyMeetTheThingyFood();
		}
		else
		{
			System.out.println("IM GOING TO EAT YOU!!");
			reallyMeetTheThingyFood();
		}
	}
	private void reallyMeetTheThingyMovie()
	{
		System.out.println("My favorite movie is " + testThingy.getMovie());
		System.out.println("What do you want my favorite movie to be?");
		
		String newMovie = wordScanner.nextLine();
		
		System.out.println("Is " + newMovie + " really my favoite?");
		System.out.println("Type Yes or No");
		
		String answer3 = wordScanner.nextLine();
		
		if (answer3.equalsIgnoreCase("Yes"))
		
		{
			System.out.println("Yeah, I love " + newMovie);
			testThingy.setMovie(newMovie);
			System.out.println("My new favorite movie is " + testThingy.getMovie());
		}
		else if (answer3.equalsIgnoreCase("No"))
		{
			System.out.println("I didn't like " + newMovie + " anyways.");
			reallyMeetTheThingyMovie();
		}
		else
		{
			System.out.println("OMG the horror, the horror!!!");
			reallyMeetTheThingyMovie();
		}
			
	  }
		
	
		
		public void start2()
		{
			System.out.println("How old are you?");
			getWords2();
		
		}
		
		public void start3()
		{
			System.out.println("What school you go to?");
			getWords3();
		
		}
		
		public void start4()
		{
			System.out.println("What do you like?");
			getWords4();
		
		}
		
		public void getWords()
		{
			String test = wordScanner.nextLine();
			System.out.print("nice to meet you. ");
			System.out.println(test);
		}	
		private void meetTheThingy()
		{
			System.out.println("Here is a Thingy: " + testThingy.getName());
			System.out.println("What do you want to change your name to?");
			
			String newName = wordScanner.nextLine();
			
			System.out.println("Are you really sure my name should be: " + newName + " reaallly");
			System.out.println("Type Yes or No");
			
			String answer = wordScanner.nextLine();
				
			
			if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("I love my new name!");
				testThingy.setName(newName);
				System.out .println("My new name is: " + testThingy.getName());	
			}
			else if (answer.equalsIgnoreCase("no"))
			{
				System.out.println("I never liked the name of: " + newName + " anyway, pbbbt");
				
			}
			else
			{
				System.out.println("Stop typing gibberish");
				meetTheThingy();
			}
		
		}
	
		public void getWords1()
		{
			String test = wordScanner.nextLine();
			System.out.print(test);
			System.out.println(" ,nice to meet you. ");
			start2();
		}
			
		
		public void getWords2()
		{
			String test = wordScanner.nextLine();
			System.out.print(test);
			System.out.println(" , Wow that cool.");
			start3();
				
		}
		
		public void getWords3()
		{
			String test = wordScanner.nextLine();
			System.out.print(test);
			System.out.println(" , Nice I go to CTEC");
			start4();
				
		}
		
		public void getWords4()
		{
			String test = wordScanner.nextLine();
			System.out.print(test);
			System.out.println(" , OMG! Me too.");
			
				
		}
		
		/**
		 * Ask the user four questions. Print their answers.
		 */
		public void questionsAndAnswers()
		{

		}
		
		
		
		public void show()
		{
			System.out.println("show this on my screen");
			System.out.println("My name is CJ");
			System.out.println("Im in Highschool");
			
		}
	}
