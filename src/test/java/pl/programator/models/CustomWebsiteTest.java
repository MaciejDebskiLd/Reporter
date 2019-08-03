package pl.programator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomWebsiteTest {
    private Reporter reporter1 = new Reporter("Patryk");
    private Reporter reporter2 = new Reporter("Maciej");
    private Reporter reporter3 = new Reporter("Michał");


    private CustomWebsite customWebsite1 = new CustomWebsite();
    private CustomWebsite customWebsite2 = new CustomWebsite();
    private CustomWebsite customWebsite3 = new CustomWebsite();

    @Test
    void countPoints() {

        reporter1.broadcastMessage("Patryk Igras");
        reporter2.broadcastMessage("a b c k");
        reporter3.broadcastMessage("");

        assertAll(
                () -> assertEquals(5, customWebsite1.countPoints(reporter1)),
                () -> assertEquals(4, customWebsite2.countPoints(reporter2)),
                () -> assertEquals(0, customWebsite3.countPoints(reporter3))
        );
    }
}