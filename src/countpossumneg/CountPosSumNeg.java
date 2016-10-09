package countpossumneg;

/**
 * Created by alex on 9/30/16.
 */
public class CountPosSumNeg {

        public static int[] countPositivesSumNegatives(int[] input)
        {
            int a = 0;
            int b = 0;
            if (input == null || input.length == 0) {
                return new int[0];
            }
            else {
                for (int i = 0; i < input.length; i++) {
                    if (input[i] > 0) {
                        a++;
                    } else {
                        b += input[i];
                    }
                }
                int[] output = {a, b};

                return output;
            }
        }
    }



