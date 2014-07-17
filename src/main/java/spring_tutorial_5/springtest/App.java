package spring_tutorial_5.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) { 
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_tutorial_5/springtest/beans/beans.xml");

		Person person = (Person)context.getBean("person");
		person.speak();

		System.out.println(person);
		((ClassPathXmlApplicationContext)context).close();
	}

}
