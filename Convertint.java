import java.util.HashMap;

public class Convertint {

    public static String checkforrim(String[] list){
        HashMap<String, String> hashMap = new HashMap();
        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap.put("I", "1");
        hashMap.put("II", "2");
        hashMap.put("III", "3");
        hashMap.put("V", "5");
        hashMap.put("IV", "4");
        hashMap.put("VI", "6");
        hashMap.put("VII", "7");
        hashMap.put("VIII", "8");
        hashMap.put("IX", "9");
        hashMap.put("X", "10");
        hashMap.put("XI", "11");
        hashMap.put("XII", "12");
        hashMap.put("XIII", "13");
        hashMap.put("XIV", "14");
        hashMap.put("XV", "15");
        hashMap.put("XVI", "16");
        hashMap.put("XVII", "17");
        hashMap.put("XVIII", "18");
        hashMap.put("XIX", "19");
        hashMap.put("XX", "20");
        hashMap.put("-I", "-1");
        hashMap.put("-II", "-2");
        hashMap.put("-III", "-3");
        hashMap.put("-V", "-5");
        hashMap.put("-IV", "-4");
        hashMap.put("-VI", "-6");
        hashMap.put("-VII", "-7");
        hashMap.put("-VIII", "-8");
        hashMap.put("-IX", "-9");
        hashMap.put("-X", "-10");
        hashMap.put("-XI", "-11");
        hashMap.put("-XII", "-12");
        hashMap.put("-XIII", "-13");
        hashMap.put("-XIV", "-14");
        hashMap.put("-XV", "-15");
        hashMap.put("-XVI", "-16");
        hashMap.put("-XVII", "-17");
        hashMap.put("-XVIII", "-18");
        hashMap.put("-XIX", "-19");
        hashMap.put("-XX", "-20");


        hashMap2.put(1, "I");
        hashMap2.put(2, "II");
        hashMap2.put(3, "III");
        hashMap2.put(4, "IV");
        hashMap2.put(5, "V");
        hashMap2.put(6, "VI");
        hashMap2.put(7, "VII");
        hashMap2.put(8, "VIII");
        hashMap2.put(9, "IV");
        hashMap2.put(10, "X");
        hashMap2.put(11, "XI");
        hashMap2.put(12, "XII");
        hashMap2.put(13, "XIII");
        hashMap2.put(14, "XIV");
        hashMap2.put(15, "XV");
        hashMap2.put(16, "XVI");
        hashMap2.put(17, "XVII");
        hashMap2.put(18, "XVIII");
        hashMap2.put(19, "XIX");
        hashMap2.put(20, "XX");
        hashMap2.put(-1, "-I");
        hashMap2.put(-2, "-II");
        hashMap2.put(-3, "-III");
        hashMap2.put(-4, "-IV");
        hashMap2.put(-5, "-V");
        hashMap2.put(-6, "-VI");
        hashMap2.put(-7, "-VII");
        hashMap2.put(-8, "-VIII");
        hashMap2.put(-9, "-IV");
        hashMap2.put(-10, "-X");
        hashMap2.put(-11, "-XI");
        hashMap2.put(-12, "-XII");
        hashMap2.put(-13, "-XIII");
        hashMap2.put(-14, "-XIV");
        hashMap2.put(-15, "-XV");
        hashMap2.put(-16, "-XVI");
        hashMap2.put(-17, "-XVII");
        hashMap2.put(-18, "-XVIII");
        hashMap2.put(-19, "-XIX");
        hashMap2.put(-20, "-XX");
        if(hashMap.containsKey(list[0])&&hashMap.containsKey(list[2])){
            int x = Calculator.calculation(hashMap.get(list[0]), hashMap.get(list[2]), list[1]);
            String value = hashMap2.get(x);
            if(value == null){
                return "Your numbers should be less or equal to X, and bigger than I or you have invalid sign";
            }
            return hashMap2.get(x);


        }
        else return "null";

    }





}
