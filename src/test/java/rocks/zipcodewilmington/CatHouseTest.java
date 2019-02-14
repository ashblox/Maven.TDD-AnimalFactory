package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        // Given (a cat house exists as does a cat)
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null, 20);

        // When (a cat is added to the house)
        cathouse.add(cat);

        // When (the cat is retrieved from the house)
        Cat retrievedCat = cathouse.getCatById(20);

        // Then (the retrieved cat should be the same cat as the one added)
        Assert.assertEquals(cat, retrievedCat);
    }

    @Test
    public void removeCatTest() {
        // Given (a cat exists which is added to the cat house)
        Cat cat = new Cat(null, null, 17);
        CatHouse cathouse = new CatHouse();
        cathouse.add(cat);

        // When (that cat is removed from the cathouse)
        cathouse.remove(cat);

        // Then (the cat can no longer be retrieved from the cathouse)
        Cat nocat = cathouse.getCatById(17);
        Assert.assertNull(nocat);
    }

    @Test
    public void removeByIdTest() {
        // Given (a cat and a cathouse both exist)
        Cat cat = new Cat (null, null, 14);
        CatHouse cathouse = new CatHouse();
        cathouse.add(cat);

        // When (a cat is removed from the house & the remove by ID function is called)
        cathouse.remove(14);
        Cat actualCat = cathouse.getCatById(14);

        // Then
        Assert.assertNull(actualCat);
    }

    @Test
    public void getCatByIdTest() {
        // Given (a cat is added to the cathouse)
        Cat cat = new Cat (null, null, 14);
        CatHouse cathouse = new CatHouse();
        cathouse.add(cat);

        // When (the cat is removed by its ID number & you check that ID)
        Cat catRetrievedByID = cathouse.getCatById(14);
        int retrievedId = catRetrievedByID.getId();

        // Then (the retrieved ID should match the ID number fed into get cat by ID method)
        Assert.assertEquals(14, retrievedId);
    }

    @Test
    public void getNumberOfCatsTest() {
        // Given a cathouse is created and 3 instances of Cat are added to the cathouse
        CatHouse cathouse = new CatHouse();
        Cat cat1 = new Cat(null, null, null);
        Cat cat2 = new Cat(null, null, null);
        Cat cat3 = new Cat(null, null, null);
        cathouse.add(cat1);
        cathouse.add(cat2);
        cathouse.add(cat3);

        // When the get number of cats method is called
        int numberOfCats = cathouse.getNumberOfCats();

        // Then the number of cats returned should equal 3
        Assert.assertEquals(3, numberOfCats);
    }


}
