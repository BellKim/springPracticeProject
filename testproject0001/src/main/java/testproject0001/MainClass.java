package testproject0001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk transportationWalk=ctx.getBean("tranp", TransportationWalk.class);
		transportationWalk.move1();
		
		
		ctx.close();
		
		
	}

}
