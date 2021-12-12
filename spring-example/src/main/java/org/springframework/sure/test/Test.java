package org.springframework.sure.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sure
 * date 2021/12/11 4:55 下午
 */
@Slf4j
public class Test {

	public static void main(String[] args) {
		// 实例化 ioc容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(Student.class);
		// 初始化 容器
		applicationContext.refresh();
		log.info("hellowsdfd");
	}
}
