package pl.programator;


import pl.programator.models.*;

public class Main {

    public static void main(String[] args) {

        Reporter reporter1 = new Reporter("Patryk");

        CustomWebsite customWebsite1 = new CustomWebsite();
        ConsonantWebsite consonantWebsite = new ConsonantWebsite();
        VowelWebsite vowelWebsite = new VowelWebsite();

        reporter1.addObserver(customWebsite1);
        reporter1.addObserver(consonantWebsite);
        reporter1.addObserver(vowelWebsite);
        reporter1.broadcastMessage("Cows lose their jobs as milk prices drop");

        Raport raport = new Raport();
        raport.printRaport(reporter1);




    }
}
