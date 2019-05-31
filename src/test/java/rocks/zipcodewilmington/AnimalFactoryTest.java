package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void createDogTest() {

        // Given (dog data)
        String givenName = "Dave";
        Date givenBirthDate = new Date(2017, 03, 05);

        // Act
        AnimalFactory animal = new AnimalFactory();
        Dog dog = animal.createDog(givenName, givenBirthDate);

        // Assert
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }


    @Test
    public void createCatTest() {

        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 11, 20);

        // Act
        AnimalFactory animal = new AnimalFactory();
        Cat cat = animal.createCat(givenName, givenBirthDate);

        // Assert
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }


}
