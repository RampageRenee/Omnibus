package com.company.Teams;

import com.company.Humans.Villain;

import java.util.ArrayList;

public class TeamVillain extends Team {
    private ArrayList<Villain> villainTeam;
    public static ArrayList<TeamVillain> allVillainTeam = new ArrayList<>();

    public TeamVillain(Integer teamId, String teamName) {
        super(teamId, teamName);
    }

    public ArrayList<Villain> getVillainTeam() {
        return villainTeam;
    }

    public void setVillainTeam(ArrayList<Villain> villainTeam) {
        this.villainTeam = villainTeam;
    }

    @Override
    public String getAllDetailedInformation() {
        String villain = "";
        for (int i = 0; i < getVillainTeam().size(); i++) {
            villain = villain + getVillainTeam().get(i).getName() + "\n";
        }

        return "Team ID: " + teamId + " | Team name: " + teamName + "\nHeroes from this team: \n" + villain;

    }

    @Override
    public String getAllBasicInformation() {

        return "ID number: " + teamId + " | Name: " + teamName;
    }


}
