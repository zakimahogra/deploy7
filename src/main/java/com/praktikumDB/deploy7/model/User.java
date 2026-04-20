package com.praktikumDB.deploy7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name = "20230140144")
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    private String id;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private String nim;
}

