package com.example.UrbanGardenPlanner.controller;

import com.example.UrbanGardenPlanner.model.PlantPlan;
import com.example.UrbanGardenPlanner.service.PlantPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Plant Plans.
 */
@RestController
@RequestMapping("/api/plans")
public class PlantPlanController {

    private final PlantPlanService service;

    @Autowired
    public PlantPlanController(PlantPlanService service) {
        this.service = service;
    }

    @PostMapping
    public PlantPlan addPlan(@RequestBody PlantPlan plan) {
        return service.addPlan(plan);
    }

    @GetMapping
    public List<PlantPlan> getAllPlans() {
        return service.getAllPlans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlantPlan> getPlanById(@PathVariable String id) {
        return service.getPlanById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public PlantPlan updatePlan(@PathVariable String id, @RequestBody PlantPlan plan) {
        return service.updatePlan(id, plan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable String id) {
        service.deletePlan(id);
        return ResponseEntity.noContent().build();
    }
}
