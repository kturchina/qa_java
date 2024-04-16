import com.example.Cat;
import com.example.Feline;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestCat {

    @Test
    public void testSound() {
        var cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testFood() throws Exception {
        var cat = new Cat(new Feline());
        assertArrayEquals(List.of("Животные", "Птицы", "Рыба").toArray(), cat.getFood().toArray());
    }
}
