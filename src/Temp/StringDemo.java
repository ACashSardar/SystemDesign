package Temp;

import java.util.Arrays;
import java.util.Collections;

public class StringDemo {

    public static void fun(String s) {
        s += "xyz";
        System.out.println(s);
    }

    public static void funSB(StringBuilder sb) {
        sb.append("xyz");
    }

    public static void main(String[] args) {
        String s = "abcmmsddf";
        StringBuilder sb = new StringBuilder(s); // Fast but not Thread safe. Concurrent modification Exception.
        StringBuffer sb2 = new StringBuffer(s); // Slow but ThreadSafe.

//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(arr);

//        System.out.println(sb);
//        funSB(sb);
//        System.out.println(sb);

//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            System.out.print(ch + " ");
//        }

//        for (char ch : s.toCharArray()) { // better
//            System.out.print(ch + " ");
//        }

        
    }
}
