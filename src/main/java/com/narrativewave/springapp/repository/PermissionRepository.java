package com.narrativewave.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.narrativewave.springapp.model.Permission;

/**
 * DAO for {@link Permission}.
 */
public interface PermissionRepository extends MongoRepository<Permission, String>{

}
