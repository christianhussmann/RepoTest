package com.company;

public class StringUtils {
    public String exercise1(String input) {
        return "<" + input + ">";
    }

    public int exercise2(String input) {
        return input.length();
    }

    public String exercise3(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1) {
                result = result + input.charAt(i) + "@";
            } else {
                result = result + input.charAt(i);
            }
        }
        return result;
    }

    public String exercise4(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }

    public String exercise5(String input) {
        String result = "";
        String[] morseLetters = {" /", ". ___", "___ . . .", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", ". ___ ___ ___", "___ . ___", ". ___ . .", "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", ". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};
        char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        for (int i = 0; i < input.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (input.charAt(i) == letters[j]) {
                    result += morseLetters[j];
                    result += "   ";

                    break;
                }
            }
        }
        return result;

    }
}