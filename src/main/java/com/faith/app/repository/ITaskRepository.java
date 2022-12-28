package com.faith.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Task;



@Repository
public interface ITaskRepository extends MongoRepository<Task,String>{

}
