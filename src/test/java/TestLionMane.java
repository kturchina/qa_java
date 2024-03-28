import com.example.Feline;
import com.example.Lion;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestLionMane {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"M", null},
                {"Ж", null}
        });
    }

    private final String sex;
    private final Boolean mane;

    public TestLionMane(String sex, Boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Test
    public void testMane() throws Exception {
        if (mane != null) {
            assertEquals(mane, new Lion(sex, new Feline()).doesHaveMane());
        }
        else {
            var thrown = assertThrows(Exception.class, () -> new Lion(sex, new Feline()));
            assertTrue(thrown.getMessage().contains("Используйте допустимые значения пола животного - самей или самка"));
        }
    }
}
