package program.Ukrainian.Alphabets;

import program.Ukrainian.Ukrainian;

import java.util.HashMap;

public class Abecadlo {
    public Abecadlo(String userInput, boolean toPrint) {
        // Key, Value;
        HashMap<String, String> alphabet = new HashMap<>();
        HashMap<String, String> afterCons = new HashMap<>();

        alphabet.put("'", "");
        alphabet.put("а", "a");
        alphabet.put("б", "b");
        alphabet.put("в", "w");
        alphabet.put("г", "h");
        alphabet.put("ґ", "g");
        alphabet.put("д", "d");
        alphabet.put("дь", "ď");
        alphabet.put("е", "e");
        alphabet.put("є", "je");
        alphabet.put("ж", "ž");
        alphabet.put("з", "z");
        alphabet.put("и", "y");
        alphabet.put("і", "i");
        alphabet.put("ї", "ji");
        alphabet.put("й", "j");
        alphabet.put("к", "k");
        alphabet.put("л", "ł");
        alphabet.put("ль", "l");
        alphabet.put("лі", "li");
        alphabet.put("ля", "la");
        alphabet.put("лю", "lu");
        alphabet.put("лє", "le");
//        alphabet.put("лля", "lla");
//        alphabet.put("ллю", "llu");
//        alphabet.put("ллє", "lle");
        alphabet.put("м", "m");
        alphabet.put("н", "n");
        alphabet.put("нь", "ń");
        alphabet.put("о", "o");
        alphabet.put("п", "p");
        alphabet.put("р", "r");
        alphabet.put("с", "s");
        alphabet.put("сь", "ś");

        alphabet.put("св", "św");

        alphabet.put("т", "t");
        alphabet.put("ть", "ť");
        alphabet.put("у", "u");
        alphabet.put("ф", "f");
        alphabet.put("х", "ch");
        alphabet.put("ц", "c");
        alphabet.put("ць", "ć");

        alphabet.put("ч", "cz");
        alphabet.put("ш", "sz");
        alphabet.put("щ", "szcz");
        alphabet.put("ь", "");
        alphabet.put("ю", "ju");
        alphabet.put("я", "ja");

        alphabet.put("ьо", "io");

        alphabet.put("ѣ", "ě");
        alphabet.put("ѧ", "jä");

        System.out.println(Ukrainian.convert(userInput, alphabet, afterCons, true));
    }
}
