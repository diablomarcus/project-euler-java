package net.katerberg.euler.primes;

import java.util.ArrayList;
import java.util.List;

public class PrimeHelper {

    private Prime prime;

    public PrimeHelper(Prime prime) {
        this.prime = prime;
    }

    public PrimeHelper() {
        prime = new Prime();
    }

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

    public long findXthPrimeNumber(int input) {
        long currentPrime = 2;
        for (int i = 1; i < input; i++) {
            currentPrime = prime.findNextPrime(currentPrime);
        }
        return currentPrime;
    }
}
