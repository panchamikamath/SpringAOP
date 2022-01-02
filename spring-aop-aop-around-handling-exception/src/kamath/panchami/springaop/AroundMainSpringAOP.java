package kamath.panchami.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.service.TrafficFortuneService;

public class AroundMainSpringAOP {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("\nMain Program : AroundMainSpringApp");
		
		System.out.println("calling getFortune method");
		
		System.out.println(theFortuneService.getFortune(false));
		
		System.out.println("Finished");
		
		//close the context
		context.close();

	}

}
