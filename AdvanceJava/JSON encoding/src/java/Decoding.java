
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class Decoding {
    public static void main(String [] args)
    {
    String s = "{\"EMPLOYEE NAME\":\"ABC\",\"AGE\":30.0,\"SALARY\":50000}";
    Object obj=JSONValue.parse(s);
    JSONObject Obj=(JSONObject) obj;
    String emp_name = (String)Obj.get("EMPLOYEE NAME");
    double age= (Double)Obj.get("AGE");
    long salary = (Long)Obj.get ("SALARY");
    System.out.println(emp_name+"\n"+age+"\n"+salary);
    }
}