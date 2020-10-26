package learnpackage.packages;

import java.util.Scanner;

import learnpackage.packages.model.*;

public class MainClass
{

	public static void main(String[] args)
	{
		Student stud = new Student("Tommy");
		System.out.println(stud.getName());
		
		
//		stud.getPwd();     Not accessible
		
		Teacher teach = new Teacher();
		
		Scanner sc = new Scanner(System.in);
	}

}
