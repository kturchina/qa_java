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
    }

    @Test
    public void testAddFriends() throws Exception {
        var alex = new Alex();
        var newFriend = "Гоша the parrot";
        alex.addFriend(newFriend);

        assertArrayEquals( new ArrayList<>() {{
            addAll(DEFAULT_FRIENDS);
            add(newFriend);
        }}.toArray(), alex.getFriends().toArray());
    }

    @Test
    public void testRemoveFriend() throws Exception {
        var alex = new Alex();
        alex.removeFriend(DEFAULT_FRIENDS.get(0));

        assertArrayEquals(new ArrayList<>(DEFAULT_FRIENDS) {{ remove(0); }}.toArray(), alex.getFriends().toArray());
    }

    @Test
    public void testPlaceOfLiving() throws Exception {
        var alex = new Alex();
        assertEquals(DEFAULT_PLACE_OF_LIVING, alex.getPlaceOfLiving());
    }

    @Test
    public void testSetPlaceOfLiving() throws Exception {
        var newPlaceOfLiving = "Магадан";

        var alex = new Alex();
        alex.setPlaceOfLiving(newPlaceOfLiving);

        assertEquals(newPlaceOfLiving, alex.getPlaceOfLiving());
    }


    @Test
    public void testKittens() throws Exception {
        assertEquals(0, new Alex().getKittens());
    }
}
