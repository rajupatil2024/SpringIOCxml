package UsingSetterMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Config.xml");
		
		Student s= (Student)ac.getBean("mystu");
		Student s1= (Student)ac.getBean("mystu1");
		
		
		System.out.println(s.getName()+" "+s.getAge());
		System.out.println(s1.getName()+" "+s1.getAge());

	}

}
