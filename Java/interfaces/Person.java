package interfaces;

public class Person implements Student, YouTuber
{

	public static void main(String[] args)
	{
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		obj.editVedio();
//		obj.uploadVideo();    without overriding default method can be used
		System.out.println("Accessing Int Directly "+Student.x);
		System.out.println();
		
		// Downcasting
		YouTuber obj2 = obj;
		obj2.editVedio();
		obj2.makeVideo();
//		obj2.study();                  Undefined only YouTuber Methods
	}


	@Override
	public void makeVideo()
	{
		System.out.println("Person Making Vedio");
		
	}


	@Override
	public void study()
	{
		System.out.println("Person Study");
		
	}


	@Override
	public void editVedio()
	{
		System.out.println("Person Vedio Editing");
		
	}
	
	
	// Optional Override
//	public void uploadVedio()
//	{
//		System.out.println("Person Uploading Vedio");
//	}

}
