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

public class TestLion {

    @Test
    public void testFood() throws Exception {
        var lion = new Lion("Самец", new Feline());
        assertArrayEquals(List.of("Животные", "Птицы", "Рыба").toArray(), lion.getFood().toArray());
    }

    @Test
    public void testKittens() throws Exception {
        var lion = new Lion("Самка", new Feline());
        assertEquals(1, lion.getKittens());
    }
}
