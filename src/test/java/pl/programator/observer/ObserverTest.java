package pl.programator.observer;

import org.junit.jupiter.api.Test;
import pl.programator.models.ConsonantWebsite;
import pl.programator.models.CustomWebsite;
import pl.programator.models.Reporter;
import pl.programator.models.VowelWebsite;

class ObserverTest {
    private Reporter reporter1 = new Reporter("Patryk");
    private Reporter reporter2 = new Reporter("Maciej");

    private CustomWebsite customWebsite1 = new CustomWebsite();
    private ConsonantWebsite consonantWebsite = new ConsonantWebsite();
    private VowelWebsite vowelWebsite = new VowelWebsite();

    @Test
    void checkObserver(){
        reporter1.addObserver(customWebsite1);
        reporter1.addObserver(consonantWebsite);
        reporter1.addObserver(vowelWebsite);


        reporter1.broadcastMessage("msg 1");

        reporter2.addObserver(customWebsite1);
        reporter2.addObserver(consonantWebsite);
        reporter2.addObserver(vowelWebsite);

        reporter2.broadcastMessage("msg 2");
    }

}