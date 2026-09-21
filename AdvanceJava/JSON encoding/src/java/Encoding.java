import org.json.simple.JSONObject;

public class Encoding {
    public static void main(String[] args){
        JSONObject obj= new JSONObject();
        System.out.println("Encoding with json....\n");
        obj.put("EMPLOYEE NAME","ABC");
        obj.put("Age",new Integer (30));
        obj.put("Salary",new Double (5000));
        System.out.print(obj);
        
    }
    
}