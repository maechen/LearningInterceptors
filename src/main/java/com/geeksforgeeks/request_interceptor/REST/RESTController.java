package com.geeksforgeeks.request_interceptor.REST;

import com.geeksforgeeks.request_interceptor.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        Student student1 = new Student(1, "mae", "chen");
        Student student2 = new Student(2, "uttam", "sapkota");
        Student student3 = new Student(3, "sharada", "prakash");

        List<Student> myList = new ArrayList<Student>();
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);

        return myList;
    } 
}
