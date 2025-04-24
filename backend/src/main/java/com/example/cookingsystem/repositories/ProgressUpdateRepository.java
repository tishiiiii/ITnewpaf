package com.example.cookingsystem.repositories;

import com.example.cookingsystem.models.ProgressUpdate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgressUpdateRepository extends MongoRepository<ProgressUpdate, String> {
    List<ProgressUpdate> findAll();
    List<ProgressUpdate> findByUser_Id(String userId);
}