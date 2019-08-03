package pl.programator.models;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class ConsonantWebsiteTest {

   private Reporter reporter1 = new Reporter();
    private Reporter reporter2 = new Reporter();
    private  Reporter reporter3 = new Reporter();
    private  Reporter reporter4 = new Reporter();


    private   ConsonantWebsite website1 = new ConsonantWebsite(reporter1);
    private   ConsonantWebsite website2 = new ConsonantWebsite(reporter2);
    private   ConsonantWebsite website3 = new ConsonantWebsite(reporter3);
    private    ConsonantWebsite website4 = new ConsonantWebsite(reporter4);




    @org.junit.jupiter.api.Test
    void countPoints() {

        reporter1.broadcastMessage("");
        reporter2.broadcastMessage(null);
        reporter3.broadcastMessage("AaB 99 ; - ą bCc");
        reporter4.broadcastMessage("lllla");


        assertEquals(website1.countPoints(), 0);
        assertEquals(website2.countPoints(), 0);
        assertEquals(website3.countPoints(), 4);
        assertEquals(website4.countPoints(), 4);
    }
}