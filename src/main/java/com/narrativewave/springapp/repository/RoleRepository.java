package com.narrativewave.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.narrativewave.springapp.model.Role;

/**
 * DAO for {@link Role}.
 */

public interface RoleRepository extends MongoRepository<Role, String> {

}
