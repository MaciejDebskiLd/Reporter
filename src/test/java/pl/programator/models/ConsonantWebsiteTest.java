package pl.programator.models;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

class ConsonantWebsiteTest {

    private Reporter reporter1 = new Reporter("Patryk");
    private Reporter reporter2 = new Reporter("Maciej");
    private  Reporter reporter3 = new Reporter("Marcin");
    private  Reporter reporter4 = new Reporter("Michał");


    private   ConsonantWebsite website1 = new ConsonantWebsite();
    private   ConsonantWebsite website2 = new ConsonantWebsite();
    private   ConsonantWebsite website3 = new ConsonantWebsite();
    private    ConsonantWebsite website4 = new ConsonantWebsite();




    @org.junit.jupiter.api.Test
    void countPoints() {

        reporter1.broadcastMessage("");
        reporter2.broadcastMessage(null);
        reporter3.broadcastMessage("AaB 99 ; - ą bCc");
        reporter4.broadcastMessage("lllla");


        assertEquals(website1.countPoints(reporter1), 0);
        assertEquals(website2.countPoints(reporter2), 0);
        assertEquals(website3.countPoints(reporter3), 4);
        assertEquals(website4.countPoints(reporter4), 4);
    }
}