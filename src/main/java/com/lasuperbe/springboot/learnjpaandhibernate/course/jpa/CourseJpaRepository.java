package com.lasuperbe.springboot.learnjpaandhibernate.course.jpa;

import com.lasuperbe.springboot.learnjpaandhibernate.course.Course;
import com.lasuperbe.springboot.learnjpaandhibernate.course.CourseJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
//    @Autowired
    @PersistenceContext
    private EntityManager entityManager;
    public void insert(CourseJPA course){
        entityManager.merge(course);
    }
    public CourseJPA findById(long id){
        return entityManager.find(CourseJPA.class, id);
    }
    public void deleteById(long id){
        CourseJPA course = entityManager.find(CourseJPA.class, id);
        entityManager.remove(course);
    }
}
