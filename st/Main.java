package st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 
public static void main(String[]args)
 {
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	student kavya= context.getBean("student",student.class);
	kavya.display();
	student kali= context.getBean("kalix",student.class);
	kali.display();
 }

}
