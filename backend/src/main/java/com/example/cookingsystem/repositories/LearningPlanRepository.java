package com.example.cookingsystem.repositories;

import com.example.cookingsystem.models.LearningPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearningPlanRepository extends MongoRepository<LearningPlan, String> {
    List<LearningPlan> findAll();
    List<LearningPlan> findByUser_Id(String userId);
}