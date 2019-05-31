package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Arrange
        Dog dog = new Dog(null, null, null);

        // Act
        String dogName = "Dave";
        dog.setName(dogName);

        // Assert
        Assert.assertEquals(dog.getName(), "Dave");
    }

    @Test
    public void setBirthDateTest() {
        // Arrange
        Dog dog = new Dog("Dave", null, null);

        // Act
        Date birthDate = new Date (2017, 03, 07);
        dog.setBirthDate(birthDate);

        // Assert
        Assert.assertEquals(birthDate, dog.getBirthDate());
    }

    @Test
    public void getIdTest() {
        // Arrange
        Dog dog = new Dog("Dave", null, 88);

        //Act
        Integer dogId = dog.getId();

        // Assert
        Integer expected = 88;
        Assert.assertEquals(dogId, expected);
    }

    @Test
    public void speakTest() {
        // Arrange
        Dog dog = new Dog("Dave", null, 88);

        //Act
        String dogSpeak = dog.speak();

        // Assert
        String expected = "bark!";
        Assert.assertEquals(dogSpeak, expected);
    }

    @Test
    public void eatFood() {
        // Arrange
        Dog dog = new Dog("Dave", null, 88);

        //Act
        Food dogFood = new Food();
        dog.eat(dogFood);

        // Assert
        Integer expected = 1;
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }


}
