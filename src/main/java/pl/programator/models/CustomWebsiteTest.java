package pl.programator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomWebsiteTest {

    @Test
    void countPoints() {
        Reporter reporter1 = new Reporter();
        reporter1.broadcastMessage("Patryk Igras");

        Reporter reporter2 = new Reporter();
        reporter2.broadcastMessage("a b c k");

        Reporter reporter3 = new Reporter();
        reporter3.broadcastMessage("");

        CustomWebsite customWebsite1 = new CustomWebsite(reporter1);
        CustomWebsite customWebsite2 = new CustomWebsite(reporter2);
        CustomWebsite customWebsite3 = new CustomWebsite(reporter3);

        assertAll(
                () -> assertEquals(5, customWebsite1.countPoints()),
                () -> assertEquals(4, customWebsite2.countPoints()),
                () -> assertEquals(0, customWebsite3.countPoints())
        );
    }
}