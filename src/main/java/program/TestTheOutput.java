package program;

public class TestTheOutput {
    public static void checkTransliteration(String transliteration, String expectation) {
        String output = "";
        String errorMessage = "";
        boolean isAnError = false;
        try {
            for (int i = 0; i < transliteration.length(); i++) {
                if (transliteration.charAt(i) != expectation.charAt(i)) {
                    errorMessage = "|| Error: " + transliteration + " || Expected: " + expectation;
                    errorMessage += " || Wrong symbol: " + transliteration.charAt(i) + " || Number: " + i + " ||";
                    isAnError = true;
                    break;
                }
            }
        } catch (Exception e) {
            errorMessage = "Error: Not enough symbols! | " + transliteration + " | " + expectation + " |";
            for (int i = 0; i < errorMessage.length(); i++) {
                output += "-";
            }

            System.out.println(output);
            System.out.println(errorMessage);
            System.out.println(output);
        }

        for (int i = 0; i < errorMessage.length(); i++) {
            output += "-";
        }

        if (isAnError) {
            System.out.println(output);
            System.out.println(errorMessage);
            System.out.println(output);
        }
    }
}