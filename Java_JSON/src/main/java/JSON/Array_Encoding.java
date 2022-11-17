
package JSON;

import org.json.simple.JSONArray;


public class Array_Encoding {
    public static void main(String[] args) {
        JSONArray arr=new JSONArray();
        arr.add("Nikhil");
        arr.add(20);
        arr.add(120000.0);
        System.out.println(arr);
    }
    
}
