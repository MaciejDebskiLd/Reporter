package pl.programator.models;

import pl.programator.observer.Observer;

import java.util.ArrayList;

public class Reporter {
    private String name;
    private String msg;

    public Reporter(String name) {
        this.name = name;
    }

    public void broadcastMessage(String msg) {
        this.msg = msg;
        notifyAllObject(name, msg);
    }

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    private ArrayList<Observer>  observers = new ArrayList<>();

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void addObserver(Observer observer){
        if (observer != null){
            observers.add(observer);
        }
    }

    public void deleteObserver(Observer observer){
        if (observer != null){
            observers.remove(observer);
        }
    }

    public void notifyAllObject(String name, String msg){
        for (Observer observer : observers){
            if (observer instanceof Observer){
                observer.notifyObject(msg, name);
            }
        }
    }
}
