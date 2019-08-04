package pl.programator.models;

import pl.programator.observer.Observer;

import static java.lang.String.valueOf;

public class VowelWebsite extends AbstractPortal implements Observer {
    public VowelWebsite() {
        portalName = "Vowel Website";
    }

    @Override
    public int countPoints(Reporter reporter) {

        int result = 0;
        for (int i = 0; i < reporter.getMsg().length(); i++) {
            String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
            if (nextChar.matches("[aeiouy]")) {
                result += 1;
            }

        }
        return result;
    }

    @Override
    public StringBuilder capitalMsg(Reporter reporter) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int i = 0; i < reporter.getMsg().length(); i++) {
                String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
                if (nextChar.matches("[aeiouy]")) {
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

    @Override
    public void notifyObject(String msg, String name) {}
}

