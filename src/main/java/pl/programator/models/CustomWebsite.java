package pl.programator.models;

import pl.programator.observer.Observer;

public class CustomWebsite extends AbstractPortal implements Observer{
    private String portalName = "CustomWebsite";


    @Override
    public int countPoints(Reporter reporter) {
        String msg = reporter.getMsg();

        int points = 0;
        for (int i = 0; i < msg.length(); i++){
            String letter = String.valueOf(msg.charAt(i));
            if (letter.matches("[a-kA-K]")){
                points += 1;
            }
        }
        return points;
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
