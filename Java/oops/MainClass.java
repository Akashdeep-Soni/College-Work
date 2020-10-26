package oops;

class Cat
{
	int legs, eyes;
	String name;
	
	public void walk()
	{
		System.out.println("Cat is walking");
	}
	
	public void eat()
	{
		System.out.println("Cat is eating");
	}
}

class Dog
{
	String name = "Husky";  // Default otherwise null can be changed in object
	
	public void bark()
	{
		System.out.println(name+" is barking");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat();
		cat1.eyes = 2;
		cat1.legs = 4;
		cat1.name = "Pambu";
		System.out.println(cat1.legs+" "+cat1.eyes+" "+cat1.name);
		cat1.walk();
		cat1.eat();
		
		
		Dog dog1 = new Dog();
		
		dog1.name = "Gajodhar";
		dog1.bark();
	}

}
