package com.example.UrbanGardenPlanner.repo;

import com.example.UrbanGardenPlanner.model.PlantPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository for PlantPlan entities.
 */
public interface PlantPlanRepository extends MongoRepository<PlantPlan, String> {
}
