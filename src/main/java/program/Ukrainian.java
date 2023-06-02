package program;

import java.util.HashMap;

public class Ukrainian {
    public Ukrainian(String userInput) {
        HashMap<String, String> alphabet = new HashMap<String, String>();
        // Key, Value;
        alphabet.put("'", "");
        alphabet.put("а", "a");
        alphabet.put("б", "b");
        alphabet.put("в", "v");
        alphabet.put("г", "h");
        alphabet.put("ґ", "g");
        alphabet.put("д", "d");
        alphabet.put("дь", "ď");
        alphabet.put("дя", "ďa");
        alphabet.put("дю", "ďu");
        alphabet.put("дє", "ďe");
        alphabet.put("е", "e");
        alphabet.put("є", "je");
        alphabet.put("ж", "ž");
        alphabet.put("з", "z");
        alphabet.put("и", "y");
        alphabet.put("ий", "ý");
        alphabet.put("і", "i");
        alphabet.put("ї", "ji");
        alphabet.put("й", "j");
        alphabet.put("к", "k");
        alphabet.put("л", "l");
        alphabet.put("ль", "ľ");
        alphabet.put("ля", "ľa");
        alphabet.put("лю", "ľu");
        alphabet.put("лє", "ľe");
        alphabet.put("м", "m");
        alphabet.put("н", "n");
        alphabet.put("нь", "ň");
        alphabet.put("ня", "ňa");
        alphabet.put("ню", "ňu");
        alphabet.put("нє", "ňe");
        alphabet.put("о", "o");
        alphabet.put("п", "p");
        // alphabet.put("при", "přy");
        // alphabet.put("пре", "pře");
        alphabet.put("р", "r");
        alphabet.put("рь", "ř");
        alphabet.put("с", "s");

        alphabet.put("ся", "sia");
        alphabet.put("сє", "sie");
        alphabet.put("сю", "siu");
        // alphabet.put("сьо", "sío");

        alphabet.put("т", "t");
        alphabet.put("ть", "ť");
        alphabet.put("тя", "ťa");
        alphabet.put("тє", "ťe");
        alphabet.put("тю", "ťu");
        alphabet.put("у", "u");
        alphabet.put("ф", "f");
        alphabet.put("х", "ch");
        alphabet.put("ц", "c");

        alphabet.put("ця", "cia");
        alphabet.put("цє", "cie");
        alphabet.put("цю", "ciu");
        // alphabet.put("цьо", "cío");

        alphabet.put("ч", "č");
        alphabet.put("ш", "š");
        alphabet.put("щ", "šč");
        alphabet.put("ь", "");
        alphabet.put("ю", "ju");
        alphabet.put("я", "ja");

        System.out.println(convert(userInput, alphabet));
    }

    public static String convert(String message, HashMap<String, String> alphabet) {
        String output = "";
        for (int index = 0; index < message.length(); index++) {
            char nextLetter = 0;
            char currentLetter = message.charAt(index);
            boolean isCurrentUpper = Character.isUpperCase(currentLetter);
            String lowered = String.valueOf(Character.toLowerCase(currentLetter));
            String latinLetter = "";

            try {
                nextLetter = message.charAt(index + 1);
            } catch (Exception e) {}

            String twoCurrentLetters = lowered + nextLetter;

            if (alphabet.containsKey(twoCurrentLetters)) {
                try {
                    latinLetter = alphabet.get(twoCurrentLetters);
                    index++;
                } catch (Exception e) {}
            } else {
                if (alphabet.containsKey(lowered)) {
                    latinLetter = alphabet.get(lowered);
                } else latinLetter += currentLetter;
            }

            output += latinLetter;
        }
        return output;
    }
}
