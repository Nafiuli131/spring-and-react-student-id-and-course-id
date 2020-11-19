package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value ="/Show_list")
public class Show_Controller {
    @Autowired
    private repo2 repo2;

    @GetMapping
    public List<Show> findAll()
    {
        return (List<Show>) repo2.findAll();
    }
    @PostMapping
    public Show save(@RequestBody Show show)
    {
        return (Show) repo2.save(show);

    }
}
