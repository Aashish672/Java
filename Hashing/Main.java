package HashMap;

import java.util.*;

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities=new Entity[100];
    }

    public void put(String key, String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value);
    }

    public String get(String key){
        int hash=Math.abs(key.hashCode()*entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }

}


public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();

        map.put("Mango","King of Fruits");
        map.put("Apple","A sweet red fruit");
        map.put("Litchi","Kunal's fav fruit");

        System.out.println(map);
    }

    public static void hashDemo(){
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Kunal",89);
        map.put("Karana",99);
        map.put("Rahul",94);

        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set=new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);
    }
}
