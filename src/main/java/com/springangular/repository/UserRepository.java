package com.springangular.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springangular.model.User;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findUserByEmail(String email);

}
