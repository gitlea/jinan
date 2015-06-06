package springTest0606.springTest0606;

import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.net.Socket;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		//生成一个spring的万能工厂,注意，这是一个重量级对象
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Cat c1=(Cat)context.getBean("alice",Cat.class);
		Cat c2=(Cat)context.getBean("nina",Cat.class);
		System.out.println(c2.getColor()+","+c2.getAge());
		
		
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.getClass().getName());
		
		
		
//		Socket sk=new Socket("127.0.0.1",4444);
//		InputStream in=sk.getInputStream();
		
	}

}
