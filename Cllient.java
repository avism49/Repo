package com.learnspring.springbeans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Cllient {
	
	public static void main(String[] args) {
		
		FileSystemResource fs=new FileSystemResource("springconfig.xml");
		
		XmlBeanFactory fac= new XmlBeanFactory(fs);
			
		Object obj=fac.getBean("uno");
		SetterInjectionBean si=(SetterInjectionBean)obj;
		si.hello();
		
		Object val=fac.getBean("conju");
		ConstInject bea=(ConstInject)val;
		bea.test();
	}
	
	

}
