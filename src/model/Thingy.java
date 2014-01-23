package model;

public class Thingy 

{
	//Declaration Section	
	/*
	 * Thingy Name
	 */
	private String name;

	/*
	 * Thingy favorite food
	 */
	private String food;
	
	/*
	 * Thingy favorite movie
	 */
	private String movie;
	
	public Thingy()
	{
		name = "Bubble Buddy";
		food = "spicy hot tastiness";
		movie = "Comedy";
		
				
	}
	
	public void setName(String name)
	{
		this.name = name;	
	}
	
	public void setFood(String food)
	{
		this.food = food;
	}
	
	public void setMovie(String movie)
	{
		this.movie = movie;	
	}

	public String getName()
	{
		return name;
	}
	
	public String getFood()
	{
		return food;
	}
	
	public String getMovie()
	{
		return movie;
	}
}
