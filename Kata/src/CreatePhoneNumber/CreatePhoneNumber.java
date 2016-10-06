package CreatePhoneNumber;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by alex on 10/6/16.
 */
public class CreatePhoneNumber {


    public static String createPhoneNumber(int[] numbers) throws ParseException {


        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//                answer = answer + "(";
//            }
//            if (i == 3) {
//                answer = answer + ") ";
//            }
//            if (i == 7) {
//                answer = answer + "-";
//            }
            answer = answer + numbers[i];
        }
      Number num = Integer.parseInt(answer);
        System.out.println(num);
        return answer;
    }


    public static void main(String[] args) throws ParseException{

        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String a = createPhoneNumber(digits);

        System.out.println(a);
    }


}
