
package JSON;

import org.json.simple.JSONObject;
import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONValue;


public class Encode_Using_Map {
    public static void main(String[] args) {
        Map obj=new HashMap();
        obj.put("Name", "Nikhil");
        obj.put("age", 20);
        obj.put("Salary", 120000);
        String jsonText=JSONValue.toJSONString(obj);
        System.out.println(jsonText);
                
    }
    
}
