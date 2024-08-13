class Add {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    float add(float a, float b) {
        return a + b;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
}
class display{
    public static void main(String args[]) {
        Add ob = new Add();
        System.out.println("Sum of two integers: " + ob.add(10, 20));
        System.out.println("Sum of three integers: " + ob.add(10, 20, 30));
        System.out.println("Sum of two floats: " + ob.add(1.5f, 2.5f));
        System.out.println("Sum of three doubles: " + ob.add(10.5, 20.5, 30.5));
    }
}
