package ss10_DSA_Stack_Queue.bai_tao;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static boolean Check(String alphabet) {

        Stack<Character> bstack = new Stack<>();
        Character left;
        for (int i = 0; i < alphabet.length(); i++) {
            char sym = alphabet.charAt(i);
            if (sym == '(') {
                bstack.push(sym);
            }
            if (sym == ')') {
                if (bstack.isEmpty()) {
                    return false;
                } else {
                    left = bstack.pop();

                }
                if (left.equals(')')){
                    return false;
            }
        }
    }
        if (bstack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
        }

}
