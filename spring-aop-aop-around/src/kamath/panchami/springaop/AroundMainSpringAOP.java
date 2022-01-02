package kamath.panchami.springaop;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kamath.panchami.springaop.service.TrafficFortuneService;

public class AroundMainSpringAOP {
	
	private static Logger myLogger = 
			Logger.getLogger(AroundMainSpringAOP.class.getName());

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		myLogger.info("\nMain Program : AroundMainSpringApp");
		
		myLogger.info("calling getFortune method");
		
		myLogger.info(theFortuneService.getFortune());
		
		myLogger.info("Finished");
		
		//close the context
		context.close();

	}

}
