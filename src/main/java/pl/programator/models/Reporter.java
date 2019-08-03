package pl.programator.models;

import pl.programator.observer.Observer;

import java.util.ArrayList;

public class Reporter {

    protected String msg;

    public void broadcastMessage(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
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

    public void notifyAllObject(){
        for (Observer observer : observers){
            if (observer instanceof Observer){
                observer.notifyObject();
            }
        }
    }
}
