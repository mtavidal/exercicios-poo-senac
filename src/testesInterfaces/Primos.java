package testesInterfaces;

import java.util.function.Predicate;

public class Primos implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        for (int j = 2; j < integer; j++) {
            if (integer % j == 0)
                return false;
        }
        return true;
    }
}
