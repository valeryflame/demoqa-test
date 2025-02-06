package lesson3;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("### beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###   beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###   afterEach()");
        result = 0;
    }

    @AfterAll
    void afterAll() {
        System.out.println("###   afterAll()");
        result = 0;
    }

    @Test
    void firstTest() {
        int result = getResult();
        System.out.println("###   firstTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}