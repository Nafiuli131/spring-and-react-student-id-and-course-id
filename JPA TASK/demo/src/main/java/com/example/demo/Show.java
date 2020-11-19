package com.example.demo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
@Entity
@EnableJpaRepositories
@Table(name = "show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "s_id", nullable = false)
    private long s_id;
    @Column(name = "c_id", nullable = false)
    private long c_id;

    public Show()
    {

    }

    public Show(long id,long s_id,long c_id) {
        this.s_id= s_id;
        this.id=id;
        this.c_id=c_id;
    }
    public Show(long id) {

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


    public long gets_id()
    {
        return s_id;
    }

    public void setS_id(long s_id)
    {
        this.s_id = s_id;
    }
    public long getC_id()
    {
        return c_id;
    }

    public void setC_id(long c_id)
    {
        this.c_id = c_id;
    }

}
