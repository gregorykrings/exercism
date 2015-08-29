import java.util.ArrayList;
import java.util.List;

public class Anagram {
    private String str;
    private int size;
    public Anagram(String str) {
        this.str=str.toLowerCase();
        this.size=str.length();
    }
    public int countAppearance(String toOperate, String c){
        int result=0;
        for(char ch : toOperate.toCharArray()){
            if(c.contains(Character.toString(ch))){
                ++result;
            }
        }
        return result;
    }
    public List<String> match(List<String> strings) {
        List <String> myResult= new ArrayList<>();
        for(String st : strings){
            String toOperate = st;
            if(toOperate.length()==size){
                String res = "";
                for(char c : toOperate.toCharArray()){
                    if(str.contains(Character.toString(c).toLowerCase()) && countAppearance(res,Character.toString(c).toLowerCase()) < countAppearance(str,Character.toString(c).toLowerCase())){
                        res+=c;
                    }
                }
                if(!res.equalsIgnoreCase(str) && res.length()==size)
                    myResult.add(res);
            }
        }
        return myResult;
    }
}
