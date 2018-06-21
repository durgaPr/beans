package com.bike;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create IOC container
		  DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		  XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions(new FileSystemResource("src/test/resources/com/bike/applicationcontest.xml"));
		//GET BEAN meythod
		  
		  Bikes bike=(Bikes) factory.getBean("pulsor1");
		  System.out.println(bike);
		  Bikes bike2=(Bikes) factory.getBean("pulsor2",Bikes.class);
		  System.out.println(bike2);
	}

}
