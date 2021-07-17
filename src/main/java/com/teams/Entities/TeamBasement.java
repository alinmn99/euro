package com.teams.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team_basement")
public class TeamBasement {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    private NationalTeams nationalTeam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "player_id")
    private Player player;


    public TeamBasement(Long id, NationalTeams nationalTeam, Long player_id) {
        this.id = id;
        this.nationalTeam = nationalTeam;
        this.player = player;
    }

    public TeamBasement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NationalTeams getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(NationalTeams nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "TeamBasement{" +
                "id=" + id +
                ", team_id=" + nationalTeam +
                ", player_id=" + player +
                '}';
    }
}
