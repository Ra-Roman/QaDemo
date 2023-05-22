package test;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static io.qameta.allure.Allure.step;

@Tag("simple")
public class DemoQAPracticeFormWithPageObjects extends TestBase{

    TestData data = new TestData();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void practiceForm () {
        step("Открытие страницы и ввод данных", () -> {
        registrationPage.openPage()
                .setFirstName(data.firstname)
                .setLastName(data.lastname)
                .setEmail(data.email)
                .setGender(data.gender)
                .setNumber(data.number)
                .setBirthDay(data.day, data.month, data.year)
                .setSubject(data.subject)
                .setHobbie(data.hobby)
                .setImg(data.imgResource)
                .setCurrentAddress(data.address)
                .setStateCity(data.state, data.city)
                .setClickSubmit();
        });

        step("Проверка введенных данных", () -> {
        registrationPage.setModalka()
                .setResultModalka("Student Name", data.firstname + " " + data.lastname)
                .setResultModalka("Student Email", data.email)
                .setResultModalka("Gender", data.gender)
                .setResultModalka("Mobile", data.number)
                .setResultModalka("Date of Birth", data.day + " " + data.month + "," + data.year)
                .setResultModalka("Subjects", data.subject)
                .setResultModalka("Hobbies", data.hobby)
                .setResultModalka("Picture", data.imgName)
                .setResultModalka("Address", data.address)
                .setResultModalka("State and City", data.state + " " + data.city);
        });

    }
}
