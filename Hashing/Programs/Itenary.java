package HashMap.Programs;

// Find Itenary from tickets

import java.util.*;
public class Itenary {
    public static void main(String[] args) {
        HashMap<String,String> route=new HashMap<>();
        route.put("Chennai", "Bengaluru");
        route.put("Mumbai","Delhi");
        route.put("Goa","Chennai");
        route.put("Delhi","Goa");

        String start=getStart(route);

        while(route.containsKey(start)){
            System.out.println(start);
            start=route.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap=new HashMap<>();

        // for(String key:tick.keySet()){
        //     revMap.put(tick.get(key),key);
        // }

        // for(String key:tick.keySet()){
        //     if(!revMap.containsKey(key)){
        //         return key;
        //     }
        // }
        for(String key:tick.keySet()){
            if(!tick.containsValue(key)){
                return key;
            }
        }
        return null;
    }
}
