package pl.programator.models;
import static java.lang.String.valueOf;
public class VowelPortal extends AbstractPortal {

    Reporter reporter;

    public VowelPortal(Reporter reporter) {
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
}

