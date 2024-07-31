package project1;

import java.util.SplittableRandom;

public class Otpgenerate {
    public static void main(String[] args){
        System.out.println("this is otp generate "+otpstr());
    }
    public static String otpstr(){
        SplittableRandom splittableRandom= new SplittableRandom();
        StringBuilder otpgenerate = new StringBuilder();
        for(int i=0; i<5;i++){
            int otp = splittableRandom.nextInt(0,9);
            otpgenerate.append(otp);
        }
        return otpgenerate.toString();
    }
}