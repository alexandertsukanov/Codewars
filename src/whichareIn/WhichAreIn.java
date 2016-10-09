package whichareIn;

import java.util.Arrays;

/**
 * Created by alex on 10/9/16.
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        String[] r = {};
        int counter = 0;
        int last = 0;
        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array1[i] + " " + array2[j]);
                if (array2[j].contains(array1[i])) {

                    counter++;
                   break;
                }
            }
        }

        if (counter == 0){ return r; }
        r = new String[counter];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array2[j].contains(array1[i])) {
                        r[last] = array1[i];
                        last++;
                        break;
                    }
                }
            }
        Arrays.sort(r);
        return r;
    }



    public static void main(String[] args) {

        String a[] = new String[]{ "1295", "code", "1346", "1028", "ar" };
        String b[] = new String[] { "12951295", "ode", "46", "10281066", "par" };

        System.out.println(Arrays.toString(inArray(a, b)));


    }
}
