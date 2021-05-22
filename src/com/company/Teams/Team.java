package com.company.Teams;

import com.company.Humans.List;

import java.util.ArrayList;

public abstract class Team implements List {
    public static ArrayList<Team> allTeams = new ArrayList<>();
    protected Integer teamId;
    protected String teamName;

    public Team(Integer teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String toString() {
        return "Team name: " + teamName + " ID: " + teamId;
    }

}
