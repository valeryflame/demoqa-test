package lesson3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }
    @Test
    void fillFormTest() {

        open("/text-box");
        $("#userName").setValue("Name");
        $("#userEmail").setValue("email@test.com");
        $("#currentAddress").setValue("Street 1");
        $("#permanentAddress").setValue("Street 2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Name"));
        $("#output #email").shouldHave(text("email@test.com"));
        $("#output #currentAddress").shouldHave(text("Street 1"));
        $("#output #permanentAddress").shouldHave(text("Street 2"));
    }


}
