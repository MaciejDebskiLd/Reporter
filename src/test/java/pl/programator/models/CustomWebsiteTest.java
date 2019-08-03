package pl.programator.models;

import org.junit.jupiter.api.Test;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

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

        @Test
        void capitalMsg() {
            Reporter reporter1 = new Reporter();
            Reporter reporter2 = new Reporter();
            Reporter reporter3 = new Reporter();
            Reporter reporter4 = new Reporter();
            reporter1.broadcastMessage("");
            reporter2.broadcastMessage(null);
            reporter3.broadcastMessage("AaB 99 ; - ą bCc");
            reporter4.broadcastMessage("lllla");
            CustomWebsite customWebsite1 = new CustomWebsite(reporter1);
            CustomWebsite customWebsite2 = new CustomWebsite(reporter2);
            CustomWebsite customWebsite3 = new CustomWebsite(reporter3);
            CustomWebsite customWebsite4 = new CustomWebsite(reporter4);
            assertAll(
                    () ->  assertEquals(valueOf(customWebsite1.capitalMsg()), ""),
                    () ->  assertNull(customWebsite2.capitalMsg()),
                    () ->  assertEquals(valueOf(customWebsite3.capitalMsg()), "AAB 99 ; - ą BCC"),
                    () ->  assertEquals(valueOf(customWebsite4.capitalMsg()), "llllA")

            );
    }
}