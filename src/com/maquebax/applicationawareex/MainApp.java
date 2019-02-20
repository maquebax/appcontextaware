package com.maquebax.applicationawareex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] arg) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("MyAppContext.xml");
        SingletonClass obj  = (SingletonClass)ctx.getBean("singletonClass");
        System.out.println("***************** date retrieved from singleton bean using appctx aware 1 "+obj.getpDate());
        System.out.println("***************** date retrieved from singleton bean 1 "+obj.getsDate());
        Thread.sleep(1000);
        System.out.println("\n\n");
        obj  = (SingletonClass)ctx.getBean("singletonClass");
        System.out.println("***************** date retrieved from singleton bean using appctx aware 2 "+obj.getpDate());
        System.out.println("***************** date retrieved from singleton bean 1 "+obj.getsDate());
    }
}
