
package JSON;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class JSON_Decode {
    public static void main(String[] args) {
       String jsonObject="{\"name\":\"Nikhil\",\"email\":\"nikhil@gmail.com\",\"age\":\"20\"}";
      Object obj=JSONValue.parse(jsonObject);
      JSONObject jsonObj=(JSONObject)obj;
      
      String name=(String)jsonObj.get("name");
      String email=(String)jsonObj.get("email");
      String age=(String)jsonObj.get("age");
      System.out.println(name+"\n "+email+"\n "+age);
       
    }
    
}
