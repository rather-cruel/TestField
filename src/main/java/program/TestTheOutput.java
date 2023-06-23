package program;

public class TestTheOutput {
    public static void checkTransliteration(String transliteration, String expectation, int styleNumber) {
        StringBuilder transliterationOutput = new StringBuilder();
        StringBuilder expectationOutput = new StringBuilder();
        String errorMessage;
        boolean isAnError = false;
        int[] mistakes = new int[transliteration.length()];
        int errorIndex;
        int counter = 0;

        try {
            for (int i = 0; i < transliteration.length(); i++) {
                if (transliteration.charAt(i) != expectation.charAt(i)) {
                    isAnError = true;
                    mistakes[counter] = i;
                    counter++;
                }
            }
        } catch (Exception e) {
            errorMessage = "| Error: Not enough symbols! | " + "TRANSLITERATION: " + transliteration + " | EXPECTED: " + expectation + " |";
            transliterationOutput.append("-".repeat(errorMessage.length()));

            System.out.println(transliterationOutput);
            System.out.println(errorMessage);
            System.out.println(transliterationOutput);
            isAnError = false;
        }

        if (isAnError) {
            int j = 0;
            for (int i = 0; i < transliteration.length(); i++) {
                errorIndex = mistakes[j];
                if (transliterationOutput.length() != transliteration.length()) {
                    if (i == errorIndex) {
                        transliterationOutput.append("=");
                        j++;
                    } else transliterationOutput.append("-");
                }
            }

            j = 0;
            for (int i = 0; i < expectation.length(); i++) {
                errorIndex = mistakes[j];
                if (expectationOutput.length() != expectation.length()) {
                    if (i == errorIndex) {
                        expectationOutput.append("=");
                        j++;
                    } else expectationOutput.append("-");
                }
            }

            if (styleNumber == 1) {
                System.out.println("◦------------------" + transliterationOutput + "-◦-----------" + expectationOutput + "-◦");
                System.out.println("| TRANSLITERATION: " + transliteration + " | EXPECTED: " + expectation + " |");
                System.out.println("◦------------------" + transliterationOutput + "-◦-----------" + expectationOutput + "-◦");
            } else {
                System.out.println("╔------------------" + transliterationOutput + "-◦-----------" + expectationOutput + "-╗");
                System.out.println("║ TRANSLITERATION: " + transliteration + " | EXPECTED: " + expectation + " ║");
                System.out.println("╚------------------" + transliterationOutput + "-◦-----------" + expectationOutput + "-╝");
            }
        }
    }
}