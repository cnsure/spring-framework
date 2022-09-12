package org.springframework.sure.postprocessor;

import com.oracle.tools.packager.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author sure
 * date 2022/9/12 12:34
 */
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("BeanPostProcessor  before {}",beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("BeanPostProcessor after {}",beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
