package pl.programator.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelPortalTest {

    Reporter reporter1 = new Reporter();
    Reporter reporter2 = new Reporter();
    Reporter reporter3 = new Reporter();
    Reporter reporter4 = new Reporter();

    VowelPortal vowelPortal1 = new VowelPortal(reporter1);
    VowelPortal vowelPortal2 = new VowelPortal(reporter2);
    VowelPortal vowelPortal3 = new VowelPortal(reporter3);
    VowelPortal vowelPortal4 = new VowelPortal(reporter4);


    @Test
    void checkCountPoints() {
        reporter1.broadcastMessage("abc");
        reporter2.broadcastMessage("aabi");
        reporter3.broadcastMessage("AaFG");
        reporter4.broadcastMessage("");

        assertEquals(1, vowelPortal1.countPoints());
        assertEquals(3, vowelPortal2.countPoints());
        assertEquals(2, vowelPortal3.countPoints());
        assertEquals(0, vowelPortal4.countPoints());




    }
}