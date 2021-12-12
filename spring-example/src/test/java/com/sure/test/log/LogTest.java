package com.sure.test.log;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sure
 * date 2021/12/11 8:32 下午
 */
@Slf4j
public class LogTest {

	@Test
	public void test(){
		log.info("hello");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
	}
}
