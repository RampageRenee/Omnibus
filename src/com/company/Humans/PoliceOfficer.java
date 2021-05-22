package com.company.Humans;

import java.util.ArrayList;

public class PoliceOfficer extends NormalHuman {
    public static ArrayList<PoliceOfficer> allPoliceOfficers = new ArrayList<>();
    private final String department;
    private Boolean corrupt;

    public PoliceOfficer(String name, Integer idNumber, String department, Boolean corrupt) {
        super(name, idNumber);
        this.department = department;
        this.corrupt = corrupt;
    }

    public String getDepartment() {
        return department;
    }

    public Boolean getCorrupt() {
        return corrupt;
    }

    @Override
    public String getAllDetailedInformation() {
        return "ID number: " + idNumber + "\n Officer: " + name + "\n Department: " + department + "\n It's " + corrupt + " that this officer is corrupt.";
    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + idNumber + "\n Officer: " + name;
    }
}
