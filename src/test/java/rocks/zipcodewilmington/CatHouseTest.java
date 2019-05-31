package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {


    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (cat data)
        String givenName = "Pookie";
        Date givenBirthDate = new Date(2019, 11, 20);

        AnimalFactory animal = new AnimalFactory();
        Cat cat = animal.createCat(givenName, givenBirthDate);
        CatHouse.clear();

        // Act
        CatHouse.add(cat);
        CatHouse.add(cat);

        // Then
        Integer expected = 2;
        Assert.assertEquals(CatHouse.getNumberOfCats(), expected);
    }

    @Test
    public void removeCatTest() {
        //Given (cat data)
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Act
        CatHouse.remove(cat);

        // Then
        Integer expected = 0;
        Assert.assertEquals(CatHouse.getNumberOfCats(), expected);

    }

    @Test
    public void removeIdTest() {
        //Given (cat data)
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Act
        CatHouse.remove(2);

        // Then
        Integer expected = 0;
        Assert.assertEquals(CatHouse.getNumberOfCats(), expected);

    }

    @Test
    public void getCatByIdTest() {
        //Given (cat data)
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Act
        CatHouse.add(cat);
        Cat testCat = CatHouse.getCatById(2);

        // Assert
        Assert.assertEquals(testCat, cat);

    }

}
