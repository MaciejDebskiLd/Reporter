package pl.programator.models;

import static java.lang.String.valueOf;

public class ConsonantWebsite extends AbstractPortal {

    private Reporter reporter;

    public ConsonantWebsite(Reporter reporter) {
        this.reporter = reporter;
    }

    String name = "Tylko samogłoski";

    @Override
    public int countPoints() {

        int result = 0;
        try {
            for (int i = 0; i < reporter.getMsg().length(); i++) {
                String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
                if (nextChar.matches("[b-df-gj-np-tv-xz]")) {
                    result += 1;
                }
            }
            return result;
        } catch (NullPointerException error) {
            return 0;
        }
    }

    @Override
    public StringBuilder capitalMsg() {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < reporter.getMsg().length(); i++) {
                String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
                if (nextChar.matches("[b-df-gj-np-tv-xz]")) {
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
