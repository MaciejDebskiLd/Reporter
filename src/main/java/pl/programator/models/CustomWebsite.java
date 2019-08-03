package pl.programator.models;

import static java.lang.String.valueOf;


import pl.programator.observer.Observer;

public class CustomWebsite extends AbstractPortal implements Observer {


    public CustomWebsite() {
        portalName = "CustomWebsite";
    }

    @Override
    public void setPortalName(String portalName) {
    }

    @Override
    public int countPoints(Reporter reporter) {



    String msg = reporter.getMsg();


    int points = 0;

        for(
    int i = 0; i<msg.length();i++)

    {
        String letter = String.valueOf(msg.charAt(i));
        if (letter.matches("[a-kA-K]")) {
            points += 1;
        }
    }
        return points;
}


    @Override
    public StringBuilder capitalMsg(Reporter reporter) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < reporter.getMsg().length(); i++) {
                String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
                if (nextChar.matches("[a-kA-K]")) {
                    stringBuilder.append(nextChar.toUpperCase());
                } else {
                    stringBuilder.append(nextChar);
                }
            }

            return stringBuilder;
        } catch (NullPointerException error) {
            return null;
        }


    }

    @Override
    public void notifyObject(String msg, String name) {
        System.out.println(portalName + " " + name + " " + msg);
    }
}
