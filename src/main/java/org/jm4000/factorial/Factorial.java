package org.jm4000.factorial;

public class Factorial {

    public int compute(int value) {
        int result=1;

        if(value < 0) {
            throw new RuntimeException("Can't compute negative values");
        }else{
            for ( int j=1; j<=value; j++ )
                result *= j;
        }


        return result;
    }
}
