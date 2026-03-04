package com.strings;

import java.util.Arrays;

public class StringDemo1 {

    public static void main(String[] args) {

        String s1 = "capgemini";
        String s2 = "Aapgemini";
        String s3 = "capgemini";
        String s4 = "  Akash Muddapu  ";
        String s5 = new String("capgemini");
        String s6 = "";
        String s7 = " ";
        String s8 = "java,python,c++";
        String multiLine = "Hello\nWorld";
        char[] ch = {'A','k','a','s','h'};

        // 1. Length & Character Methods
        System.out.println("length: " + s1.length());
        System.out.println("charAt: " + s1.charAt(0));
        System.out.println("codePointAt: " + s1.codePointAt(0));
        System.out.println("codePointBefore: " + s1.codePointBefore(2));
        System.out.println("codePointCount: " + s1.codePointCount(0, 4));
        System.out.println("offsetByCodePoints: " + s1.offsetByCodePoints(1, 4));

        // 2. Comparison Methods
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s3));
        System.out.println("compareTo: " + s1.compareTo(s2));
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));
        System.out.println("contentEquals: " + s1.contentEquals("capgemini"));

        // 3. Searching Methods
        System.out.println("contains: " + s1.contains("mini"));
        System.out.println("startsWith: " + s1.startsWith("cap"));
        System.out.println("endsWith: " + s1.endsWith("ni"));
        System.out.println("indexOf: " + s1.indexOf("ge"));
        System.out.println("indexOf from index: " + s1.indexOf('i', 3));
        System.out.println("lastIndexOf: " + s1.lastIndexOf("i"));

        // 4. Case Conversion
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("toLowerCase: " + s2.toLowerCase());

        // 5. Trim & Strip
        System.out.println("trim: '" + s4.trim() + "'");
        System.out.println("strip: '" + s4.strip() + "'");
        System.out.println("stripLeading: '" + s4.stripLeading() + "'");
        System.out.println("stripTrailing: '" + s4.stripTrailing() + "'");

        // 6. Replace Methods
        System.out.println("replace char: " + s1.replace('c','s'));
        System.out.println("replace string: " + s1.replace("mini","tech"));
        System.out.println("replaceFirst: " + s1.replaceFirst("i","X"));
        System.out.println("replaceAll: " + s1.replaceAll("i","X"));

        // 7. Substring & Subsequence
        System.out.println("substring(begin): " + s1.substring(3));
        System.out.println("substring(begin,end): " + s1.substring(2,5));
        System.out.println("subSequence: " + s1.subSequence(1,4));

        // 8. Split & Join
        System.out.println("split: " + Arrays.toString(s8.split(",")));
        System.out.println("join: " + String.join("-", "A","B","C"));

        // 9. Validation
        System.out.println("isEmpty: " + s6.isEmpty());
        System.out.println("isBlank: " + s7.isBlank());
        System.out.println("matches: " + s1.matches("[a-z]+"));

        // 10. Conversion Methods
        System.out.println("toCharArray: " + Arrays.toString(s1.toCharArray()));
        System.out.println("getBytes: " + Arrays.toString(s1.getBytes()));
        System.out.println("valueOf: " + String.valueOf(100));
        System.out.println("copyValueOf: " + String.copyValueOf(ch));

        // 11. Formatting
        System.out.println("format: " + String.format("Name: %s Age: %d", "Akash", 23));
        System.out.println("formatted: " + "Hello %s".formatted("Akash"));

        // 12. Repeat & Indent
        System.out.println("repeat: " + s1.repeat(2));
        System.out.println("indent:\n" + s1.indent(4));

        // 13. Lines (Java 11)
        multiLine.lines().forEach(line -> System.out.println("line: " + line));

        // 14. Transform (Java 12+)
        System.out.println("transform: " + s1.transform(str -> str.toUpperCase()));

        // 15. Intern
        System.out.println("intern: " + (s1.intern() == s3));

        // 16. hashCode
        System.out.println("hashCode: " + s1.hashCode());

        // 17. concat
        System.out.println("concat: " + s1.concat(" tech"));

        // 18. getChars
        char[] dest = new char[5];
        s1.getChars(0,5,dest,0);
        System.out.println("getChars: " + Arrays.toString(dest));
    }
}