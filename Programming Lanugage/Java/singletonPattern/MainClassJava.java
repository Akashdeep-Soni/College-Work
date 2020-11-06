package singletonPattern;

public class MainClassJava
{

	public static void main(String[] args)
	{
		// It will not work
		//AppConfigJava obj = new AppConfigJava();
		
		AppConfigJava obj = AppConfigJava.getInstance();
		obj.walk();
		
		
		// Same object different name
		AppConfigJava objn = AppConfigJava.getInstance();
		objn.walk();

	}

}
