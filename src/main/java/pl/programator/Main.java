package pl.programator;

import pl.programator.models.Reporter;
import pl.programator.models.VowelPortal;

public class Main {

    public static void main(String[] args) {
        Reporter reporter1 = new Reporter();

        reporter1.broadcastMessage("szfsiiafsdf");

        VowelPortal poret = new VowelPortal(reporter1);

        System.out.println(poret.countPoints());

    }
}
