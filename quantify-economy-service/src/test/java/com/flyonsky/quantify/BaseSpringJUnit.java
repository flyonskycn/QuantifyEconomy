package com.flyonsky.quantify;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:applicationContext-service.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseSpringJUnit {

}
