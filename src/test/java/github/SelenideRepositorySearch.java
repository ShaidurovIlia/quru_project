package github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositorySearch {

    @BeforeEach
    void beforeEach(){
    }

    @AfterEach
    void afterEach() {
    }

    @Test
    void shouldFindSelenideRepository() {
        open("https://github.com/");
        $(".search-input-container").click();
        $(".QueryBuilder-InputWrapper").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
