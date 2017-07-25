package com.flyonsky.quantify;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

/**
 * 唯一Bean名称生成器.以类全名作为Bean名称
 * @author Administrator
 *
 */
public class UniqueBeanNameGenerator implements BeanNameGenerator{

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		return definition.getBeanClassName();
	}

}
