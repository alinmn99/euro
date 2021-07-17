package com.teams.Entities;

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

    @Column(name ="price")
    private int price;

    @Column(name = "domestic_team")
    private String domestic_team;

    @Column(name = "age")
    private int  age;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDomestic_team() {
        return domestic_team;
    }

    public void setDomestic_team(String domestic_team) {
        this.domestic_team = domestic_team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", domestic_team='" + domestic_team + '\'' +
                ", age=" + age +
                ", teamBasements=" + teamBasements +
                '}';
    }
}
