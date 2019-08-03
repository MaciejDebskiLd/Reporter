package pl.programator.observer;

import pl.programator.models.Reporter;

public interface Observer {
     void notifyObject(String msg, String reporterName);
}
