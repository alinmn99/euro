package com.teams.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "NationalTeams")
public class NationalTeams {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "nationalTeam")
    private Set<TeamBasement> teamBasements;

    public NationalTeams(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public NationalTeams() {

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
        return "NationalTeams{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
