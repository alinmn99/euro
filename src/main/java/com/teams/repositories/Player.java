package com.teams.repositories;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Player")
public class Player {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "player")
    private Set<TeamBasement> teamBasements ;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Player() {

    }

    public Set<TeamBasement> getTeamBasements() {
        return teamBasements;
    }

    public void setTeamBasements(Set<TeamBasement> teamBasements) {
        this.teamBasements = teamBasements;
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

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
