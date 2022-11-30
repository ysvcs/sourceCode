import java.util.*;
import java.util.Map.Entry;

import javax.sound.sampled.SourceDataLine;

class MyClass {
    public static void main(String[] args) {
        HashMap<String, Integer> players = new HashMap<String, Integer>();
        players.put("Amy", 154);
        players.put("Dave", 42);
        players.put("Rob", 733);
        int max = 0;
        String names = "";
        Iterator<Entry<String, Integer> > it = players.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> new_Map = (Map.Entry<String, Integer>)it.next();
            System.out.println(new_Map.getKey() + " = " + new_Map.getValue());
            if(new_Map.getValue() > max) {
                max = new_Map.getValue();
                names = new_Map.getKey();
            }
        }
        System.out.println(names);
    }
}