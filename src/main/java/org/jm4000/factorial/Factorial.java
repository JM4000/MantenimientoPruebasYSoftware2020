package org.jm4000.factorial;

public class Factorial {

    public int compute(int value) {
        int result;

        if(value < 0) throw new RuntimeException("Can't compute negative values");

        if ((value == 0) || (value == 1)){
            result = 1;
        }else if(value == 2){
            result = 2;
        }else if(value == 3){
            result = 6;
        }else {
            result = value * compute(value-1);
        }
        return result;
    }
}
