package com.example.madagascar;

import com.example.Feline;
import com.example.Lion;
import java.util.ArrayList;
import java.util.List;

public class Alex extends Lion {

    public final static String DEFAULT_PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
    public final static List<String> DEFAULT_FRIENDS = List.of("Марти", "Глория", "Мелман");

    private final List<String> friends = new ArrayList<>() {{
        addAll(DEFAULT_FRIENDS);
    }};
    private String placeOfLiving = DEFAULT_PLACE_OF_LIVING;

    public Alex() throws Exception {
        super("Самец", new Feline());
    }

    public List<String> getFriends() {
        return friends;
    }
    public void addFriend(String friend) { friends.add(friend); }
    public void removeFriend(String friend) { friends.remove(friend); }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
