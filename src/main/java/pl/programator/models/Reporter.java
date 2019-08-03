package pl.programator.models;

public class Reporter {

    private String msg;
  
    public void broadcastMessage(String msg) {
        this.msg = msg;
    }
  
    public String getMsg() {
        return msg;
    }
}
