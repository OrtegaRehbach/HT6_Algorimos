import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class MapFactory {
    
    public Map<String, LinkedList<String>> createNew(String mapType) {
        switch (mapType) {
            case "HashMap":
                return new HashMap<String, LinkedList<String>>();
            case "TreeMap":
                return new TreeMap<String, LinkedList<String>>();
            case "LinkedHashMap":
                return new LinkedHashMap<String, LinkedList<String>>();
            default:
                return null;
        }
    }
}