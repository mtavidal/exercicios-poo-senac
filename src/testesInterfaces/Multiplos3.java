package testesInterfaces;

import java.util.function.Predicate;

public class Multiplos3 implements Predicate<Integer> {


    @Override
    public boolean test(Integer integer) {
        if (integer%3 == 0){
            return true;
        }
        return false;
    }
}
