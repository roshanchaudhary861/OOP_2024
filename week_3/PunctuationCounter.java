import java.util.Scanner;

public class PunctuationCounter {
    public static void main(String[] args) {
        String inputString = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        int periodCount = 0;
        int commaCount = 0;
        int semicolonCount = 0;
        int colonCount = 0;
        int exclamationCount = 0;
        int questionCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            switch (currentChar) {
                case '.':
                    periodCount++;
                    break;
                case ',':
                    commaCount++;
                    break;
                case ';':
                    semicolonCount++;
                    break;
                case ':':
                    colonCount++;
                    break;
                case '!':
                    exclamationCount++;
                    break;
                case '?':
                    questionCount++;
                    break;
            }
        }

        System.out.println("Symbol\t\tCount");
        System.out.println("-----------------------");
        System.out.println(".\t\t" + periodCount);
        System.out.println(",\t\t" + commaCount);
        System.out.println(";\t\t" + semicolonCount);
        System.out.println(":\t\t" + colonCount);
        System.out.println("!\t\t" + exclamationCount);
        System.out.println("?\t\t" + questionCount);
    }
}
