package com.selenium.spring.interview;

public class SwapLowerUpperCharacters {
    public static void main(String[] args) {
        System.out.println("Swapped string is : " + swapCharacters("susHoBHaN"));
    }

    private static String swapCharacters(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                stringBuilder.replace(i, i + 1, Character.toUpperCase(s.charAt(i)) + "");
            } else if (Character.isUpperCase(s.charAt(i))) {
                stringBuilder.replace(i, i + 1, Character.toLowerCase(s.charAt(i)) + "");
            }
        }
        return String.valueOf(stringBuilder);
    }
}
