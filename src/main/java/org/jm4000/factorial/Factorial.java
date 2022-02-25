package org.jm4000.factorial;

/**
 * Class providing a method that computes the factorial of
 * an integer number
 */

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
