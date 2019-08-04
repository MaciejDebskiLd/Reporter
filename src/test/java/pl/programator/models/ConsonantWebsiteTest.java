package pl.programator.models;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class ConsonantWebsiteTest {

    private Reporter reporter1 = new Reporter("Patryk");
    private Reporter reporter2 = new Reporter("Maciej");
    private Reporter reporter3 = new Reporter("Marcin");
    private Reporter reporter4 = new Reporter("Michał");
    private Reporter reporter5 = new Reporter("Mirek");

    private ConsonantWebsite website1 = new ConsonantWebsite();
    private ConsonantWebsite website2 = new ConsonantWebsite();
    private ConsonantWebsite website3 = new ConsonantWebsite();
    private ConsonantWebsite website4 = new ConsonantWebsite();
    private ConsonantWebsite website5 = new ConsonantWebsite();

    @org.junit.jupiter.api.Test
    void countPoints() {

        reporter1.broadcastMessage("");
        reporter2.broadcastMessage(null);
        reporter3.broadcastMessage("AaB 99 ; - ą bCc");
        reporter4.broadcastMessage("lllla");
        reporter5.broadcastMessage("bcdfghjklmnpqrstvwxyz");

        assertAll(
                () -> assertEquals(website1.countPoints(reporter1), 0),
                () ->  assertEquals(website2.countPoints(reporter2), 0),
                () ->  assertEquals(website3.countPoints(reporter3), 4),
                () ->  assertEquals(website4.countPoints(reporter4), 4),
                () -> assertEquals(website5.countPoints(reporter5), 21)
                 );
    }

    @org.junit.jupiter.api.Test
    void capitalMsg() {

        reporter1.broadcastMessage("");
        reporter2.broadcastMessage(null);
        reporter3.broadcastMessage("AaB 99 ; - ą bCc");
        reporter4.broadcastMessage("lllla");

        assertAll(
                () -> assertEquals(valueOf(website1.capitalMsg(reporter1)), ""),
                () -> assertNull(website2.capitalMsg(reporter2)),
                () -> assertEquals(valueOf(website3.capitalMsg(reporter3)), "aaB 99 ; - ą BCC"),
                () -> assertEquals(valueOf(website4.capitalMsg(reporter4)), "LLLLa")
                 );
    }
}