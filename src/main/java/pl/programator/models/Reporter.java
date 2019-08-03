package pl.programator.models;

public class Reporter {

    private String msg;

    String getMsg() {
        return msg;
    }

    public void broadcastMessage(String msg){
        this.msg = msg;
    }
}
