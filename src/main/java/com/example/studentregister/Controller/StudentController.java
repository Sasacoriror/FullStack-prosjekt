package com.example.studentregister.Controller;

import com.example.studentregister.Model.Student;
import com.example.studentregister.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student nyStrudent(@RequestBody Student nyStudent){
        return studentRepository.save(nyStudent);
    }
}
