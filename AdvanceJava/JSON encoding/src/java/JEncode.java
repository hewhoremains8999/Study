/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import org.json.simple.JSONObject;
public class JEncode{
public static void main(String[]args)
{
    JSONObject obj= new JSONObject();
    System.out.println("Encoding with json....\n");
    obj.put("EMPLOYEE NAME","ABC");
    obj.put("AGE",new Integer(30));
    obj.put("SALARY",new Double(50000));
    System.out.print(obj);
}
}
