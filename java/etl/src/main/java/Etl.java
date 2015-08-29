import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old){
        Map <String, Integer> neW = new HashMap<>();
            for(Map.Entry<Integer, List<String>> entry : old.entrySet()){
                Iterator<String> myIterator = entry.getValue().iterator();
                for(String str : entry.getValue()){
                    neW.put(str.toLowerCase(), entry.getKey());
                }
            }
        return neW;
    }
}
