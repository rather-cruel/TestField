package program.Ukrainian;

import java.util.HashMap;

public abstract class Ukrainian {
    public static String convert(String message, HashMap<String, String> alphabet) {
        StringBuilder output = new StringBuilder();
        for (int index = 0; index < message.length(); index++) {
            char nextLetter = 0;
            char afterNextLetter = 0;
            char currentLetter = message.charAt(index);
            String lowered = String.valueOf(Character.toLowerCase(currentLetter));
            String latinLetter = "";

            boolean isCurrentUpper = Character.isUpperCase(currentLetter);
            boolean isNextUpper = false;
            boolean isAfterNextUpper = false;

            if (alphabet.containsKey(lowered)) {
                try {
                    nextLetter = message.charAt(index + 1);
                    isNextUpper = Character.isUpperCase(nextLetter);
                    nextLetter = Character.toLowerCase(nextLetter);
                } catch (Exception ignored) {}

                try {
                    afterNextLetter = message.charAt(index + 2);
                    isAfterNextUpper = Character.isUpperCase(afterNextLetter);
                    afterNextLetter = Character.toLowerCase(afterNextLetter);
                } catch (Exception ignored) {}

                String twoCurrentLetters = lowered + nextLetter;
                String threeCurrentLetters = lowered + nextLetter + afterNextLetter;

                if (alphabet.containsKey(threeCurrentLetters)) {
                    try {
                        latinLetter = alphabet.get(threeCurrentLetters);
                        index += 2;
                    } catch (Exception ignored) {}
                } else if (alphabet.containsKey(twoCurrentLetters)) {
                    try {
                        latinLetter = alphabet.get(twoCurrentLetters);
                        index++;
                    } catch (Exception ignored) {}
                } else latinLetter = alphabet.get(lowered);

                latinLetter = caseConvert(
                        isCurrentUpper, isNextUpper, isAfterNextUpper, latinLetter, lowered, afterNextLetter
                );
                output.append(latinLetter);
            } else output.append(currentLetter);
        }
        return output.toString();
    }

    public static String caseConvert(
            boolean isCurrentUpper, boolean isNextUpper, boolean isAfterNextUpper,
            String latinLetter, String lowered, char afterNextLetter
    ) {
        HashMap<String, Boolean> vowels = new HashMap<String, Boolean>();
        vowels.put("я", true);
        vowels.put("є", true);
        vowels.put("ю", true);
        vowels.put("ї", true);

        String firstCharacter = "";
        String secondCharacter = "";
        String thirdCharacter = "";

        try {
            firstCharacter = String.valueOf(latinLetter.charAt(0));
            secondCharacter = String.valueOf(latinLetter.charAt(1));
            thirdCharacter = String.valueOf(latinLetter.charAt(2));
        } catch (Exception ignored) {}

        if (!vowels.containsKey(lowered)) {
            if (latinLetter.length() == 1) {
                if (isCurrentUpper) {
                    latinLetter = latinLetter.toUpperCase();
                }
            } else {
                if (latinLetter.length() == 2) {
                    if (isCurrentUpper) {
                        if (isNextUpper) {
                            latinLetter = latinLetter.toUpperCase();
                        } else {
                            latinLetter = firstCharacter.toUpperCase() + secondCharacter.toLowerCase();
                        }
                    } else {
                        if (isNextUpper) {
                            latinLetter = firstCharacter.toLowerCase() + secondCharacter.toUpperCase();
                        } else latinLetter = latinLetter.toLowerCase();
                    }
                } else {
                    if (isCurrentUpper) {
                        if (isNextUpper && (isAfterNextUpper || afterNextLetter == ' ')) {
                            latinLetter = latinLetter.toUpperCase();
                        } else if (!isNextUpper && isAfterNextUpper) {
                            latinLetter = firstCharacter.toUpperCase() + secondCharacter.toLowerCase() + thirdCharacter.toUpperCase();
                        } else if (!isNextUpper) {
                            latinLetter = firstCharacter.toUpperCase() + secondCharacter.toLowerCase() + thirdCharacter.toLowerCase();
                        }
                    } else {
                        if (isNextUpper && isAfterNextUpper) {
                            latinLetter = firstCharacter.toLowerCase() + secondCharacter.toUpperCase() + thirdCharacter.toUpperCase();
                        } else if (isNextUpper) {
                            latinLetter = firstCharacter.toLowerCase() + secondCharacter.toUpperCase() + thirdCharacter.toLowerCase();
                        } else latinLetter = latinLetter.toLowerCase();
                    }
                }
            }
        } else {
            if (isCurrentUpper && isNextUpper) {
                latinLetter = latinLetter.toUpperCase();
            } else if (isCurrentUpper) {
                latinLetter = firstCharacter.toUpperCase() + secondCharacter.toLowerCase();
            }
        }
        return latinLetter;
    }
}
