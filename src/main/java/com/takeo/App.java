package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.model.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("com\\takeo\\config\\spring.xml");
       
       College col=(College)ctx.getBean("clg");
       
       col.displayDetails();
    }
}
