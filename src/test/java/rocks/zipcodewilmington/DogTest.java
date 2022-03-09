package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void DoggyTest() {
        Dog doggy = new Dog("Max",new Date(), 1);
        String expected = "Max";
        String actual = doggy.getName();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Dog doggy = new Dog("Mark", new Date(), 2);
        String expected = "bark!"; //Never capture the actual if you haven't captured the expected.

        String actual = doggy.speak();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void BirthDateTest() {
        Dog doggy = new Dog("Max",new Date(), 1 );
        Date expected = new Date();
        Date actual = doggy.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest(){
        Dog doggy = new Dog("Max", new Date(), 1);
        Integer expected = 1;
        Integer actual = doggy.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
