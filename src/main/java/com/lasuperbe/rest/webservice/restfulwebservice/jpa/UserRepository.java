package com.lasuperbe.rest.webservice.restfulwebservice.jpa;

import com.lasuperbe.rest.webservice.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
