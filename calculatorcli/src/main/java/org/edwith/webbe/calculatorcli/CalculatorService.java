package org.edwith.webbe.calculatorcli;

import org.springframework.stereotype.Component;

@Component			// 개발자가 직접 객체를 생성하지 않는다 
public class CalculatorService {
	
	public int plus(int v1, int v2) {
		return v1 + v2;
	}

	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	
	public int multi(int v1, int v2) {
		return v1 * v2;
	}
	
	public int divide(int v1, int v2) throws ArithmeticException{
		return v1 / v2;
	}

}
