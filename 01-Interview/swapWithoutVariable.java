class SwapWithoutVariable{
    public static void main(String[] args) {
        int a = 10; // First Number
        int b = 20; // Second Number
        System.out.println("Initially : a = " + a + ", b = " + b);
        a = a + b; // Update value of a
        b = a - b; // Now b becomes 10
        a = a - b; // Now a becomes 20
        System.out.println("After swapping : a = " + a + ", b = " + b);
    }
}