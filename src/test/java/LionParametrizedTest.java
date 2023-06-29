import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Используйте допустимые значения пола животного - самец или самка", true}
        };
    }

    public String sex;
    public boolean expected;

    public LionParametrizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Test
    public void sexHasManeTest() {

        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(expected, lion.doesHaveMane());
        } catch (Exception exception) {
            Assert.assertEquals(sex, exception.getMessage());
        }
    }
}
