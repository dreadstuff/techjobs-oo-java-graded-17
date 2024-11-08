package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.System.lineSeparator;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job a = new Job();
        Job b = new Job();
        assertNotEquals(a.getId(), b.getId());
    }

    @Test //asserttrue and assertequals for all classes AND fields
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getEmployer() instanceof Employer); //instance checks - employer/location is correct class check
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(), "Product tester" ); //checks values set match expected values
        assertEquals(testJob.getEmployer().getValue(), "ACME" );
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test //generate two jobs that equal each other - test for assertfalse (equals returns false)
    public void testJobsForEquality() {
        Job a = new Job("Test 1", new Employer("EmployerTest"), new Location("LocationTest"), new PositionType("PositionTest"), new CoreCompetency("CoreCompTest"));
        Job b = new Job("Test 1", new Employer("EmployerTest"), new Location("LocationTest"), new PositionType("PositionTest\""), new CoreCompetency("CoreCompTest"));
        assertFalse(a.equals(b));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString().startsWith(lineSeparator()));
        assertTrue(job.toString().endsWith(lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = lineSeparator() +
                "ID: " + job.getId() + lineSeparator() +
                "Name: " + "Product tester" + lineSeparator() +
                "Employer: " + "ACME" + lineSeparator() +
                "Location: " + "Desert" + lineSeparator() +
                "Position Type: " + "Quality control" + lineSeparator() +
                "Core Competency: " + "Persistence" + lineSeparator();

        assertEquals(jobString,job.toString());
    }

}
