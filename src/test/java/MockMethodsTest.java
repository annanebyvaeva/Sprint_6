import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class MockMethodsTest {

    @Spy
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();

    }


    @Test
    public void FelineFoodTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }

    @Test
    public void FelineGetKittensTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void FelineGetFamilyTest() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();

    }
    @Test
    public void LionFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }

    @Test
    public void LionCountTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }
    @Test
    public void getKittensFemaleTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, actual);
}

}
