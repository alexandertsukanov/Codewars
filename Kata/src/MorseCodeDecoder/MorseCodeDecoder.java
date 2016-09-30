package MorseCodeDecoder;

/**
 * Created by alex on 9/30/16.
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        String result = "";
        morseCode = morseCode.trim();
        String[] splited1 = morseCode.split("   ");

        for (int i = 0; i < splited1.length; i++) {

            String[] splited2 = splited1[i].split("\\s+");

            for (int j = 0; j < splited2.length; j++) {

  //     Here you need to specify "Morse-to-English" dictionary. It can be HashMap or Table.

  //              String a = MorseCode.get(splited2[j]);
  //              result = result + a;

            }
            result = result + " ";
        }
        result = result.trim();
        return result;
    }
}