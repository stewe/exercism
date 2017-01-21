import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<String, Integer>();
//        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
//			int score = entry.getKey();
//        	for (String letter : entry.getValue()) {
//				newMap.put(letter.toLowerCase(), score);
//			}
//		}
        
        // Doing the same with Lambdas:
        old.forEach((score, list) -> {
        	list.forEach(letter -> {
        		newMap.put(letter.toLowerCase(), score);
        	});
        });
    	return newMap;
    }
}
