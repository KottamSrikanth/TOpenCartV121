package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass 
{
	public WebDriver driver;
	public Properties p;
	
	@Parameters("browser")
	@BeforeClass
	void setUp(String br) throws IOException
	{
		//Loading Configure Properties
		FileReader fr=new FileReader("./src//test//resources//config.properties");
		p = new Properties();
		p.load(fr);
		
		if(p.getProperty("execution_Environment").equals("remote"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setPlatform(Platform.WIN11);
			if(br.equals("chrome"))
			{
				cap.setBrowserName("chrome");
			}
			else if(br.equals("edge"))
			{
				cap.setBrowserName("MicrosoftEdge");
			}
			else 
			{
				System.out.println("Invalid browser");
			}
			
			driver = new RemoteWebDriver(new URL("http://192.168.29.107:4444/wd/hub") ,cap);
		}
		
		
		if(p.getProperty("execution_Environment").equals("local"))
		{
			switch(br.toLowerCase())
			{
			case "chrome":driver=new ChromeDriver(); break;
			case "edge": driver = new EdgeDriver(); break;
			default : System.out.println("Invalid Browser Name...");return;
			}
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("URL")); //Reading url from properties file
		
	}
	
	@AfterClass()
	void tearDown()
	{
		driver.quit();
	}
	
	public String RandomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	

}
