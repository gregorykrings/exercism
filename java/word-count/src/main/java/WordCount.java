import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> Phrase(String s)
    {
        s = s.split("[^a-zA-Z0-9']+")[0];
        String[] sArray = s.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for(String sIt : sArray){
            if(myMap.containsKey(sIt)){
                int uVal = myMap.get(sIt.toLowerCase()).intValue()+1;
                System.out.println("uVal: "+myMap.get(sIt.toLowerCase()).intValue());
                myMap.put(sIt.toLowerCase(), uVal);
            }else{
                myMap.put(sIt.toLowerCase(),1);
            }
        }
        return myMap;
    }
}
