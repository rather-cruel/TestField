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
        alphabet.put("е", "e");
        alphabet.put("є", "je");
        alphabet.put("ж", "ž");
        alphabet.put("з", "z");
        alphabet.put("и", "y");
        alphabet.put("і", "i");
        alphabet.put("ї", "ji");
        alphabet.put("й", "j");
        alphabet.put("к", "k");
        alphabet.put("л", "l");
        alphabet.put("м", "m");
        alphabet.put("н", "n");

        alphabet.put("нь", "ň");

        alphabet.put("о", "o");
        alphabet.put("п", "p");
        alphabet.put("р", "r");
        alphabet.put("с", "s");

        alphabet.put("ся", "sia");

        alphabet.put("т", "t");
        alphabet.put("у", "u");
        alphabet.put("ф", "f");
        alphabet.put("х", "ch");
        alphabet.put("ц", "c");
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
