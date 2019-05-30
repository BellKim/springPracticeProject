package testPrj02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		TransportationWalk transportationwalk = new TransportationWalk();
//		transportationwalk.move();
		
		
		//자바폴더 : 자바코드가 들어있는곳
		//리소시스 : 리소스 자원들이 저장되어있는 폴더
		//스프링은 메모리 로딩을 하긴하는데 IOC 그릇을 만들고 필요한 객체를 생성해두고 그 그릇에서 필요한 것을 호출해서 사용한다.
		

	//--> spring container 에 접근하는 방법 : GenericApplicationContext <- 접근방법 명령어 
//		GenericApplicationContext 예하에는 xml 로드하는 클래스가 있다.
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
				
		
		TransportationWalk transportationwalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationwalk.move();
		 
		 
		
		ctx.close();
		
		
	}

}
