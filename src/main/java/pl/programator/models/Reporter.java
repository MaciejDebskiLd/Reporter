package pl.programator.models;

import pl.programator.observer.Observer;

import java.util.ArrayList;

public class Reporter {
    private String msg;
    private String name;

    public Reporter(String name) {
        this.name = name;
    }

    public void broadcastMessage(String msg) {
        this.msg = msg;
        notifyAllObject(msg);
    }

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    private ArrayList<Observer>  observers = new ArrayList<>();

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

    public void notifyAllObject(String msg){
        for (Observer observer : observers){
            if (observer instanceof Observer){
                observer.notifyObject(msg, name);
            }
        }
    }
}
