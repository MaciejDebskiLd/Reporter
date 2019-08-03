package pl.programator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelWebsiteTest {

    private Reporter reporter1 = new Reporter("Patryk");
    private Reporter reporter2 = new Reporter("Maciej");
    private Reporter reporter3 = new Reporter("Marcin");
    private Reporter reporter4 = new Reporter("Michał");

    private VowelWebsite vowelWebsite1 = new VowelWebsite();
    private VowelWebsite vowelWebsite2 = new VowelWebsite();
    private VowelWebsite vowelWebsite3 = new VowelWebsite();
    private  VowelWebsite vowelWebsite4 = new VowelWebsite();


    @Test
    void checkCountPoints() {
        reporter1.broadcastMessage("abc");
        reporter2.broadcastMessage("aabi");
        reporter3.broadcastMessage("AaFG");
        reporter4.broadcastMessage("");

        assertEquals(1, vowelWebsite1.countPoints(reporter1));
        assertEquals(3, vowelWebsite2.countPoints(reporter2));
        assertEquals(2, vowelWebsite3.countPoints(reporter3));
        assertEquals(0, vowelWebsite4.countPoints(reporter4));




    }
}