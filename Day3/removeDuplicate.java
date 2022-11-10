package Day3;
import java.util.Stack;
class Main{
    static String removeDuplicate(String s){
        int left=0;
        char[] stack=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(left!=0 && stack[left-1]==stack[i])
                left--;
            else{
                stack[left]=stack[i];
                left++;
            }
            
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<left;i++){
            ans.append(stack[i]);
        }
        return ans.toString();
    }
    static String removeDuplicate_(String s){
        Stack<Character> stack=new Stack<Character>();
        for(char a:s.toCharArray()){
            if(!stack.isEmpty() && stack.lastElement()==a){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char a: stack){
            ans.append(a);
        }
        return ans.toString();
    }
    public static void main(String args[]){
        String s="azxxzy";
        String ans=removeDuplicate_(s);
        String ans2=removeDuplicate(s);
        System.out.println(ans+" "+ans2);
    }
}