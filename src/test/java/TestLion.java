import com.example.Feline;
import com.example.Lion;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

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

    @Test
    public void testKittenDefault() throws Exception {
        final var expected = 2;
        var feline = Mockito.mock(Feline.class);
        when(feline.getKittens()).thenReturn(expected);
        assertEquals(expected, new Lion("Самец", feline).getKittens());
    }
}
