package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Test
    public void addTest() {
        // Arrange
        Dog dog = new Dog(null, null, null);

        // Act
        DogHouse.clear();
        DogHouse.add(dog);

        // Assert
        Integer expected = 1;
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expected);
    }

    @Test
    public void removeDogTest() {
        // Arrange
        Dog dog = new Dog(null, null, null);

        // Act
        DogHouse.add(dog);

        // Act
        DogHouse.remove(dog);

        // Then
        Integer expected = 0;
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expected);

    }

    @Test
    public void removeIdTest() {
        //Given (dog data)
        String givenName = "Dave";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Act
        DogHouse.remove(2);

        // Then
        Integer expected = 0;
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expected);

    }

    @Test
    public void getDogByIdTest() {
        DogHouse.clear();

        //Given (dog data)
        String givenName = "Dave";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Act
        DogHouse.add(dog);
        Dog testDog = DogHouse.getDogById(2);

        // Assert
        Assert.assertEquals(testDog, dog);

    }

    @Test
    public void GetNumberOfDogsTest() {
        // Arrange
        Dog dog = new Dog(null, null, null);

        // Act
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);

        // Then
        Integer expected = 3;
        Assert.assertEquals(DogHouse.getNumberOfDogs(), expected);
    }

}
