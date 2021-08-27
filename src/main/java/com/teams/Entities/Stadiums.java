package com.teams.Entities;

import javax.persistence.*;


@Entity
@Table(name = "stadiums")
public class Stadiums {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    public Stadiums(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Stadiums() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}





