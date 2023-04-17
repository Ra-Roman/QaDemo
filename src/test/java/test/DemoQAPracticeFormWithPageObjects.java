package test;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class DemoQAPracticeFormWithPageObjects extends TestBase{

    TestData data = new TestData();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void practiceForm () {

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
                .setClickSubmit()
                .setModalka()
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

    }
}
