
import org.fest.assertions.internal.Maps;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import static org.fest.assertions.api.Assertions.entry;

public class DNA {
    private int a=0, t=0, g=0, c=0;
    private Map<Character,Integer> nucleotide = new HashMap<>();
    public DNA(String s) {
        setCnt(s);
    }
    public void setCnt(String s){
        for(char o : s.toCharArray()){
            switch(o){
                case 'A':
                    ++a;
                    break;
                case 'T':
                    ++t;
                    break;
                case 'G':
                    ++g;
                    break;
                case 'C':
                    ++c;
                    break;
            }
        }
        nucleotide.put('A',a);
        nucleotide.put('T', t);
        nucleotide.put('G',g);
        nucleotide.put('C', c);
    }

    public int count(char o) {
        if(nucleotide.containsKey(o)) {
            return nucleotide.get(o);
        }
        throw new IllegalArgumentException();
    }

    public Map<Character,Integer> nucleotideCounts() {
        return nucleotide;
    }
}
      