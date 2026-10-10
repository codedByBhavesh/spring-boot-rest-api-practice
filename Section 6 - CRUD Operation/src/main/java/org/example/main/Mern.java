package org.example.main;

import org.example.Config.AppConfig;
import org.example.beans.Student;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mern {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student std =(Student)context.getBean("createObj");
        std.display();
    }




}
