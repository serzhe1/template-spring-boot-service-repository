package org.renamethis;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class MainService {

    public void someMethod() {
        System.out.println("someMethod");

        if (new Random().nextInt() % 2 == 0) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
