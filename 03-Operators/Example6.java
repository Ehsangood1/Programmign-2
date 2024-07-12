public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int x;

        // Assignment
        x = 5;
        System.out.println("x = " + x); // x = 5

        // Add and Assign
        x += 3;
        System.out.println("x += 3 -> x = " + x); // x = 8

        // Subtract and Assign
        x -= 2;
        System.out.println("x -= 2 -> x = " + x); // x = 6

        // Multiply and Assign
        x *= 2;
        System.out.println("x *= 2 -> x = " + x); // x = 12

        // Divide and Assign
        x /= 3;
        System.out.println("x /= 3 -> x = " + x); // x = 4

        // Modulus and Assign
        x %= 3;
        System.out.println("x %= 3 -> x = " + x); // x = 1

        // Bitwise AND and Assign
        x = 5; // binary: 0101
        x &= 3; // binary: 0011
        System.out.println("x &= 3 -> x = " + x); // x = 1 (binary: 0001)

        // Bitwise OR and Assign
        x = 5; // binary: 0101
        x |= 3; // binary: 0011
        System.out.println("x |= 3 -> x = " + x); // x = 7 (binary: 0111)

        // Bitwise XOR and Assign
        x = 5; // binary: 0101
        x ^= 3; // binary: 0011
        System.out.println("x ^= 3 -> x = " + x); // x = 6 (binary: 0110)

        // Left Shift and Assign
        x = 5; // binary: 0101
        x <<= 1; // binary: 1010
        System.out.println("x <<= 1 -> x = " + x); // x = 10 (binary: 1010)

        // Right Shift and Assign
        x = 5; // binary: 0101
        x >>= 1; // binary: 0010
        System.out.println("x >>= 1 -> x = " + x); // x = 2 (binary: 0010)

        // Unsigned Right Shift and Assign
        x = 5; // binary: 0101
        x >>>= 1; // binary: 0010
        System.out.println("x >>>= 1 -> x = " + x); // x = 2 (binary: 0010)
    }
}
