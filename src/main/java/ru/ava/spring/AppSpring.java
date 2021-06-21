package ru.ava.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        simpleBean.doSomething();

        CodeCreator codeCreator = context.getBean("javaCodeCreator", JavaCodeCreator.class);
        System.out.println(codeCreator.getClassExample());

        context.close();
    }
}
