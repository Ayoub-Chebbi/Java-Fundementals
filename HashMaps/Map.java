import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args){
        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        countryCapitals.put("Tunisia","Tunis");
        countryCapitals.put("Algeria","Alger");
        countryCapitals.put("France","Paris");
        countryCapitals.put("Germany","Berlin");
        countryCapitals.put("Netherlands","Amesterdam");
        Set<String> keys = countryCapitals.keySet();
        for (String key : keys){
            System.out.println(key);
            System.out.println(countryCapitals.get(key)); 
        }

    }
}