import com.example.Feline;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestFeline {

    @Test
    public void testFamily() {
        var feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFood() throws Exception {
        var feline = new Feline();
        assertArrayEquals(List.of("Животные", "Птицы", "Рыба").toArray(), feline.eatMeat().toArray());
    }
}
