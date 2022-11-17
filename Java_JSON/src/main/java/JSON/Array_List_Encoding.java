
package JSON;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONValue;


public class Array_List_Encoding {
    public static void main(String[] args) {
        List arr=new ArrayList();
        arr.add("Nikhil");
        arr.add(20);
        arr.add(120000.0);
        String jsonText=JSONValue.toJSONString(arr);
        System.out.println(jsonText);
        
    }
    
}
