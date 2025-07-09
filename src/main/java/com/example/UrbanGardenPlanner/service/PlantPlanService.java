package com.example.UrbanGardenPlanner.service;

import com.example.UrbanGardenPlanner.model.PlantPlan;
import com.example.UrbanGardenPlanner.repo.PlantPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service for managing plant plans.
 */
@Service
public class PlantPlanService {
    private final PlantPlanRepository repository;

    @Autowired
    public PlantPlanService(PlantPlanRepository repository) {
        this.repository = repository;
    }

    public PlantPlan addPlan(PlantPlan plan) {
        return repository.save(plan);
    }

    public List<PlantPlan> getAllPlans() {
        return repository.findAll();
    }

    public Optional<PlantPlan> getPlanById(String id) {
        return repository.findById(id);
    }

    public PlantPlan updatePlan(String id, PlantPlan updated) {
        updated.setId(id);
        return repository.save(updated);
    }

    public void deletePlan(String id) {
        repository.deleteById(id);
    }
}
