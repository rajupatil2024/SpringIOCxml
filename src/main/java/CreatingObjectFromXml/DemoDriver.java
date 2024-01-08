package CreatingObjectFromXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoDriver {

	public static void main(String[] args) {
		
		//creation of object
		ApplicationContext ac = new ClassPathXmlApplicationContext("Config.xml");
		// to get the object(DownCasting)
		Demo d=(Demo)ac.getBean("mydemo");
		//Calling Display method
		d.Display();

	}

}
