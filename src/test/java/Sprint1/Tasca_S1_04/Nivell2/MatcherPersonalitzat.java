package Sprint1.Tasca_S1_04.Nivell2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
public class MatcherPersonalitzat extends FeatureMatcher<String, Integer>{
    public MatcherPersonalitzat(Matcher <? super Integer> subMatcher) {
        super(subMatcher, "Calcular longitud de la String.",
                "Fail: Longitud no coincideix amb la esperada.");
    }

    @Override
    protected Integer featureValueOf(String string) {
        return string.length();
    }
}
