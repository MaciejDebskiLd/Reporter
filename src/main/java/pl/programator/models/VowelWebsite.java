package pl.programator.models;
import static java.lang.String.valueOf;
public class VowelWebsite extends AbstractPortal {

    private Reporter reporter;

    public VowelWebsite(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public int countPoints() {

        int result = 0;
        for (int i = 0; i < reporter.getMsg().length(); i++) {
            String nextChar = valueOf(reporter.getMsg().toLowerCase().charAt(i));
            if (nextChar.matches("[aeiouy]")) {
                result += 1;
            }

        }return result;
    }

    @Override
    public StringBuilder capitalMsg() {

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
}

