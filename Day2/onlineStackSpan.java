import java.util.Stack;

class Main{
    static int next(int price){
        int ans=1;
        Stack<int[]> stack=new Stack<>();
        
        while(! stack.isEmpty() && stack.lastElement()[0]<=price){
            ans+=stack.pop()[1];
        }
        stack.push(new int[] {price,ans});
        return ans;
    }
    public static void main(String args[]){
        int[] arr={100,80,60,70,60,75,85};
        for(int a:arr){
            System.out.print(next(a)+" ");
        }
    }
}