package com.lasuperbe.springboot.learnjpaandhibernate.course.jdbc;

import com.lasuperbe.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
                 insert into course (id, name, author)
                 values(?, ?, ?);
            """;
    private static String DELETE_QUERY =
            """
                 DELETE from course 
                 WHERE id=?
            """;
    private static String SELECT_QUERY =
            """
                 SELECT * from course
                 where id=?
            """;
    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
    public void insert2(Course course){
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
        //ResultSet -> Bean => Row Mapper
        //id
    }
}
