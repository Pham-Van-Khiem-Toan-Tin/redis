package com.redis.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redis.test.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>  {
    UserEntity findByName(String userName);
}
