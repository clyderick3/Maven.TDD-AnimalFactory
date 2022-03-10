package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        String expectedName = "Max";
        Date date = new Date(2020, 12, 12);
        //When
        Dog createDog = new Dog(expectedName, date, 1);

        //Then
        Assert.assertEquals(expectedName, createDog.getName());
        Assert.assertEquals(date, createDog.getBirthDate());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        //Given
        String expectedName = "Garfield";
        Date date = new Date(2026, 2, 5);
        //When
        Cat cat1 = new Cat(expectedName, date, 1);

        //Then
        Assert.assertEquals(expectedName, cat1.getName());
        Assert.assertEquals(date, cat1.getBirthDate());
    }

}

