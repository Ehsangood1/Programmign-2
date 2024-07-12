public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        // Bitwise AND
        int resultAnd = a & b;  // binary: 0001
        System.out.println("a & b = " + resultAnd);  // output: 1

        // Bitwise OR
        int resultOr = a | b;   // binary: 0111
        System.out.println("a | b = " + resultOr);  // output: 7

        // Bitwise XOR
        int resultXor = a ^ b;  // binary: 0110
        System.out.println("a ^ b = " + resultXor);  // output: 6

        // Bitwise Complement
        int resultComplement = ~a;  // binary: 1010 (in two's complement, represents -6)
        System.out.println("~a = " + resultComplement);  // output: -6

        // Left Shift
        int resultLeftShift = a << 1;  // binary: 1010
        System.out.println("a << 1 = " + resultLeftShift);  // output: 10

        // Right Shift
        int resultRightShift = a >> 1;  // binary: 0010
        System.out.println("a >> 1 = " + resultRightShift);  // output: 2

        // Unsigned Right Shift
        int resultUnsignedRightShift = a >>> 1;  // binary: 0010
        System.out.println("a >>> 1 = " + resultUnsignedRightShift);  // output: 2
    }
}
