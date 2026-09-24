package com.base_team.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base_team.dto.TeamDTO;
import com.base_team.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public ResponseEntity<List<TeamDTO>> findAll() {
        List<TeamDTO> list = teamService.findAll();

        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<TeamDTO> save(@RequestBody TeamDTO teamDTO) {
        TeamDTO savedTeam = teamService.save(teamDTO);

        return ResponseEntity.ok(savedTeam);
    }
}