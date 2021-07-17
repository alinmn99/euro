package com.teams.Dto;

import com.teams.Entities.NationalTeams;
import lombok.Data;

import java.util.List;

@Data
public class NationalTeamsDto {
    private Long id;
    private String name;

    public void setName(List<NationalTeams> all) {
    }
}
