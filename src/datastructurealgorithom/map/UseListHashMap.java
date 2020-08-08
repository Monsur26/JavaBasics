package datastructurealgorithom.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseListHashMap {

    public static void main(String[] args) {

        List<String> stateOfUSA = new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("FL");
        stateOfUSA.add("NC");
        stateOfUSA.add("VA");


        List<String> stateOfCANADA = new ArrayList<>();
        stateOfCANADA.add("TORONTO");
        stateOfCANADA.add("ALBERTA");
        stateOfCANADA.add("MONTREAL");
        stateOfCANADA.add("VANCOUVER");
        stateOfCANADA.add("ONTARIO");



        List<String> stateOfBANGLADESH = new ArrayList<>();
        stateOfBANGLADESH.add("DHAKA");
        stateOfBANGLADESH.add("BARISHAL");
        stateOfBANGLADESH.add("NOAKHALI");
        stateOfBANGLADESH.add("MYMENSINGH");
        stateOfBANGLADESH.add("RAJSHAHI");


        // Map<K,V> name=new HashMap<>()


        Map<String,List<String> > map=new HashMap<>();

        map.put("USA",stateOfUSA);
        map.put("CANADA",stateOfCANADA);
        map.put("BANGLADESH",stateOfBANGLADESH);

        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        


    }


}
