package org.renamethis;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class MainService {

    private final Random random;

    public MainService() {
        this(new Random());
    }

    MainService(Random random) {
        this.random = random;
    }

    public void someMethod() {
        System.out.println("someMethod");

        if (random.nextInt() % 2 == 0) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
