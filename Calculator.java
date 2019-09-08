import java.security.spec.ECField;
import java.sql.SQLOutput;
import java.util.*;

public class Calculator {



    public static int calculation(String x, String y, String string){
            Integer first = Integer.parseInt(x);
            Integer second = Integer.parseInt(y);
            if(first > 10 || first < 1 && second > 10 || second < 1){
                return -1000;
            }

            if(string.equals("+")){
                return Integer.parseInt(x) + Integer.parseInt(y);
            }
            else if(string.equals("-")){
                return Integer.parseInt(x) - Integer.parseInt(y);
            }
            else if(string.equals("/")){
                return Integer.parseInt(x) / Integer.parseInt(y);
            }
            else if(string.equals("*")){
                return Integer.parseInt(x) * Integer.parseInt(y);
            }
            else return -1000;








    }


}
