package org.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

     private String name;
      private int rollNo;
      private float mark;
      private Address address;

      public Student(String name,int rollNo,float mark,Address address){
          this.name=name;
          this.rollNo=rollNo;
          this.mark=mark;
          this.address=address;
      }



    public void display(){
        System.out.println("Name = "+name);
        System.out.println("RollNo = "+rollNo);
        System.out.println("Total Marks = "+mark);
        System.out.println("Home Address = "+address);
    }
}
