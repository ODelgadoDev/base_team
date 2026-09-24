package com.base_team.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.base_team.dto.TeamDTO;
import com.base_team.model.TeamModel;
import com.base_team.repository.TeamRepository;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamDTO> findAll() {
        return teamRepository.findAll()
                .stream()
                .map(TeamModel::toDTO)
                .toList();
    }

    public TeamDTO save(TeamDTO teamDTO) {
        TeamModel teamModel = teamDTO.toModel();
        TeamModel savedTeam = teamRepository.save(teamModel);

        return savedTeam.toDTO();
    }
}