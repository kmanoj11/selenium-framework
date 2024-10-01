package IODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
  
import org.testng.annotations.Test;

public class FileInputOutputDemo1
{  
	@Test
	public void funA() throws FileNotFoundException
	{
		FileOutputStream file = new FileOutputStream("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemotest1.txt");
		System.out.println("done");

	}
	

}
