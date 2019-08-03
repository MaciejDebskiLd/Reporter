package pl.programator.models;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class ConsonantWebsite extends AbstractPortal {

    private Reporter reporter;

    public ConsonantWebsite(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public int countPoints() {

        int result = 0;
        try{
        for (int i = 0; i < reporter.getMsg().length(); i++) {
            String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
            if (nextChar.matches("[b-df-gj-np-tv-xz]")) {
                result += 1;
            }
        }
        return result;}
        catch(NullPointerException error){return 0;}
    }
}
