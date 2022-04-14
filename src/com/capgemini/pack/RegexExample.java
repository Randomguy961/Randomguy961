package com.capgemini.pack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String args[]) {
        //1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b+" "+b2+" "+b3);
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "hello"));//true (hello or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (hello comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (hello m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (hello comes more than one time)
        System.out.println(Pattern.matches("[amn]*", "annmmmmmmm"));//true (hello or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (hello or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "hello"));//true (hello or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (hello comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (hello or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (hello or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", ""));//true (hello or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "annz"));//true (hello or m or n may come zero or more times)

        System.out.println("===================length pattern===============");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
        System.out.println("=========================================================================================================");
        System.out.println(Pattern.matches("[amn].{2}[hgh]", "afgh"));
    }
}
