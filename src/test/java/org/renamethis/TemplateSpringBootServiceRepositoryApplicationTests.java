package org.renamethis;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TemplateSpringBootServiceRepositoryApplicationTests {

    @Autowired
    private MainService mainService;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(mainService);
    }

    @Test
    void mainServiceRunsWhenRandomValueIsEven() {
        new MainService(new FixedRandom(2)).someMethod();
    }

    @Test
    void mainServiceRunsWhenRandomValueIsOdd() {
        new MainService(new FixedRandom(1)).someMethod();
    }

    private static final class FixedRandom extends Random {

        private final int value;

        private FixedRandom(int value) {
            this.value = value;
        }

        @Override
        public int nextInt() {
            return value;
        }
    }
}
