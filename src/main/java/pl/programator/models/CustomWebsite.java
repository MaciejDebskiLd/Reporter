package pl.programator.models;

public class CustomWebsite extends AbstractPortal{
    private Reporter reporter;

    public CustomWebsite(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public int countPoints() {
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
}
