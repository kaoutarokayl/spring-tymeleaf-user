package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
}
