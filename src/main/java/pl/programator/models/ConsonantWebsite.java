package pl.programator.models;

import pl.programator.observer.Observer;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class ConsonantWebsite extends AbstractPortal implements Observer {
    private String portalName = "ConsonantWebsite";

    @Override
    public int countPoints(Reporter reporter) {

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

    @Override
    public StringBuilder capitalMsg() {
        return null;
    }

    @Override
    public void notifyObject(String msg, String name) {
        System.out.println(portalName + " " + name + " " + msg);
    }
}
