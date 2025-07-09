package com.example.UrbanGardenPlanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a gardening plan for a single plant.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "plants")
public class PlantPlan {
    @Id
    private String id;
    private String name;
    private String plantingSeason;
    private String sunlightNeeds;
    private String wateringFreq;
    private String notes;
}
