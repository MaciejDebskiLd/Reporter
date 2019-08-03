package pl.programator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelWebsiteTest {

    private Reporter reporter1 = new Reporter();
    private Reporter reporter2 = new Reporter();
    private Reporter reporter3 = new Reporter();
    private Reporter reporter4 = new Reporter();

    private VowelWebsite vowelWebsite1 = new VowelWebsite(reporter1);
    private VowelWebsite vowelWebsite2 = new VowelWebsite(reporter2);
    private VowelWebsite vowelWebsite3 = new VowelWebsite(reporter3);
    private VowelWebsite vowelWebsite4 = new VowelWebsite(reporter4);


    @Test
    void checkCountPoints() {
        reporter1.broadcastMessage("abc");
        reporter2.broadcastMessage("aabi");
        reporter3.broadcastMessage("AaFG");
        reporter4.broadcastMessage("");

        assertEquals(1, vowelWebsite1.countPoints());
        assertEquals(3, vowelWebsite2.countPoints());
        assertEquals(2, vowelWebsite3.countPoints());
        assertEquals(0, vowelWebsite4.countPoints());




    }
}