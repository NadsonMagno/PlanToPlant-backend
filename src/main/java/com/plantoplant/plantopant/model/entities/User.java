package com.plantoplant.plantopant.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

}
