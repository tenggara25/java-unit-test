package kang.alamsyah.hutama.test;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    private int counter =0;

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    @Order(1)
    void test1() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void test3() {
        counter++;
        System.out.println(counter);
    }
}
