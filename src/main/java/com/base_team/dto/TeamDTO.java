package com.base_team.dto;

import com.base_team.model.TeamModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamDTO {

    private Integer id;
    private String name;
    private String city;
    private String country;
    private String stadium;

    public TeamModel toModel() {
        return TeamModel.builder()
                .id(this.id)
                .name(this.name)
                .city(this.city)
                .country(this.country)
                .stadium(this.stadium)
                .build();
    }
}