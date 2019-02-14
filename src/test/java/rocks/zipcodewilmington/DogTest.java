package rocks.zipcodewilmington;

import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
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

    @Test
    public void setBirthDateTest() {
        // Given (a birthdate exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date birthDate = new Date(2011 - 10 - 01);

        // When (a dog's birthdate is set to a new date)
        Date newDate = new Date();
        dog.setBirthDate(newDate);

        // Then (we expect to get the new birth date from the dog)
        Date dogDate = dog.getBirthDate();
        Assert.assertEquals(newDate, dogDate);
    }

    @Test
    public void speakTest() {
        // Given (a dog exists)
        Dog dog = new Dog(null, null, null);

        // When (the dog is told to speak)
        String returned = dog.speak();

        // Then (the returned string should equal "bark!"
        Assert.assertEquals("bark!", returned);
    }

    @Test
    public void eatsTest() {
        // Given (a dog exists when is associated with a value of the number of meals eaten)
        Dog dog = new Dog(null, null, null);
        int initialMeals = dog.getNumberOfMealsEaten();

        // When (the eat method is called on the dog)
        Food food = new Food();
        dog.eat(food);

        // Then (the number of meals eaten should increase by 1)
        int finalMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(initialMeals + 1, finalMeals);
    }

    @Test
    public void getIdTest() {
        // Given (a dog exists with a specific ID number)
        Dog dog = new Dog(null,null, 23);

        // Then (the ID is called from the object)
        int actualID = dog.getId();

        // When (the ID given in the constructor should equal the ID returned from the get ID method)
        Assert.assertEquals(23, actualID);
    }

    @Test
    public void intanceOfAnimalTest() {
        // Given (a dog exists)
        Dog dog = new Dog (null, null, null);

        // When (the instanceof keyword is used to discern whether dog inherits from animal)
        boolean instanceOfAnimal = dog instanceof Animal;

        // Then (we expect the boolean to return true)
        Assert.assertTrue(instanceOfAnimal);
    }

    @Test
    public void intanceOfMammalTest() {
        // Given (a dog exists)
        Dog dog = new Dog (null, null, null);

        // When (the instanceof keyword is used to discern whether dog inherits from animal)
        boolean instanceOfAnimal = dog instanceof Mammal;

        // Then (we expect the boolean to return true)
        Assert.assertTrue(instanceOfAnimal);
    }
}



