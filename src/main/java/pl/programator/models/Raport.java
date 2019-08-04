package pl.programator.models;

import pl.programator.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Raport {
    List<Observer> observers;


    public void printRaport(Reporter reporter) {
        observers = reporter.getObservers();

        for (Observer observer : observers) {
            if (observer instanceof AbstractPortal) {
                AbstractPortal abstractPortal = (AbstractPortal) observer;
                System.out.println("(" + abstractPortal.getPortalName() + ", " + abstractPortal.countPoints(reporter) + ") informs: " + abstractPortal.capitalMsg(reporter));

            }
        }
    }
}
