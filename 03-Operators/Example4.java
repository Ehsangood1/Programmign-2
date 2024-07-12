public class UnaryOperatorsExample {
    public static void main(String[] args) {
        int a = 5;
        int b = -a; // Unary minus
        int c = +a; // Unary plus (redundant)
        
        System.out.println("a = " + a); // a = 5
        System.out.println("b = " + b); // b = -5
        System.out.println("c = " + c); // c = 5

        // Increment and Decrement
        int x = 10;
        System.out.println("x before increment: " + x); // x = 10
        System.out.println("x after prefix increment: " + (++x)); // x = 11
        System.out.println("x after postfix increment: " + (x++)); // x = 11, but then increments to 12
        System.out.println("x now: " + x); // x = 12

        int y = 10;
        System.out.println("y before decrement: " + y); // y = 10
        System.out.println("y after prefix decrement: " + (--y)); // y = 9
        System.out.println("y after postfix decrement: " + (y--)); // y = 9, but then decrements to 8
        System.out.println("y now: " + y); // y = 8

        // Logical Complement
        boolean flag = true;
        System.out.println("flag before: " + flag); // flag = true
        flag = !flag;
        System.out.println("flag after: " + flag); // flag = false
    }
