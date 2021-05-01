package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.Mycontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		Mycontroller mycontroller = (Mycontroller) ctx.getBean("mycontroller");
		String greeting = mycontroller.sayHello();

		System.out.println(greeting);

	}

}
