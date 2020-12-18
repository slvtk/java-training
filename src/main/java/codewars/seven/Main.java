package codewars.seven;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        BigInteger bigM = BigInteger.valueOf(10L);
        BigInteger bigN = BigInteger.valueOf(2L);
        while (bigM.compareTo(BigInteger.ZERO)>0){
            System.out.println(bigN.pow(3));
            bigN = bigN.pow(3);
            bigM = bigM.subtract(BigInteger.ONE);
        }
    }
}


