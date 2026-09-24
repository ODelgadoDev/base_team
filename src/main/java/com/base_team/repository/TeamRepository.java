package com.base_team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base_team.model.TeamModel;

@Repository
public interface TeamRepository extends JpaRepository<TeamModel, Integer> {
}