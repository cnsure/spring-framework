package org.springframework.sure;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.sure.bean.Student;

/**
 * @author sure
 * date 2022/9/12 12:17
 */
@Slf4j
public class ApplicationTest {

	@Test
	public void testClassPathXmlApplicationContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		Student student = (Student)context.getBean("student");
		log.info("{}",student);
	}

}
