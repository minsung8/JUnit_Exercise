package org.edwith.webbe.calculatorcli;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;


// JUnit이 테스트 코드를 실행할 때 스프링 bean 컨테이너가 내부적으로 생성되도록 함
@RunWith(SpringJUnit4ClassRunner.class)

// 내부적으로 생성된 스프링 빈 컨테이너가 사용할 설정파일을 지정할 때 사용
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CalculatorServiceTest {
	
	@Autowired
	CalculatorService calculatorService;
	
	@Before
	public void init() {
		calculatorService = new CalculatorService();
	}
	 
	@Test
	public void plus() throws Exception{
		int v1 = 10; 
		int v2 = 20;
		int result = calculatorService.plus(v1,  v2);
		
		Assert.assertEquals(30, result);
	}
	
	@Test
	public void minus() throws Exception{
		int v1 = 10;
		int v2 = 20;
		int result = calculatorService.minus(v1,  v2);
		
		Assert.assertEquals(-10, result);
	}
	
	@Test
	public void multi() throws Exception{
		int v1 = 10;
		int v2 = 20;
		int result = calculatorService.multi(v1,  v2);
		
		Assert.assertEquals(200, result);
	}
	
	@Test
	public void divide() throws Exception{
		int v1 = 20;
		int v2 = 10;
		int result = calculatorService.divide(v1,  v2);
		
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void divideExceptionTest() throws Exception{
		int v1 = 10;
		int v2 = 0;
		
		try {
			int result = calculatorService.divide(v1,  v2);
		} catch (Exception e) {
			Assert.assertTrue(true);
			return;
		}
		
		Assert.fail();
		
	}
	
	

}
