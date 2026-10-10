package org.example.Config;

import org.example.beans.Address;
import org.example.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address createAddObj(){
        Address add = new Address(1023,"Mumbai",444401);
        return add;
    }

    @Bean
    public Student createObj(){
        Student std = new Student("Bhavesh",101,80.89f,createAddObj());
        return std;
    }

}
