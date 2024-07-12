public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using the ternary operator to find the minimum value
        int min = (a < b) ? a : b;
        System.out.println("The minimum value is " + min); // Output: The minimum value is 10

        // Using the ternary operator to find the maximum value
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is " + max); // Output: The maximum value is 20

        // Using the ternary operator to check if a number is even or odd
        String result = (a % 2 == 0) ? "even" : "odd";
        System.out.println("a is " + result); // Output: a is even

        // Using the ternary operator to assign a string based on a boolean condition
        boolean flag = true;
        String status = flag ? "active" : "inactive";
        System.out.println("The status is " + status); // Output: The status is active

        // Complex ternary operation
        int age = 18;
        String eligibility = (age >= 18) ? "eligible to vote" : "not eligible to vote";
        System.out.println("The person is " + eligibility); // Output: The person is eligible to vote
    }
}
