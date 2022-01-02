package kamath.panchami.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.service.TrafficFortuneService;

public class AroundHandleExceptionMainSpringAOP {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("\nMain Program : AroundMainSpringApp");
		
		System.out.println("calling getFortune method");
		
		boolean tripWire = true;
		System.out.println(theFortuneService.getFortune(tripWire));
		
		System.out.println("Finished");
		
		//close the context
		context.close();

	}

}
