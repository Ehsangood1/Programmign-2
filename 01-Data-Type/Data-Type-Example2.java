public class DataTypesExample {
    public static void main(String[] args) {

// Reference data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};

        // Output reference data types
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using a class
        Person p = new Person();
        p.name = "John";
        p.age = 30;
        System.out.println("Person name: " + p.name);
        System.out.println("Person age: " + p.age);
    }
}

class Person {
    String name;
    int age;
}
