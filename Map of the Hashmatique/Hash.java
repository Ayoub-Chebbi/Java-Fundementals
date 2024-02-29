import java.util.HashMap;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> musicMap = new HashMap<>();
        musicMap.put("Bohemian Rhapsody", "Is this the real life?\nIs this just fantasy?");
        musicMap.put("Hotel California", "On a dark desert highway, cool wind in my hair");
        musicMap.put("Wonderwall", "Today is gonna be the day\nThat they're gonna throw it back to you");
        musicMap.put("Stairway to Heaven", "There's a lady who's sure all that glitters is gold");

        Set<String> keys = musicMap.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key);
            System.out.println("Lyrics:\n" + musicMap.get(key) + "\n");
        }
    }
}
