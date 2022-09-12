package org.springframework.sure.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author sure
 * date 2022/9/12 12:30
 */
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Object student = beanFactory.getBeanDefinition("student");

		log.info("BeanFactoryPostProcessor {}",student.getClass());
	}
}
