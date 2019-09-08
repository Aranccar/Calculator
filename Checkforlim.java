public class Checkforlim {
    public static void checkforlim(String result, String[] list){
        if(result == "null"){
            int answer = Calculator.calculation(list[0], list[2], list[1]);
            if(answer == -1000){
                System.out.println("Your numbers should be less or equal to 10, and bigger than 1 or you have invalid sign");
            }
            else{
                System.out.println(answer);
            }

        }
        else{
            System.out.println(result);
        }

    }

}
