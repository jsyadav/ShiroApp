package com.narrativewave.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.narrativewave.springapp.model.User;

/**
 * DAO for {@link User}.
 */

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

    User findByEmailAndActive(String email, boolean active);

}
