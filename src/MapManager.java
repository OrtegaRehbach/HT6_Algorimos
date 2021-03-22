import java.util.LinkedList;
import java.util.Map;

public class MapManager {
    
    public void addToInventory(Map<String, LinkedList<String>> map, String category, String product) {
        if (map.containsKey(category)) {
            map.get(category).add(product);
        } else {
            return;
        }
    }
    
    public String getFullInvetorySorted(Map<String, LinkedList<String>> map) {
        String fullInventory = "";
        for (String key : map.keySet()) {
            for (String product : map.get(key)) {
                fullInventory += key + " |    " + product + "\n";
            }
        }
        return fullInventory;
    }

    public String getCategory(Map<String, LinkedList<String>> map, String product) {        
        for (String key : map.keySet()) {
            if (map.get(key).contains(product))
                return "El producto: \"" + product  + "\" perteneca a la categoría: " + key;
        }
        return "El producto: \"" + product  + "\" no se encuentra en el inventario";
    }

    public boolean containsCategory(Map<String, LinkedList<String>> map, String category) {
        if (map.containsKey(category)) {
            return true;
        } else {
            System.out.println("El invenvatario no contiene la categoría: \"" + category +"\"");
            return false;  
        }
    }
}
