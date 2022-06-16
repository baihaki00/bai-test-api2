package com.bai.app.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bai.app.rest.model.User;

public interface UserRepo extends JpaRepository<User, Long>  {

}
