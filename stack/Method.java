package stack;
import java.util.Stack;

public class Method {

    int[] nextGreaterElement(int[] arr){
        int[] next = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){

            while (!s.isEmpty() && arr[i]>=arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                next[i]  = -1;
            }
            else{
                next[i] = arr[s.peek()];
            }
            s.push(i);

        }
        return next;
    }
    public int applyOp(char op , int b ,int a) {
        switch(op){
            case '+':return a+b;
            case '-':return b-a;
            case '*':return b*a;
            case '/':return b/a;
        }

        return -1;
    }

    public int precedence(char op){
        if(op=='+' || op=='-')return 1;
        if(op=='/' || op=='*')return 2;
        return 0;
    }

    public int infixevaloate(String exp){
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isDigit(ch))val.push(ch-'0');
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){

                while(!op.isEmpty() && precedence(op.peek())>=precedence(ch)){
                    int v1 = val.pop();
                    int v2 = val.pop();
                    char temp = op.pop();
                    val.push(applyOp(temp,v2,v1));
                }
                op.push(ch);
            }
        }

       while(!op.isEmpty()){
            int v1 = val.pop();
            int v2 = val.pop();
            char temp = op.pop();
            int result = applyOp(temp,v2,v1);
            val.push(result);
       }

       return val.pop();
    }
    
}



class InfixEvaluation {

    // Helper method to apply an operator to two operands
    public int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    // Method to get precedence of an operator
    public int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    // Main method to evaluate infix expression
    public int infixEvaluate(String exp) {
        Stack<Integer> val = new Stack<>(); // Stack to store integers
        Stack<Character> op = new Stack<>(); // Stack to store operators

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If the character is a digit, parse and push it to the value stack
            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            }

            // If the character is an operator, apply previous operators based on precedence
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    val.push(applyOp(operator, v2, v1));
                }
                op.push(ch);
            }
        }

        // Apply remaining operators to values in the stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            val.push(applyOp(operator, v2, v1));
        }

        return val.pop(); // The result will be the last value in the stack
    }

    public static  int[] nextGreaterElement(int arr[]){
         Stack<Integer> stack = new Stack<>();
         int next[] = new int[arr.length];

         for(int i = arr.length-1; i>=0; i--){


            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = -1;
            }else{
                next[i] = arr[stack.peek()];
            }
            stack.push(i);
         }
         return next;
    }

    public int maxAreaHistogram(int[] heights){
        
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        Stack<Integer> stack = new Stack<>();
        //Next Smaller Right
        for(int i=heights.length-1; i>=0; i--){

            while(!stack.isEmpty() && heights[stack.peek()]<=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);

        }

        //Next Smaller left
         stack = new Stack<>();
         for(int i=0; i<heights.length; i++){

            while (!stack.isEmpty() && heights[stack.peek()]>=heights[i] ) {
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
         }

         for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea );

         }
        return maxArea;
    }

    

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int temp[] = nextGreaterElement(arr);

        for (int i : temp) {
            System.out.print(i+" ");
        }
    }
}
