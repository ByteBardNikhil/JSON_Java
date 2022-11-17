
package JSON;
import org.json.simple.JSONObject;

public class JSON_Data_Encode{
    public static void main(String args[])
    {
        JSONObject obj=new JSONObject();
        obj.put("name","Nikhil");
        obj.put("age", 20);
        obj.put("salary", 120000);
        System.out.println(obj);
        
    }
}
