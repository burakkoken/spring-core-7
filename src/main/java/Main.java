import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		
		Message message1 = context.getBean("message1", Message.class);
		
	
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
