import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
//        int a = (int)( Math.round(Math.random()*10000000));
        employeeMap.put(312133, "Олег");
        employeeMap.put(211123, "Jayde" );
        employeeMap.put(812133, "Kailum" );
        employeeMap.put(612133, "Carwyn"  );
        employeeMap.put(812163, "Tanya"  );
        employeeMap.put(232133, "Dimitri"  );
        employeeMap.put(152133, "Susan"  );
        employeeMap.put(232187, "Vivien"  );
        employeeMap.put(212141, "Zunairah"  );
        employeeMap.put(213123, "Primrose"   );
        employeeMap.put(872133, "Alyx"   );

        for (Integer key: employeeMap.keySet()) {
            System.out.println("Key: " + key +" for " + employeeMap.get(key) );

        }
        System.out.println("Input id");

        int ID = Integer.parseInt(br.readLine());
        if(employeeMap.containsKey(ID)){
            System.out.println(employeeMap.get(ID));
        }else {
            System.out.println("No Such Person!");
        }

        System.out.println("Input Name");

        String name =  (br.readLine());
        for (Integer key: employeeMap.keySet()){


        if(employeeMap.containsValue(name)) {



                if ( employeeMap.get(key).equals(name)) {

                    System.out.println( "Key for " + employeeMap.get(key) + " is  " + key );


                }
                }else {
            System.out.println("No Such Person!");

            }
        }

//        HashMap<String, String> personMap = new HashMap<String, String>();
//        personMap.put("Jayde" ,"Barnard" );
//        personMap.put("Kailum", "Sinclair ");
//        personMap.put("Carwyn", "Singleton" );
//        personMap.put("Tanya","Ratcliffe" );
//        personMap.put("Dimitri", "Ahmed" );
//        personMap.put("Susan", "Battle" );
//        personMap.put("Vivien" ,"Holmes" );
//        personMap.put("Zunairah" ,"Moon" );
//        personMap.put("Primrose" ,"Hume" );
//        personMap.put("Alyx" ,"Riddle" );
//        personMap.remove();
    }
}
