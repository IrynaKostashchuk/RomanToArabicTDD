package org.example;/*
  @author   kosta
  @project   RomanToArabic
  @class  Converter
  @version  1.0.0 
  @since 22.02.2024 - 17.13
*/

import java.util.HashMap;

public class Converter {

    public static int convertRomanToArabic(String number){
        if (number == null) {
            throw new IllegalArgumentException("Roman number is null");
        }
        if (number.equals("")) {
            throw new IllegalArgumentException("Roman number is empty");
        }
        if (!number.matches("[IVXLCDMivxlcdm]+")) {
            throw new IllegalArgumentException("Roman number has illegal characters");
        }
        if (number.length() > 30) {
            throw new IllegalArgumentException("Roman number is too long");
        }
        if (number.matches(".*([IVXLCDM])\\1{3,}.*")) {
            throw new IllegalArgumentException("Invalid repetitive characters");
        }
        if (number.matches(".*\\b[VDL]{2}\\b.*")) {
            throw new IllegalArgumentException("Invalid consecutive 'V', 'L', 'D' characters");
        }


        HashMap<Character,Integer> romanDigits = new HashMap<Character,Integer>();
        romanDigits.put('I',1);
        romanDigits.put('V',5);
        romanDigits.put('X',10);
        romanDigits.put('L',50);
        romanDigits.put('C',100);
        romanDigits.put('D',500);
        romanDigits.put('M',1000);
        number = number.toUpperCase();
        number = number.replace("IV", "IIII");
        number = number.replace("IX", "VIIII");
        number = number.replace("XL", "XXXX");
        number = number.replace("XC", "LXXXX");
        number = number.replace("CD", "CCCC");
        number = number.replace("CM", "DCCCC");

        Integer result = 0;

        for (int i =0; i < number.length(); i++){
            result += romanDigits.get(number.charAt(i));
        }


        return result;
    }
}
