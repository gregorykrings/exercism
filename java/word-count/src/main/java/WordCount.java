import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> Phrase(String s)
    {
        System.out.println("s: "+s);
        String[] sArray = s.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for(String sIt : sArray){
            if(!sIt.matches("[a-zA-Z0-9]")) {
                String[] minArr = sIt.split("[^a-zA-Z0-9]");
                for(String mIt : minArr) {
                    System.out.println("mIt: "+ mIt);
                    if (!mIt.matches("[a-zA-Z']")) {
                        sIt = mIt;
                    }
                }
            }
            if(myMap.containsKey(sIt)){
                int uVal = myMap.get(sIt.toLowerCase()+1);
                System.out.println("uVal: "+uVal);
                myMap.put(sIt.toLowerCase(), uVal);
            } else {
                myMap.put(sIt.toLowerCase(), 1) ;
            }
            System.out.println("sIt: "+sIt);
        }
        System.out.println("myMap: "+myMap.toString());
        return myMap;
    }
}
