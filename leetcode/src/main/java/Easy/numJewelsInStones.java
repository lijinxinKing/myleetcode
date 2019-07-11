package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class numJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        if (J=="" || S==""){
            return 0;
        }
        int temp = 0;
        char[] sChars = S.toCharArray();

        for (int i=0;i<S.length();i++){
            if (J.contains(sChars[i]+"")){
                temp++;
            }
        }
        return temp;
    }
/*
* Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.
* */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int result = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)
            return result;
        if(root.val>=L && root.val<=R){
            result += root.val;
        }
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        return result;
    }
    public  static String removeOuterParentheses(String S) {
        if(S == null || S == ""){
            return "";
        }
        char chars[] = S.toCharArray();
        Map<Integer,String> hashMap = new HashMap<>();
        Stack<Character> characterStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Character temp =' ';
        int j=0;
        for (int i= 0;i < chars.length; i++){
            temp = chars[i];
            if (chars[i] == '('){
                characterStack.push(temp);
                sb.append(temp);
            }else if (chars[i] == ')'){
                characterStack.pop();
                sb.append(temp);
            }
            if (characterStack.empty()){
                hashMap.put(j++,sb.toString());
                sb.delete(0,sb.length());
            }
        }
        StringBuilder resultSb = new StringBuilder();
        for (Map.Entry<Integer,String> map:hashMap.entrySet()){
            String value = map.getValue().substring(1,map.getValue().length()-1);
            resultSb.append(value);
        }
        System.out.println(resultSb);
        return resultSb.toString();
    }

    public static void main(String[] args) {
        // 创建 二叉搜索树

        removeOuterParentheses("()()");
    }
}
