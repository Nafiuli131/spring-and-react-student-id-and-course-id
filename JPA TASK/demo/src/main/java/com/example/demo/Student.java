package com.example.demo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
@Entity
@EnableJpaRepositories
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    public Student()
    {

    }

    public Student(String name,long id) {
        this.name = name;
        this.id=id;
    }
    public Student(long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
