package com.tc.springcoreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tc.springcoreassignment.config.StorageDeviceConfig;
import com.tc.springcoreassignment.interfaces.Dell;
import com.tc.springcoreassignment.interfaces.HP;
import com.tc.springcoreassignment.interfaces.Laptop;

/**
 * Hello world!
 *
 */
public class DeviceTest 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(StorageDeviceConfig.class);
    	Laptop dell = (Laptop)context.getBean("dell");
		dell.display();
		dell.process();
		dell.showSpecification();
		Laptop hp = (Laptop)context.getBean("hp");
		hp.display();
		hp.process();
		hp.showSpecification();
    }
}
