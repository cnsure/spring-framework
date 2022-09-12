package org.springframework.sure.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author sure
 * date 2021/12/11 4:56 下午
 */
@Slf4j
public class Student implements ApplicationContextAware , EnvironmentAware {

	public Student(){
		log.info("Student constructor");
	}

	public String name = "zhangsan";

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

	private ApplicationContext applicationContext;

	public ApplicationContext getApplicationContext(){
		return this.applicationContext;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		log.info("ApplicationContext aware ");
		this.applicationContext = applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		log.info("Environment aware ");
	}
}
