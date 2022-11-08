import java.util.Stack;

public class makeGood{
    static String makegood(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.lastElement()-ch)==32)
                stack.pop();
            else
                stack.push(ch);

        }
        StringBuilder ans=new StringBuilder();
        for(char ch:stack){
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String args[]){
        String s="LeEetcode";
        String ans=makegood(s);
        System.out.println(ans);
        


    }
}