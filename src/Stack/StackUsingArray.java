package Stack;

public class StackUsingArray {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(11);
        System.out.println("top of the stack before deleting any element ->" + s.top());
        System.out.println("Size of the stack before deleting any element ->" + s.size());
        System.out.println("deleted  element is " + s.pop());
    }
}
      class stack{
    int size = 100000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop(){
        top--;
        int c = arr[top];
        return c;

    }
    int top(){
        return arr[top];
    }
    int size(){
        return top +1;
    }
      }
