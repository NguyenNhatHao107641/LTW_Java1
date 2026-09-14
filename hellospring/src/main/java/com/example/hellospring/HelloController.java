package com.example.hellospring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable int id) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        return "Sinh viên có mã: " + id;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }

    // @GetMapping("/student")
    // public String greet(@RequestParam String name) {
    //     return "Xin chào " + name;
    // }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Nguyễn Văn A", 20);
    }

    @GetMapping("/studentall")
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "A", 20));
        list.add(new Student(2, "B", 21));
        return list;
    }




}
