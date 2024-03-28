import com.example.Feline;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestFelineKittens {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, 1},
                {0, 0},
                {2, 2}
        });
    }

    Integer param;
    int expected;

    public TestFelineKittens(Integer param, int expected) {
        this.param = param;
        this.expected = expected;
    }

    @Test
    public void testKittens() {
        var feline = new Feline();
        assertEquals(expected, param == null ? feline.getKittens() : feline.getKittens(param));
    }
}
