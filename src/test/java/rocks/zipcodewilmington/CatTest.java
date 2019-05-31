package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 02,01);
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String getNameResult = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, getNameResult);
    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 02,01);
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String catSpeak = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(catSpeak, "meow!");
    }

    @Test
    public void getBirthDateTest() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 02,01);
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        givenBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
    }

    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 02,01);
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Date changeBirthDate = new Date(2019, 02, 15);
        cat.setBirthDate(changeBirthDate);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(changeBirthDate, cat.getBirthDate());
    }

    @Test
    public void eatFoodTest() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 02,01);
        Integer givenId = 3;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Food catFood = new Food();
        cat.eat(catFood);

        // Then (we expect the given data, to match the retrieved data)
        Integer expected = 1;
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }


}
