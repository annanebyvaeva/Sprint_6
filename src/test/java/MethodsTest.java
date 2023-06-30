import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


public class MethodsTest {
    Feline feline;

    @Test
    public void catMethodsTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        Assert.assertEquals(cat.getSound(), expected);
}

    @Test
    public void animalMethodsTest() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(animal.getFamily(), expected);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        Assert.assertEquals(expected, actual);

    }



 }




