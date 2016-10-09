package oddeven;

import java.math.BigInteger;

public class OddEven {

    public static String oddity(BigInteger n) {
        return Math.sqrt(n.doubleValue()) % 1 != 0 ? "even" : "odd";
    }


    public static void main(String[] args) {


        BigInteger a = new BigInteger("12");
        long start_time = System.nanoTime();
        System.out.println(oddity(a));

        long end_time = System.nanoTime();
        double difference = (end_time - start_time)/1e6;
        System.out.println(difference);

    }


}
