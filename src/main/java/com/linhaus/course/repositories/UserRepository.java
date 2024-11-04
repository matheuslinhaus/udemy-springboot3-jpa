package com.linhaus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhaus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}