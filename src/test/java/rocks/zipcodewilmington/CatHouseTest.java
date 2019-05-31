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

    @Test
    public void addTest() {
        // Arrange
        Cat cat = new Cat(null, null, null);

        // Act
        CatHouse.clear();
        CatHouse.add(cat);

        // Assert
        Integer expected = 1;
        Assert.assertEquals(CatHouse.getNumberOfCats(), expected);
    }

    @Test
    public void removeCatTest() {
        CatHouse.clear();
        // Arrange
        Cat cat = new Cat(null, null, null);

        // Act
        CatHouse.add(cat);

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
        CatHouse.clear();

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

    @Test
    public void GetNumberOfCatsTest() {
        // Arrange
        Cat cat = new Cat(null, null, null);

        // Act
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);

        // Then
        Integer expected = 3;
        Assert.assertEquals(CatHouse.getNumberOfCats(), expected);
    }

}
