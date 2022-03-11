package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
public void addTest() {
        //Given
        Cat cat = new Cat("Jerome",new Date(), 5);
        Integer expected = 1;
        //When
        CatHouse.add(cat);
        //Then
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByCatTest() {
        //Given
        Cat cat = new Cat("Jerome",new Date(), 5);
        Integer expected = 0;
        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        //Then
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByIDTest() {
        Cat cat = new Cat("Jerome",new Date(), 5);
        Integer expected = 0;
        //When you add the cat, you are deleting the cat by the ID.
        CatHouse.add(cat);
        CatHouse.remove(5);
        //Then
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIDTest() {
        Cat cat = new Cat("Jerome",new Date(), 5);
        //When
        CatHouse.add(cat);
        //Then
        Cat actual = CatHouse.getCatById(5);
        Assert.assertEquals(cat, actual);

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        //Given
        Cat cat = new Cat("Jerome",new Date(), 5);
        Integer expected = 2;
        //When
        CatHouse.add(cat);
        CatHouse.add(cat);
        //Then
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
        //System.out.println(CatHouse.getNumberOfCats());

    }
}
