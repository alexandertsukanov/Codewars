package eureka;

import java.util.ArrayList;
import java.util.List;

public class Eureka {

    public static List<Long> sumDigPow(long a, long b) {

        ArrayList<Long> list = new ArrayList<Long>();

        while(a < b) {

            long sum = 0;
            long FirstNum = String.valueOf(a).length();
            long SecondNum = String.valueOf(b).length();
            long[] aArr = new long[(int) FirstNum];
            long[] bArr = new long[(int) SecondNum];
            long number = a;

            for (int i = aArr.length - 1; i != -1; i--) {
                aArr[i] = number % 10;
                number /= 10;
            }
            for (int i = 0; i < aArr.length; i++) {
                sum += (long) Math.pow(aArr[i], i + 1);
                if (a == sum) {
                    list.add(sum);
                }
            }
            sum = 0;
            a++;
        }

        if(list.isEmpty()){
            return list;
        }

        return list;

    }
}
