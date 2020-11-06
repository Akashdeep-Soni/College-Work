package interfaces;

public interface YouTuber extends VideoEditor
{
	void makeVideo();
	
	// Concrete Functions can be made using default keyword only otherwise not
	// To overwrite is optional in implemented class
	default void uploadVideo()
	{
		System.out.println("Not Allowed");
	}

}
