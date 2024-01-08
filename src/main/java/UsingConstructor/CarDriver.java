package UsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("CarXml.xml");
		
		Car c=(Car)ac.getBean("mycar");
		
		System.out.println(c.brand);
		
		c.engine.start();

	}

}
