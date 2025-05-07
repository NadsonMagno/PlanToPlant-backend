package com.plantoplant.plantopant.model.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Entity
@Table (name="tb_plants")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgUrl;
    private String species;
    private String scientificName;
    private String description;
    private double wateringFrequency;
    private double wateringAmount;
    private String fertilizingSchedule;
    private String sunlightRequirements;
    private String soilType;
    private String plantingSeason;
    private String pruningRequirements;
    private String pestsAndDiseases;
    private String propagationMethods;

    @ManyToOne
    @JoinColumn(name = "garden_id")
    private Gardens garden;

}
