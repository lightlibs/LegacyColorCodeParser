package com.tcoded.legacycolorcodeparser;

public class LegacyColorCodeParser {

    public static String convertHexToLegacy(char codeChar, String input) {
        return input.replaceAll(
                codeChar + "#([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])",
                String.format("%sx%s$1%s$2%s$3%s$4%s$5%s$6", codeChar, codeChar, codeChar, codeChar, codeChar, codeChar, codeChar));
    }

}