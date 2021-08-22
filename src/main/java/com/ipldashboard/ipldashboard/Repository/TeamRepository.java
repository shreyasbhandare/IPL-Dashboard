package com.ipldashboard.ipldashboard.Repository;

import com.ipldashboard.ipldashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByTeamName(String teamName);
}
