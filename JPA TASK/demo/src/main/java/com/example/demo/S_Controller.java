package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value ="/S_list")
public class S_Controller {
    @Autowired
    private repo repo;

    @GetMapping
    public List<Student> findAll()
    {
        return (List<Student>) repo.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student)
    {
        return (Student) repo.save(student);

    }
}
