import java.security.spec.ECField;
import java.sql.SQLOutput;
import java.util.*;

public class Calculator {



    public static void calculation(String x, String y, String string){

        try{
            if(string == "+"){
                System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
            }
            else if(string == "-"){
                System.out.println(Integer.parseInt(x) - Integer.parseInt(y));
            }
            else if(string == "/"){
                System.out.println(Integer.parseInt(x) / Integer.parseInt(y));
            }
            else if(string == "*"){
                System.out.println(Integer.parseInt(x) * Integer.parseInt(y));
            }

        }
        catch (Exception e){
            System.out.println(e);

        }

    }


}
