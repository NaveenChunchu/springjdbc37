package ai.jobiak.usesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.jobiak.ifaces.BDigital;

public class TestAppContext {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	//	context.registerShutdownHook(); //
		BDigital bDigital = (BDigital) context.getBean("bDigital");
		bDigital.publish();
		System.out.println(bDigital.hashCode());
		BDigital bDigital2 = (BDigital) context.getBean("bDigital");
		bDigital.publish();
		//Singleton design pattern,every servlet is a singletone
		System.out.println(bDigital2.hashCode());	//by using scope="prototype we get the differt hashcode"
	}

}