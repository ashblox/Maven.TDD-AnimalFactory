package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
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
    @Test
    public void setNameTest() {
        // Given (a cat is declared and new name given)
        Date thisDate = new Date(1489180817000l);
        Cat cat = new Cat("Abby", thisDate, 12);

        // When (the name is changed)
        cat.setName("Robin");

        // When (we retrieve the cat's name)
        String retrievedName = cat.getName();

        // Then (we expect the given name to match the retrieved name)
        Assert.assertEquals("Robin", retrievedName);
    }

    @Test
    public void setBirthDateTest() {
        // Given (a cat is declared and a birthdate given)
        Date thisDate = new Date(1678092312459l);
        Cat cat = new Cat("Stinky", thisDate, 2);

        // When (the birthdate is changed)
        Date newDate = new Date(1678012354328l);
        cat.setBirthDate(newDate);

        // When (we retrieve the cat's birthdate)
        Date retrievedDate = new Date();
        retrievedDate = cat.getBirthDate();

        // Then (we expect the new date to match the retrieved date)
        Assert.assertEquals(newDate, retrievedDate);
    }

    @Test
    public void speakTest() {
        // Given (a cat is declared)
        Date thisDate = new Date();
        Cat cat = new Cat("Tuna", thisDate, 7);

        // When (the cat is called to speak & the return string is saved in a new variable)
        String shouldSayMeow = cat.speak();

        // Then (we expect the return string to equal "meow!")
        Assert.assertEquals("meow!", shouldSayMeow);
    }

    @Test
    public void eatTest() {
        // Given (a cat is declared & the number of meals returned)
        Date thisDate = new Date();
        Cat cat = new Cat("name", thisDate, 1);
        int initialMeals = cat.getNumberOfMealsEaten();

        // When (eat is invoked on the new cat)
        Food food = new Food();
        cat.eat(food);

        // When (the new number of meals eaten is returned)
        int newMeals = cat.getNumberOfMealsEaten();

        // Then (we expect the new number of meals eaten to be 1 greater than the initial number of meals eaten)
        Assert.assertEquals(initialMeals+1, newMeals);
    }

    @Test
    public void getIdTest() {
        // Given (a cat is declared with a specific ID number)
        Date thisDate = new Date();
        Cat cat = new Cat("name", thisDate, 431);

        // When (the getId function is called and the return int is stored as a new variable)
        int theCatsId = cat.getId();

        // Then (we expect the return value from the getId function to match the ID given in the constructor)
        Assert.assertEquals(431, theCatsId);
    }

    @Test
    public void instanceOfAnimalCheck() {
        // Given (an instance of cat)
        Date thisDate = new Date();
        Cat cat = new Cat("name", thisDate, 431);

        // When (a true or false statement is created, which relies on cat being an instance of animal)
        boolean isAnInstance = cat instanceof Animal;

        // Then (we expect the boolean to return true)
        Assert.assertTrue(isAnInstance);
    }

    @Test
    public void instanceOfMammalCheck() {
        // Given (an instance of cat)
        Date thisDate = new Date();
        Cat cat = new Cat("name", thisDate, 431);

        // When (a true or false statement is created, which relies on cat being an instance of mammal)
        boolean isAnInstance = cat instanceof Mammal;

        // Then (we expect the boolean to return true)
        Assert.assertTrue(isAnInstance);
    }
}

