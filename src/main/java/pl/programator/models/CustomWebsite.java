package pl.programator.models;

import static java.lang.String.valueOf;

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


    @Override
    public StringBuilder capitalMsg() {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < reporter.getMsg().length(); i++) {
                String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
                if (nextChar.matches("[a-kA-K]")) {
                    stringBuilder.append(nextChar.toUpperCase());
                } else {
                    stringBuilder.append(nextChar);
                }
            }

            return stringBuilder;
        } catch (NullPointerException error) {
            return null;
        }


    }
}
