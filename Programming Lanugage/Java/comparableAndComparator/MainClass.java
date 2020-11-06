package comparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	
	public Movie(String n, double r, int y)
	{
		this.rating = r;
		this.name = n;
		this.year = y;
	}
	
	public double getRating()
	{
		return rating;
	}
	public String getName()
	{
		return name;
	}
	public int getYear()
	{
		return year;
	}
	
	@Override
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	
	@Override
	public String toString()
	{
		return "Movie "+rating+" "+name+" "+year;
	}
	
	
}

class RatingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return (int)(m1.getRating() - m2.getRating());
	}
}

class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

public class MainClass
{

	public static void main(String[] args)
	{
		ArrayList<Movie> arr = new ArrayList<>();
		arr.add(new Movie("Force Awakens", 8.3, 2015));
		arr.add(new Movie("Star Wars", 8.7, 1977)); 
        arr.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        arr.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        System.out.println("Sorted According To Rating:");
        RatingCompare rc = new RatingCompare();
        Collections.sort(arr,rc);
        for(Movie m: arr)
        {
        	System.out.println(m.getRating()+" "+m.getName()+" "+m.getYear());
        }
        System.out.println();
        
        System.out.println("Sorted According To Name:");
        NameCompare nc = new NameCompare();
        Collections.sort(arr,nc);
        for(Movie m: arr)
        {
        	System.out.println(m.getRating()+" "+m.getName()+" "+m.getYear());
        }
        System.out.println();
        
        System.out.println("Sorted According To Year:");
        Collections.sort(arr);
        for(Movie m: arr)
        {
        	System.out.println(m.getRating()+" "+m.getName()+" "+m.getYear());
        }
        System.out.println();
        
        
        
        // Accesing toString
        for(Movie m: arr)
        {
        	System.out.println(m);
        }
        
        System.out.println();
        arr.forEach((m)-> System.out.println(m));
        
        System.out.println();
        arr.forEach(System.out::println);
	}

}
