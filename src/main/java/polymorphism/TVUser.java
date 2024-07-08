package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
	 
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		
		factory.close();
		
		/* BenFactory factory = new BenFactory();
		TV tv = (TV)factory.getBean(args[0]);
		
	tv.powerOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.powerOff(); */
     
		/*
	LgTV tv = new LgTV();
	  tv.turnOn();
	  tv.soundUp();
	  tv.SoundDown();
	  tv.turnOff();
		*/
	}

}
