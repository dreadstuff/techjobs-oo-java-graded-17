package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId++; //initialize unique ID
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

//    @Override
//    public String toString() {
//        if (employer.getValue().isEmpty() && location.getValue().isEmpty() && positionType.getValue().isEmpty() && coreCompetency.getValue().isEmpty()) {
//            return "Job does not exist";
//        }
//        return String;
//
//    }

//    @Override //using lineSeparator + method for null
//    public String toString() {
//
//        String jobString = System.lineSeparator() +
//                "ID: " + id + lineSeparator() +
//                "Name: " + (name == null || name.isEmpty() ? "Data not available" : name) + lineSeparator() + //name string + if null, print not available
//                "Employer: " + (employer == null || employer.toString().isEmpty() ? "Data not available" : employer) + lineSeparator() + //convert to string + if null, print not available
//                "Location: " + (location == null || location.toString().isEmpty() ? "Data not available" : location)  + lineSeparator() +
//                "PositionType: " + (positionType == null || positionType.toString().isEmpty() ? "Data not available" : positionType)  + lineSeparator() +
//                "CoreCompetency: " + (coreCompetency == null || coreCompetency.toString().isEmpty() ? "Data not available" : coreCompetency)  + lineSeparator();
//
//        return jobString + lineSeparator();
//    }

    @Override //switch to getValue() to pass test for labels and data from hashmap section
    public String toString() {
        return lineSeparator() +
                "ID: " + id + lineSeparator() +
                "Name: " + (name == null || name.isEmpty() ? "Data not available" : name) + lineSeparator() +
                "Employer: " + (employer == null || employer.getValue().isEmpty() ? "Data not available" : employer.getValue()) + lineSeparator() +
                "Location: " + (location == null || location.getValue().isEmpty() ? "Data not available" : location.getValue()) + lineSeparator() +
                "Position Type: " + (positionType == null || positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()) + lineSeparator() +
                "Core Competency: " + (coreCompetency == null || coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()) + lineSeparator();
    }

    @Override //unique identifier - correlates to jobtest for =
    public boolean equals(Object o) {
        if (this == o) return true; //checks if 1 = 1
        if (!(o instanceof Job)) return false; //verifies if instance OF Job
        Job job = (Job) o; //convert o to job to access id
        return getId() == job.getId(); //returns comparison of getId(current job) to job.getID (ID being brought in)
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
