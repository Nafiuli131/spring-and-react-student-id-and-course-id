package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<Student, Long> {

}
@Repository
interface repo1 extends JpaRepository<Course,Long>{

}
@Repository
interface repo2 extends JpaRepository<Show,Long>{

}

