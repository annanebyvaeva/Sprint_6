import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalFoodTest {

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", "Трава, Различные растения"},
                {"Хищник", "Животные, Птицы, Рыба"},
                {"", "Неизвестный вид животного, используйте значение Травоядное или Хищник"}
        };
    }

    public String animalKind;
    public String expected;

    public AnimalFoodTest(String animalKind, String expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }


    @Test
    public void animalFoodTest() {

        try {
            Animal animal = new Animal();
            List animalFood = animal.getFood(animalKind);
            String actual = String.join(", ", animalFood);
            assertEquals(expected, actual);
        } catch (Exception exception) {
            Assert.assertEquals(expected, exception.getMessage());
        }
    }

}

