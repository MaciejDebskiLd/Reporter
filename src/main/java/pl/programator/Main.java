package pl.programator;

import pl.programator.models.AbstractPortal;
import pl.programator.models.ConsonantWebsite;
import pl.programator.models.Reporter;

public class Main {

    public static void main(String[] args) {
        Reporter reporter1 = new Reporter();

        reporter1.broadcastMessage("szfsafsdf");

        ConsonantWebsite portal = new ConsonantWebsite(reporter1);

        portal.countPoints();

    }
}
