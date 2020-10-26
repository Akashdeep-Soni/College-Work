package singletonPattern;

public class AppConfigJava
{
	private AppConfigJava()
	{
		
	}
	
//	Creating object
//	private static AppConfigJava obj = new AppConfigJava();
	
	private static AppConfigJava obj = null;
	
	public static AppConfigJava getInstance()
	{
		if (obj == null)
			obj = new AppConfigJava();
			
		return obj;
	}
	
	public void walk()
	{
		System.out.println("App is walking");
	}
}
