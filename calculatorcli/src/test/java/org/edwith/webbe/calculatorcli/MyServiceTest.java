package org.edwith.webbe.calculatorcli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {
	
	@InjectMocks
	MyService ms;
	
	@Mock
	CalculatorService cs;
	
	@Test
	public void execute() throws Exception{
		
		int v1 = 5;
		int v2 = 10;
		
        // given(cs.plus(5, 10)).willReturn(15);
        
        // int result = ms.execute(v1, v2);

        // verify(cs).plus(anyInt(), anyInt());
        // Assert.assertEquals(30, result);
	}
	
	

}
