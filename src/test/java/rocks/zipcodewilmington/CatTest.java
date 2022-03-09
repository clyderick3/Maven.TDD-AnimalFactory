package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test //@Test is how you annotate a test.
    public void CatTestsetName() {
        //Given
        Cat testCat = new Cat("Joe", new Date(), 1); //testCat is the object.
        String expected = "Kitty"; //Started his name as Joe and set it to Kitty.

        //When
        testCat.setName(expected);
        //Then
        String actual = testCat.getName(); //getName exists purely to return a value.
        Assert.assertEquals(expected, actual); //Expected is what it supposed to be. Actual is what it's coming back as.
    }
    // TODO - Create tests for `speak`
    @Test
    public void SpeakTest() {
        Cat testCat = new Cat("Mark", new Date(), 2);
        String expected = "meow!"; //Never capture the actual if you haven't captured the expected.

        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void BirthDateTest() {
        Cat testCat = new Cat ("Tye",new Date(),3);
        Date expected = new Date();
        Date actual = testCat.getBirthDate();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest() {
        //Given information.
        Cat testCat = new Cat("Tye", new Date(), 3);
        Integer expectedNumberofMeals = 1;
        Food food = new Food();
        //When
        testCat.eat(food);
        //Then
        Integer actual = testCat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumberofMeals, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Cat testCat = new Cat("Muffins", new Date(), 3);
        Integer expected = 3;
        Integer actual = testCat.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
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

}
