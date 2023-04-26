import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("First", "Lalalala");
        trackList.put("Second", "Lelelele");
        trackList.put("Third", "Lililili");
        trackList.put("Fourth", "Lolololo");

        System.out.println(trackList.get("First"));
        Set<String> keys = trackList.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }

    }
}
