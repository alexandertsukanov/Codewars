package complementarydna;

/**
 * Created by alex on 10/9/16.
 */
public class ComplementaryDNA {

    public static String makeComplement(String dna) {

        String answer = "";
        char[] myChars = dna.toCharArray();
        for (int i = 0; i < myChars.length ; i++) {
            if(myChars[i] == 'A'){
                myChars[i] = 'T';
            }
            else if (myChars[i] == 'T'){
                myChars[i] = 'A';
            }
            else if (myChars[i] == 'G'){
                myChars[i] = 'C';
            }
            else if (myChars[i] == 'C'){
                myChars[i] = 'G';
            }
        }
        for (char myChar : myChars) {
            answer = answer + myChar;
        }

        return answer;
    }

    public static void main(String[] args) {

        String a = makeComplement("ATTAGCC");
        System.out.println(a);
    }
}
