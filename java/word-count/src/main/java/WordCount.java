import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> Phrase(String s)
    {
        String[] mArray = s.split("[^a-zA-Z0-9']+");
        Map<String, Integer> myMap = new HashMap<>();
        for(String sIt : mArray){
            String []val;
            String toCheck = " ";
            if(sIt.contains(" ")){
                val = sIt.split(" ");
                for(String myS : val) {
                    if (myS != toCheck) {
                        toCheck = val[1];
                    }
                }
            }else{
                toCheck = sIt;
            }
            if(myMap.containsKey(toCheck.toLowerCase())){
                int uVal = myMap.get(sIt.toLowerCase()).intValue()+1;
                myMap.put(toCheck.toLowerCase(), uVal);
            }else{
                myMap.put(toCheck.toLowerCase(),1);
            }
        }
        return myMap;
    }
}
