package com.base_team.model;

import com.base_team.dto.TeamDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "team")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(80)")
    private String name;

    @Column(name = "city", columnDefinition = "varchar(80)")
    private String city;

    @Column(name = "country", columnDefinition = "varchar(80)")
    private String country;

    @Column(name = "stadium", columnDefinition = "varchar(80)")
    private String stadium;

    public TeamDTO toDTO() {
        return TeamDTO.builder()
                .id(this.id)
                .name(this.name)
                .city(this.city)
                .country(this.country)
                .stadium(this.stadium)
                .build();
    }
}