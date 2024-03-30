package com.lasuperbe.rest.webservice.restfulwebservice.jpa;

import com.lasuperbe.rest.webservice.restfulwebservice.user.Post;
import com.lasuperbe.rest.webservice.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
