package rocks.zipcodewilmington;


import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given (dog data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();

        // When (a dog is constructed)
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();

        // Then (the given data should match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void createCatTest() {
        // Given (dog data)
        String givenName = "Lamb";
        Date givenBirthDate = new Date();

        // When (a dog is constructed)
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedDate = cat.getBirthDate();

        // Then (the given data should match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

}
