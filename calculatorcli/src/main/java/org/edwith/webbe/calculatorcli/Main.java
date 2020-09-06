package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// ApplicationConfig.class 설정파일을 읽어드리는 ApplicationContext 객체 생성
		// 컴포넌트 스캔 -> 해당 컴포넌트 객체 생성 -> ApplicationContext가 관리
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);
		
		System.out.println(calculatorService.plus(10, 50));
		
	}

}
 