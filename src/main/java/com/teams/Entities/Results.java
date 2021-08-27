package com.teams.Entities;

import javax.persistence.*;

@Entity
@Table(name = "results")
public class Results {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Results() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Results(Long id) {
        this.id = id;
    }
}
