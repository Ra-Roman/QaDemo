package test.TestAllure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepTest {
    @Test
    public void testLambdaTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу", () ->{
            open("https://github.com/selenide/selenide");
        });
        step("Нажимаем на кнопку ISSUE", () ->{
            $("#issues-tab").click();
        });
        step("Проверяем текст", ()->{
            $(withText("#2253")).should(Condition.exist);
        });
    }
    @Test
    public void testAnnotated (){
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebStep steps = new WebStep();
        steps.openMainPage();
        steps.clickIssue();
        steps.shouldText();
    }
}
