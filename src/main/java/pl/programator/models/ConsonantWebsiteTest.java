package pl.programator.models;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

class ConsonantWebsiteTest {

    @Test
    void countPoints() {
Reporter reporter1 = new Reporter();
        Reporter reporter2 = new Reporter();
        Reporter reporter3 = new Reporter();
        Reporter reporter4 = new Reporter();

        reporter1.broadcastMessage("");
        reporter2.broadcastMessage(null);
        reporter3.broadcastMessage("AaB 99 ; - ą bCc");
        reporter4.broadcastMessage("lllla");

       ConsonantWebsite website1 = new ConsonantWebsite(reporter1);
        ConsonantWebsite website2 = new ConsonantWebsite(reporter1);
        ConsonantWebsite website3 = new ConsonantWebsite(reporter1);
        ConsonantWebsite website4 = new ConsonantWebsite(reporter1);
        
       assertEquals(website1.countPoints(),0);
        assertEquals(website2.countPoints(),0);
        assertEquals(website3.countPoints(),4);
        assertEquals(website4.countPoints(),4);

    }
}