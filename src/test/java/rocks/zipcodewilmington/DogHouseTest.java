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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogsTest() {
        // Given a doghouse is created and 3 instances of Dog are added to the doghouse
        DogHouse doghouse = new DogHouse();
        Dog dog1 = new Dog(null, null, null);
        Dog dog2 = new Dog(null, null, null);
        Dog dog3 = new Dog(null, null, null);
        doghouse.add(dog1);
        doghouse.add(dog2);
        doghouse.add(dog3);

        // When the get number of dogs method is called
        int numberOfDogs = doghouse.getNumberOfDogs();

        // Then the number of dogs returned should equal 3
        Assert.assertEquals(3, numberOfDogs);
    }

    @Test
    public void addDogTest() {
        // Given a doghouse exists and an instance of dog exists
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null, null, null);
        int initialNumberOfDogs = doghouse.getNumberOfDogs();

        // When the dog instance is added to the doghouse
        doghouse.add(dog);
        int finalNumberOfDogs = doghouse.getNumberOfDogs();

        // Then the final number of dogs should be the initial plus one
        Assert.assertEquals(initialNumberOfDogs + 1, finalNumberOfDogs);
    }

    @Test
    public void removeDogByIdTest() {
        // Given a doghouse and a dog exists and the dog is added to the doghouse
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null, null, 13);
        doghouse.add(dog);

        // When the dog is removed by it's ID and you try to get that respective dog by its Id
        doghouse.remove(13);
        Dog retrievedDog = doghouse.getDogById(13);

        // The retrieved dog is going to be null, because it is no longer there
        Assert.assertNull(retrievedDog);
    }

    @Test
    public void removeDogTest() {
        // Given a dog and a doghouse exist, the doghouse is cleared, and the dog is added to the house
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null, null, 12);
        doghouse.clear();
        doghouse.add(dog);

        // When the dog is removed from the house
        doghouse.remove(dog);
        Dog retreivedDog = doghouse.getDogById(12);

        // The dog retrieved by ID will be null
        Assert.assertNull(retreivedDog);
    }

    @Test
    public void getDogByIdTest() {
        // Given a doghouse and a dog exist & the dog is added to the doghouse
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null, null, 10);
        doghouse.add(dog);

        // When the dog is retrieved from the doghouse and it's ID returned
        Dog dogFromDogHouse = doghouse.getDogById(10);
        int retrievedDogsId = dogFromDogHouse.getId();

        // Then the ID from the retrieved dog will match the ID of the dog added to the house
        Assert.assertEquals(10, retrievedDogsId);
    }

}
