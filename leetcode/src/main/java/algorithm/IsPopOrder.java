package algorithm;

import java.util.Stack;

public class IsPopOrder {

    public boolean IsPopOrder(int pushV[], int popV[]){
        if (pushV.length == 0 || popV.length == 0 || pushV.length != popV.length){
            return false;
        }
        int index = 0;
        Stack<Integer> push_V = new Stack<>();
        for (int i = 0; i < pushV.length; i++) {
            push_V.push(pushV[i]);
            while (!push_V.isEmpty() && push_V.peek() == popV[index]){
                push_V.pop();
                index++;
            }
        }
        if(push_V.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int []push = new int[]{1,2,3,4,5};
        int []pop = new int[]{5,4,3,2,1};
        IsPopOrder isPopOrder =new IsPopOrder();
        System.out.println(isPopOrder.IsPopOrder(push,pop));
    }
}
