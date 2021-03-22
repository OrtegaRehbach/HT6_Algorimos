import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MapFactory {
    
    public Map<String, String> getInstance(String mapType) {
        switch (mapType) {
            case "HashMap":
                return new HashMap<String, String>();
            case "TreeMap":
                return new TreeMap<String, String>();
            case "LinkedHashMap":
                return new LinkedHashMap<String, String>();
            default:
                return null;
        }
    }
}