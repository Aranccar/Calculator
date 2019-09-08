import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] list = ParsString.parsString(string);
        String result = Convertint.checkforrim(list);

        Checkforlim.checkforlim(result, list);





    }
}
