package basePackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Base13 {
	static final Logger log =Logger.getLogger(Base13.class); 
	@Test
	public void test123(){
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Xtrzzz");
	}
	
	

}
