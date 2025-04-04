package cie;

public class temp1 {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
