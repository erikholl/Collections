package be.intecbrussel;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Box> boxMap = new TreeMap<>(); // unsorted map. Use Map?
        // not possible, Map is an abstract class and can not be instantiated.
        // using a LinkedHashMap would result in sorting the objects in the map
        // using a TreeMap

        Box box1 = new Box(100, 200, 300);
        Box box2 = new Box(200, 300, 400);
        Box box3 = new Box(300, 400, 500);

        boxMap.put("Cutlery Box", box1);
        boxMap.put("Stuffed Animal Box", box1);
        boxMap.put("Potato Box", box1);

        Set<Map.Entry<String, Box>> entrySet = boxMap.entrySet();
        Optional<Map.Entry<String, Box>> result = entrySet.stream()
                .filter(entry -> entry.getKey().endsWith("Box"))
                        .filter(entry -> entry.getValue().getWidth() > 150)
//                                .map(entry -> entry.getValue()) // we would
//                                use this to map the stream to a box
                                        .findFirst();

        if (result.isPresent()) {
            Map.Entry<String, Box> resultObject = result.get();
            Box resultBox = resultObject.getValue(); // getValue is a Box,
            // with its measures..
        }

        boxMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
