package test.TestAllure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WebStep {
    @Step("Открываем страницу")
    public void openMainPage() {
        open("https://github.com/selenide/selenide");
    }
    @Step ("Нажимаем на кнопку ISSUE")
    public void clickIssue(){
        $("#issues-tab").click();
    }
    @Step ("Проверяем текст")
    public void shouldText (){
        $(withText("#2253")).should(Condition.exist);
    }
}
