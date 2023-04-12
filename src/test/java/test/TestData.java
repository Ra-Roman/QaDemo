package test;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();
    String firstname = faker.name().firstName(),
            lastname = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.options().option("Male", "Female", "Other"),
            number = faker.number().digits(10),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            year = String.valueOf(faker.number().numberBetween(1980,2010)),
            subject = faker.options().option("Maths", "Accounting", "Arts", "Social Studies", "English", "Chemistry",
                    "Computer Science", "Commerce", "Economics", "Social Studies", "Biology", "History"),
            hobbie = faker.options().option("Music", "Sports", "Reading"),
            imgName = "1.png",
            imgResource = "img/1.png",
            address = faker.address().fullAddress(),
            state = "Haryana",
            city = "Karnal";
}
