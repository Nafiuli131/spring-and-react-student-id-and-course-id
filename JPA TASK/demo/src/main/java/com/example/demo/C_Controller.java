package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value ="/C_list")
public class C_Controller {
    @Autowired
    private repo1 repo1;

    @GetMapping
    public List<Course> findAll()
    {
        return (List<Course>) repo1.findAll();
    }

    @PostMapping
    public Course save(@RequestBody Course course)
    {
        return (Course) repo1.save(course);

    }
}
