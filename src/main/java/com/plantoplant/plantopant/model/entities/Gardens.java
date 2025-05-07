package com.plantoplant.plantopant.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_users")
public class Gardens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private String size;
    private String soilType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;




}
