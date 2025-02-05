import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;


 //Methods defined in base can be accessed here
  public class validateTitle extends base {
	  
	  @BeforeTest
	  
	  public void initialise () throws IOException {
		  
		 //driver = initializeDriver();
			
		 //driver.get(prop.getProperty("url"));
	  }
	
	
	@Test
	
	//Declare Variables
	public void basenavigation () throws IOException, InterruptedException {
		
		//driver = initializeDriver();
		
		//driver.get("http://www.qaclickacademy.com/");
		
		//driver.get(prop.getProperty("url"));
		
		//To access methods present in another class –
		//Use [Inheritance-extends]
		//You can also create object to that class and invoke methods of it
	
		//Pass [driver] in the argument - Constructor already defined in LandingPage
		//If you create an object and pass an argument [driver], you have to create Constructor with an argument
		LandingPage l = new LandingPage (driver);
		
		
		//To get the Text of the Title
		//Compare the text from the browser with actual text
		
		AssertJUnit.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	
	}
	
	@AfterTest
	
	public void teardown () {
		
		driver.close();
		driver = null;
		
	}

				
	}
		


	

	

  
		
		
		
		

	


