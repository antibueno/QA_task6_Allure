import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTests {

    @Test
    public void lambdaLabelsTests() {
        Allure.feature("Issues");
        Allure.story("Создание Issue для авторизованного пользователя");
        Allure.label("severity", SeverityLevel.BLOCKER.value());
        Allure.label("owner", "antibueno");
        Allure.link("Github", "https://github.com");
    }

    @Test
    @Feature("Issues")
    @Stories({
            @Story("Создание Issue со страницы репозитория"),
            @Story("Создание Issue для авторизованного пользователя")
    })
    @DisplayName("Создание Issue для авторизованного пользователя")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("antibueno")
    @Link(value = "Github", url = "https://github.com")
    public void annotatedLabelsTest() {

    }
}
