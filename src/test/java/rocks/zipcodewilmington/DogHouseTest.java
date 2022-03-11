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
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        DogHouse.clear();
        //Given
        Dog dog = new Dog("Spike",new Date(), 6);
        Integer expected = 1;
        //When
        DogHouse.add(dog);
        //Then
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIDTest() {
        DogHouse.clear();

        Dog dog = new Dog("Spike",new Date(), 6);
        Integer expected = 0;
        //When you addDog the cat, you are deleting the cat by the ID.
        DogHouse.add(dog);
        DogHouse.remove(6);
        //Then
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
        @Test
        public void removeDogTest() {
            DogHouse.clear();

            Dog dog = new Dog("Spike",new Date(), 6);
            Integer expected = 0;
            //When
            DogHouse.add(dog);
            DogHouse.remove(dog);
            //Then
            Integer actual = DogHouse.getNumberOfDogs();
            Assert.assertEquals(expected, actual);
        }
    // TODO - Create tests for `Dog getDogById(Integer id)`
            @Test
            public void getDogByIDTest() {
                DogHouse.clear();

                Dog dog = new Dog("Spike",new Date(), 6);
                //When
                DogHouse.add(dog);
                //Then
                Dog actual = DogHouse.getDogById(6);
                Assert.assertEquals(dog, actual);
            }
    // TODO - Create tests for `Integer getNumberOfDogs()`
         @Test
         public void testGetNumberOfDogs() {
             DogHouse.clear();

             //Given
             Dog dog = new Dog("Spike",new Date(), 6);
             Integer expected = 2;
             //When
             DogHouse.add(dog);
             DogHouse.add(dog);
             //Then
             Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
             //System.out.println(DogHouse.getNumberOfDogs());
    }
}
