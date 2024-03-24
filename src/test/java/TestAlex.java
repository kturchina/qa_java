import com.example.madagascar.Alex;
import java.util.ArrayList;
import org.junit.Test;

import static com.example.madagascar.Alex.DEFAULT_FRIENDS;
import static com.example.madagascar.Alex.DEFAULT_PLACE_OF_LIVING;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestAlex {
    @Test
    public void testFriends() throws Exception {
        var alex = new Alex();
        assertArrayEquals(DEFAULT_FRIENDS.toArray(), alex.getFriends().toArray());

        var newFriend = "Гоша the parrot";
        alex.addFriend(newFriend);
        assertArrayEquals( new ArrayList<>() {{
            addAll(DEFAULT_FRIENDS);
            add(newFriend);
        }}.toArray(), alex.getFriends().toArray());

        alex.removeFriend(newFriend);
        assertArrayEquals(DEFAULT_FRIENDS.toArray(), alex.getFriends().toArray());
    }

    @Test
    public void testPlaceOfLiving() throws Exception {
        var alex = new Alex();
        assertEquals(DEFAULT_PLACE_OF_LIVING, alex.getPlaceOfLiving());
        var newPlaceOfLiving = "";
        alex.setPlaceOfLiving(newPlaceOfLiving);
        assertEquals(newPlaceOfLiving, alex.getPlaceOfLiving());
    }

    @Test
    public void testKittens() throws Exception {
        assertEquals(0, new Alex().getKittens());
    }
}
