import java.util.HashMap;
import java.util.Hashtable;

public class App {
    public static void main(String[] args) throws Exception {
        // create a hashmap
        HashMap<String, Integer> map = new HashMap<>();
        // add elements to the hashmap
        map.put("Kishore", 1000);
        map.put("Kumar", 2000);
        map.put("Kelam", 3000);
        map.put("nullValue", null);
        map.put(null, 4000);
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("\nnow lets see Hashtable\n");

        // create a hashtable
        Hashtable<String, Integer> table = new Hashtable<>();
        // add elements to the hashtable
        table.put("Kishore", 1000);
        table.put("Kumar", 2000);
        table.put("Kelam", 3000);
        table.put("nullValue", null);
        for (String key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }

    }
}
