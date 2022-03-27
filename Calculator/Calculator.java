class Calculator {
    public static void main(String[] args) {
        double a = addition(9, 5);
        double b = subtraction(9, 5);
        double c = multiplier(9, 5);
        double d = division(9, 5);
        System.out.println("addition = " + a +" \n" + "subtraction = " + b +" \n" + "multiplier = " + c +" \n" + "division = " + d);  
    }
    public static int addition(int a, int b) {
        return a+b;
    }
    public static int subtraction(int a, int b) {
        return a-b;
    }
    public static double multiplier(double a, double b) {
        return a*b;
    }
    public static double division(double a, double b) {
        return a/b;
    }
}
