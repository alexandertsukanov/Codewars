package spinwords;

/**
 * Created by alex on 10/9/16.
 */
public class SpinWords {

    public static String spinWords(String sentence) {

        String[] str = sentence.split(" ");
        String reversed = "";
        for (int i = 0; i < str.length; i++) {
            if(str[i].length() >= 5) {
                str[i] = new StringBuffer(str[i]).reverse().toString();
            }
        }
        for (String aStr : str) {
            reversed = reversed + aStr + " ";
        }
        return reversed.trim();
    }


    public static void main(String[] args) {

        String a = spinWords("hey Hello Daddy");
        System.out.println(a);

    }
}
