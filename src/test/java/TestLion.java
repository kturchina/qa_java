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
public class TestLion {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true, List.of("Животные", "Птицы", "Рыба"), 1},
                {"Самка", false, List.of("Животные", "Птицы", "Рыба"), 1},
                {"M", null, null, null},
                {"Ж", null, null, null}
        });
    }

    private final String sex;
    private final Boolean mane;
    private final List<String> foods;
    private final Integer kittens;

    public TestLion(String sex, Boolean mane, List<String> foods, Integer kittens) {
        this.sex = sex;
        this.mane = mane;
        this.foods = foods;
        this.kittens = kittens;
    }

    @Test
    public void testMane() throws Exception {
        if (mane != null) {
            assertEquals(mane, new Lion(sex).doesHaveMane());
        }
        else {
            var thrown = assertThrows(Exception.class, () -> new Lion(sex));
            assertTrue(thrown.getMessage().contains("Используйте допустимые значения пола животного - самей или самка"));
        }
    }

    @Test
    public void testFood() throws Exception {
        if (foods == null) return;
        var lion = new Lion(sex);
        assertArrayEquals(foods.toArray(), lion.getFood().toArray());
    }

    @Test
    public void testKittens() throws Exception {
        if (kittens == null) return;
        var lion = new Lion(sex);
        assertEquals(kittens.intValue(), lion.getKittens());
    }
}
