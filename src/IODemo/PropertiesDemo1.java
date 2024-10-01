package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesDemo1 
{
	@Test
  public void propertest() throws IOException
  {
	  FileInputStream fin = new FileInputStream("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\config.properties.txt");
	  Properties prop = new Properties();
	  prop.load(fin);
	   String browsername = prop.getProperty("BrowserName");
	   System.out.println("browsername :"  +browsername);
	  
  }
}
