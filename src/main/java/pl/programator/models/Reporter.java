package pl.programator.models;

public class Reporter {

    protected String msg;

    public void broadcastMessage(String msg) {
        this.msg = msg;
    }
  
    public String getMsg() {
        return msg;
    }
}
