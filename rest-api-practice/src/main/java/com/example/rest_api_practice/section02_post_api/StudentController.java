package com.example.rest_api_practice.section02_post_api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @PostMapping("/student/list")
    public List<Student> addStudent(@RequestBody List<Student> student){
        return student;
    }
    //--------------------------------------------------//

    @RestController
    public class LoginController{

        @PostMapping ("/login")
        public String login(@RequestBody LoginRequest request){

            if(request.getUsername().equals("bhavesh123")&&
                request.getPassword().equals("bhavesh123"))
            {
                return "Login Successfully";
            }
            return "invalid faild";
        }

        @RestController
    public class Insta{
            @PostMapping("/Instagram")
            public String logins(@RequestBody Instagram instagram){

                String correctUsername="bhavesh1235";
                String correctPassword="bhavesh1234";

                boolean correctName = instagram.getUsername().equals(correctUsername);
                boolean correctPasswords=instagram.getPassword().equals(correctPassword);

                if (correctName && correctPasswords) {
                    return "Login Successfully";
                }
                else if (correctName && !correctPasswords) {
                    return "Wrong Password";
                }
                else if (!correctName && correctPasswords) {
                    return "Wrong Username";
                }
                else {
                    return "Both are wrong";
                }
            }
    }

    }



}
