package net.katerberg.euler.primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeHelper {

    public List<Long> findPrimeFactors(Long number) {
        List<Long> result = new ArrayList<Long>();
        if (number % 2L == 0) {
            result.add(2L);
        }
        for (long i = 3L; i < Math.ceil(Math.sqrt(number)); i += 2L) {
            if (number % i == 0) {
                if (firstPrimeFactor(i) == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private long firstPrimeFactor(Long number) {
        if (number % 2L == 0) {
            return 2;
        }
        for (long i = 3L; i < Math.ceil(Math.sqrt(number)); i += 2L) {
            if (number % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
