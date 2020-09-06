package org.edwith.webbe.calculatorcli;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration			// 스프링 설정 파일
@ComponentScan(basePackages = {"org.edwith.webbe.calculatorcli"})		// 해당 패키지에서 컴포넌트를 찾는
public class ApplicationConfig {

}
