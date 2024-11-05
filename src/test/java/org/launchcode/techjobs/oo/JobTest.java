package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job a = new Job();
        Job b = new Job();
        assertNotEquals(a.getId(), b.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer(), "ACME");
        assertEquals(testJob.getLocation(), "Desert");
        assertEquals(testJob.getPositionType(), "Quality control");
        assertEquals(testJob.getCoreCompetency(), "Persistence");
    }

    @Test //generate two jobs that equal each other - test for assertfalse
    public void testJobsForEquality() {
        Job a = new Job("Test 1", new Employer("EmployerTest"), new Location("LocationTest"), new PositionType("PositionTest"), new CoreCompetency("CoreCompTest"));
        Job b = new Job("Test 1", new Employer("EmployerTest"), new Location("LocationTest"), new PositionType("PositionTest\""), new CoreCompetency("CoreCompTest"));
        assertFalse(a.equals(b));
    }
}
