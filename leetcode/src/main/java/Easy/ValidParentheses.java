package Easy;
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
*
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        if(n==0)return 0;
        if (n==1)return 1;
        int result = 0;
        while (n!=0){
            if((n&1)!=0){
                result++;
            }
            n>>>=1;
        }
        return result ;
    }
    public static boolean validParentheses(String s){

        char[]str = s.toCharArray();
        if(s.length()==1){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        Character[] characters = new Character[]{};
        Stack<Character> stack = new Stack<Character>(); // 先进后出的栈
        Map<Character,Character> characterMap = new HashMap<Character, Character>();
        characterMap.put('(',')');
        characterMap.put('{','}');
        characterMap.put('[',']');
        Character []chcs = new Character[str.length];
        int m = 0;

        for (Character chc: str){
            if (characterMap.containsKey(chc)){
                stack.push(chc);
            }else if (stack.size()>0){
                Character ch = stack.pop();
                chcs[m++] = ch;
                Character popCh = '.';
                for (Map.Entry<Character,Character> entry:characterMap.entrySet()){
                    if(entry.getValue() == chc){
                        popCh = entry.getKey();
                        chcs[m++] = chc;
                    }
                }

                if(popCh != ch){
                    return false;
                }
            }
        }
       for (Character character:chcs){
           System.out.print(character);
       }
        System.out.println();

        if(stack.size()==0)
        return true;
        return false;
    }

    public static void main(String[] args) {

        int weight = hammingWeight(00000000000000000000000010000000);

        Stack<Character> stack = new Stack<Character>();
        stack.push('c');
        stack.push('b');
        stack.push('a');
        System.out.println(stack.pop());


        Character[]  heses = new Character[]{'(', '[',')'};
        boolean result = validParentheses("}{");
        System.out.println(result);
    }
}
