package view;

import javax.swing.JOptionPane;
import model.Friend;

public class FirstGUI
{
//	private Thingy myGUIThingy;
	private Friend selfFriend;
	private Friend kianiFriend;
	private Friend jarenFriend;
	private Friend noelFriend;
	
	public FirstGUI()
	{
//		myGUIThingy = new Thingy();
		selfFriend = new Friend();
		kianiFriend = new Friend();
		jarenFriend = new Friend();
		noelFriend = new Friend();
		
	}
	
	public void start()
	{
//		JOptionPane.showMessageDialog(null, "You");
//		JOptionPane.showMessageDialog(null, "Are");
//		JOptionPane.showMessageDialog(null, "An");
//		JOptionPane.showMessageDialog(null, "Awesome");
//		JOptionPane.showMessageDialog(null, "And");
//		JOptionPane.showMessageDialog(null, "Amazing");
//		JOptionPane.showMessageDialog(null, "Person");
//		JOptionPane.showMessageDialog(null, "XD");
		
		findOutAboutFriend();
		showAndTell();
//		meetTheThingyGUI();
//		interact();
//		checkWrapper();
		
	}
	
	private void findOutAboutFriend()
	{
//		selfFriend
		{
			double weight;
			int age;
			String answer;
			answer = JOptionPane.showInputDialog("here is: " +  selfFriend.getName() + ". What's your real name?");
			selfFriend.setName(answer);
			answer = JOptionPane.showInputDialog("Are you " + selfFriend.getAge() + " years old? If not how old are you?");
			age = Integer.parseInt(answer);				selfFriend.setAge(age);
			answer = JOptionPane.showInputDialog("Are you " + selfFriend.getWeight() + " pounds? If not how much do you weigh?");
			weight = Double.parseDouble(answer);
			selfFriend.setWeight(weight);
			answer = JOptionPane.showInputDialog("You are " + selfFriend.getHumorStyle() + " funny. If you say other wise how funny are you?");
			selfFriend.setHumorStyle(answer);
			answer = JOptionPane.showInputDialog("You like " + selfFriend.getInterest() + ". Or what do you like?");
			selfFriend.setInterest(answer);
			answer = JOptionPane.showInputDialog("You like pineapple " + selfFriend.getLikesPineapple() + "? Is it true?");
			if (answer.equalsIgnoreCase("yes"))
			{
				selfFriend.setLikesPineapple(false);	

			}
			else if (answer.equalsIgnoreCase("no"))
			{
				selfFriend.setLikesPineapple(true);
			}
		}
//		kianiFriend
		{
			double weight;
			int age;
			String answer;
			answer = JOptionPane.showInputDialog("here is: " +  kianiFriend.getName() + ". What's your real name?");
			kianiFriend.setName(answer);
			answer = JOptionPane.showInputDialog("Are you " + kianiFriend.getAge() + " years old? If not how old are you?");
			age = Integer.parseInt(answer);
			kianiFriend.setAge(age);
			answer = JOptionPane.showInputDialog("Are you " + kianiFriend.getWeight() + " pounds? If not how much do you weigh?");
			weight = Double.parseDouble(answer);
			kianiFriend.setWeight(weight);
			answer = JOptionPane.showInputDialog("You are " + kianiFriend.getHumorStyle() + " funny. If you say other wise how funny are you?");
			kianiFriend.setHumorStyle(answer);
			answer = JOptionPane.showInputDialog("You like " + kianiFriend.getInterest() + ". Or what do you like?");
			kianiFriend.setInterest(answer);
			answer = JOptionPane.showInputDialog("You like pineapple " + kianiFriend.getLikesPineapple() + "? Is it true?");
			if (answer.equalsIgnoreCase("yes"))
			{
				kianiFriend.setLikesPineapple(false);	

			}
			else if (answer.equalsIgnoreCase("no"))
			{
				kianiFriend.setLikesPineapple(true);
			}	
		}
//		jarenFrined
		{
			double weight;
			int age;
			String answer;
			answer = JOptionPane.showInputDialog("here is: " + jarenFriend.getName() + ". What's your real name?");
			jarenFriend.setName(answer);
			answer = JOptionPane.showInputDialog("Are you " + jarenFriend.getAge() + " years old? If not how old are you?");
			age = Integer.parseInt(answer);
			jarenFriend.setAge(age);
			answer = JOptionPane.showInputDialog("Are you " + jarenFriend.getWeight() + " pounds? If not how much do you weigh?");
			weight = Double.parseDouble(answer);
			jarenFriend.setWeight(weight);
			answer = JOptionPane.showInputDialog("You are " + jarenFriend.getHumorStyle() + " funny. If you say other wise how funny are you?");
			jarenFriend.setHumorStyle(answer);
			answer = JOptionPane.showInputDialog("You like " + jarenFriend.getInterest() + ". Or what do you like?");
			jarenFriend.setInterest(answer);
			answer = JOptionPane.showInputDialog("You like pineapple " + jarenFriend.getLikesPineapple() + "? Is it true?");
			if (answer.equalsIgnoreCase("yes"))
			{
				jarenFriend.setLikesPineapple(false);	

			}
			else if (answer.equalsIgnoreCase("no"))
			{
				jarenFriend.setLikesPineapple(true);
			}	
		}
//		noelFriend
		{
			double weight;
			int age;
			String answer;
			answer = JOptionPane.showInputDialog("here is: " + noelFriend.getName() + ". What's your real name?");
			noelFriend.setName(answer);
			answer = JOptionPane.showInputDialog("Are you " + noelFriend.getAge() + " years old? If not how old are you?");
			age = Integer.parseInt(answer);
			noelFriend.setAge(age);
			answer = JOptionPane.showInputDialog("Are you " + noelFriend.getWeight() + " pounds? If not how much do you weigh?");
			weight = Double.parseDouble(answer);
			noelFriend.setWeight(weight);
			answer = JOptionPane.showInputDialog("You are " + noelFriend.getHumorStyle() + " funny. If you say other wise how funny are you?");
			noelFriend.setHumorStyle(answer);
			answer = JOptionPane.showInputDialog("You like " + noelFriend.getInterest() + ". Or what do you like?");
			noelFriend.setInterest(answer);
			answer = JOptionPane.showInputDialog("You like pineapple " + noelFriend.getLikesPineapple() + "? Is it true?");
			if (answer.equalsIgnoreCase("yes"))
			{
				noelFriend.setLikesPineapple(false);	

			}
			else if (answer.equalsIgnoreCase("no"))
			{
				noelFriend.setLikesPineapple(true);
			}	
		}
	}
	
	private void showAndTell()
	{
		{
			JOptionPane.showMessageDialog(null, "Here is: " + selfFriend.getName());
			JOptionPane.showMessageDialog(null, "He is " + selfFriend.getAge());
			JOptionPane.showMessageDialog(null, "He weighs " + selfFriend.getWeight());
			JOptionPane.showMessageDialog(null, "He is " + selfFriend.getHumorStyle() + " funny");
			JOptionPane.showMessageDialog(null, "He is really into " + selfFriend.getInterest());
			JOptionPane.showMessageDialog(null, "He likes pineapple is: " + selfFriend.getLikesPineapple());
		}
		{
			JOptionPane.showMessageDialog(null, "Here is: " + kianiFriend.getName());
			JOptionPane.showMessageDialog(null, "She is " + kianiFriend.getAge());
			JOptionPane.showMessageDialog(null, "She weighs " + kianiFriend.getWeight());
			JOptionPane.showMessageDialog(null, "She is " + kianiFriend.getHumorStyle() + " funny");
			JOptionPane.showMessageDialog(null, "She is really into " + kianiFriend.getInterest());
			JOptionPane.showMessageDialog(null, "She likes pineapple is: " + kianiFriend.getLikesPineapple());
		}
		{
			JOptionPane.showMessageDialog(null, "Here is: " + jarenFriend.getName());
			JOptionPane.showMessageDialog(null, "He is " + jarenFriend.getAge());
			JOptionPane.showMessageDialog(null, "He weighs " + jarenFriend.getWeight());
			JOptionPane.showMessageDialog(null, "He is " + jarenFriend.getHumorStyle() + " funny");
			JOptionPane.showMessageDialog(null, "He is really into " + jarenFriend.getInterest());
			JOptionPane.showMessageDialog(null, "He likes pineapple is: " + jarenFriend.getLikesPineapple());
		}
		{
			JOptionPane.showMessageDialog(null, "Here is: " + noelFriend.getName());
			JOptionPane.showMessageDialog(null, "She is " + noelFriend.getAge());
			JOptionPane.showMessageDialog(null, "She weighs " + noelFriend.getWeight());
			JOptionPane.showMessageDialog(null, "She is " + noelFriend.getHumorStyle() + " funny");
			JOptionPane.showMessageDialog(null, "She is really into " + noelFriend.getInterest());
			JOptionPane.showMessageDialog(null, "She likes pineapple is: " + noelFriend.getLikesPineapple());
		}
	}
	
	private void meetTheThingyGUI()
	{
		String answer;
		JOptionPane.showMessageDialog(null, "Here is a Thingy: " + myGUIThingy.getName());
		answer = JOptionPane.showInputDialog(null, "What do you want to change your name to?");
		answer = JOptionPane.showInputDialog(null, "Really, " + answer + " You sure?");
				
		if (answer.equalsIgnoreCase("yes"))
		{	
			answer = JOptionPane.showInputDialog(null, "ok sounds good");	
		}
		else if (answer.equalsIgnoreCase("no"))
		{
		answer = JOptionPane.showInputDialog(null, "I never liked the name of: " + answer + " anyway, pbbbt");	
		}
		else
		{
		JOptionPane.showMessageDialog(null, "Stop typing gibberish");
		meetTheThingyGUI();
		}
	}
	
	
	private void interact()
	{
		boolean myPineapple;
		String answer;
		JOptionPane.showMessageDialog(null, "Let's talk");
		answer = JOptionPane.showInputDialog(null, "What is your name?");
		//If I do not type a response null will be stored in the variable.
		//Cance is the same as pressing the red X in the corner
		JOptionPane.showMessageDialog(null, "Hi there " + answer);
		answer = JOptionPane.showInputDialog(null, "How are you?");
		JOptionPane.showMessageDialog(null, "Your "+ answer + " Thats a good thing.");
		if (answer.equalsIgnoreCase("yes"))
		{
			answer = JOptionPane.showInputDialog(null, "ok sounds good");	

		}
		else if (answer.equalsIgnoreCase("no"))
		{
			answer = JOptionPane.showInputDialog(null, "I never liked the name of: " + answer + " anyway, pbbbt");
		}
	}
	
	private void checkWrapper()
	{
		int age;
		
		JOptionPane.showMessageDialog(null, "HI Let's try something new");
		String temp = JOptionPane.showInputDialog("How old are you?");
		//parseInt reads a number from a parameter
		age = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.  Next year you will be " + (age + 1) + " years old");
			
	}
		
}
