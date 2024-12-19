package screens;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenss 
{
	public static void main (String[]args) throws IOException, AWTException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
//		TakesScreenshot screenshot=(TakesScreenshot)d;
//		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
//		File destinationfile=new File("D://half=screen.jpg");
//		FileHandler.copy(sourcefile, destinationfile);
		Robot robot=new Robot();
		java.awt.Dimension sourcefile=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(sourcefile);
		BufferedImage image=robot.createScreenCapture(rectangle);
		File destinationfile=new File("D://full-screenshot.png");
		ImageIO.write(image,"png", destinationfile);	
	}
}
