package Lesson13;
class MathUtils {
    final int add(int a, int b) {
        return a + b;
    }
}

// Uncommenting the below code would lead to compilation error
/*
class MathExtended extends MathUtils {
    @Override
    int add(int a, int b) {
        return a * b; // This would not compile due to final method being overridden
    }
}
*/

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("Addition: " + math.add(5, 3));
    }
}
