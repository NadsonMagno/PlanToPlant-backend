package com.plantoplant.plantopant.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
@NoArgsConstructor
public class User {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    string name;

    string email;
    string password;

    string profilePincture;
    

}
