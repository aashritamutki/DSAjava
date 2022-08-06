//Program : 1

import java.util.*;

//trailing zeroes - no. of zeroes in n!
//normal approach - find fact then count zeroes
//if we find manually then int overflow takes place
//hence go for optimized way
//divide the num by 5 till quotient is 0 and go on adding quotient each time to get final answer

public class TrailingZeros {
    public static void main(String[] args) {
        int num = 75;
        int no_of_zeros = 0;

        System.out.print("Number of trailing zeros in " + num + "! = ");

        while(num / 5 != 0){
            no_of_zeros += num / 5;               //go on adding quotient each time to get final answer
            num /= 5;                             //divide the num by 5 till quotient is 0
        }

        System.out.print(no_of_zeros);
    }
}
