
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.selector.WithText;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTestWithListener {
    @Test
    public void testGithub() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();

        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issuesd")).click();
        $(withText("#68")).should(Condition.visible);
    }
}

