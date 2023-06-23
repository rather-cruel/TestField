package program.Ukrainian;

import java.util.HashMap;

public abstract class Ukrainian {
    public static String convert(
            String message, HashMap<String, String> alphabet, HashMap<String, String> afterCons, boolean changeVowels
    ) {
        StringBuilder output = new StringBuilder();
        boolean isPreviousCons = false;
        for (int index = 0; index < message.length(); index++) {
            char nextLetter = 0;
            char currentLetter = message.charAt(index);
            String lowered = String.valueOf(Character.toLowerCase(currentLetter));
            String latinLetter = "";

            boolean isCurrentUpper = Character.isUpperCase(currentLetter);
            boolean isNextUpper = false;
            boolean isAfterNextUpper = false;

            if (alphabet.containsKey(lowered)) {
                // TODO: Change try {} to if () {}
                try {
                    nextLetter = message.charAt(index + 1);
                    isNextUpper = Character.isUpperCase(nextLetter);
                    nextLetter = Character.toLowerCase(nextLetter);
                } catch (Exception ignored) {}

                String twoCurrentLetters = lowered + nextLetter;

                try {
                    isAfterNextUpper = Character.isUpperCase(message.charAt(index + 2));
                } catch (Exception ignored) {}

                if (alphabet.containsKey(twoCurrentLetters)) {
                    try {
                        latinLetter = alphabet.get(twoCurrentLetters);
                        index++;
                    } catch (Exception ignored) {}
                } else latinLetter = alphabet.get(lowered);

                if (changeVowels) {
                    if (isPreviousCons && afterCons.containsKey(lowered)) {
                        latinLetter = afterCons.get(lowered);
                    }

                    HashMap<String, Boolean> vowels = new HashMap<>();
                    vowels.put("я", true);
                    vowels.put("а", true);
                    vowels.put("є", true);
                    vowels.put("е", true);
                    vowels.put("ю", true);
                    vowels.put("у", true);
                    vowels.put("і", true);
                    vowels.put("и", true);
                    vowels.put("о", true);
                    vowels.put("'", true);
                    vowels.put("ѧ", true);
                    vowels.put("ѣ", true);

                    isPreviousCons = !vowels.containsKey(lowered);
                }
                latinLetter = caseConvert(isCurrentUpper, isNextUpper, isAfterNextUpper, latinLetter, nextLetter, alphabet);
                output.append(latinLetter);
            } else {
                isPreviousCons = false;
                output.append(currentLetter);
            }
        }
        return output.toString();
    }

    private static String caseConvert(
            boolean isCurrentUpper, boolean isNextUpper, boolean isAfterNextUpper, String latinLetter, char nextLetter,
            HashMap<String, String> alphabet
        ) {
        if (isCurrentUpper) {
            if (latinLetter.length() == 1) {
                latinLetter = latinLetter.toUpperCase();
            } else {
                if (isNextUpper) {
                    latinLetter = latinLetter.toUpperCase();
                } else {
                    String latinLetterTitle = Character.toString(Character.toUpperCase(latinLetter.charAt(0))) + Character.toLowerCase(latinLetter.charAt(1));
                    if (nextLetter == ' ') {
                        if (isAfterNextUpper) {
                            latinLetter = latinLetter.toUpperCase();
                        } else latinLetter = latinLetterTitle;
                    } else if (!alphabet.containsKey(Character.toString(Character.toLowerCase(nextLetter)))) {
                        latinLetter = latinLetter.toUpperCase();
                    } else latinLetter = latinLetterTitle;
                }
            }
        }
        return latinLetter;
    }
}
