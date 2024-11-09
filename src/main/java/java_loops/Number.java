package java_loops;

import java.util.Scanner;

public class Number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        System.out.print("Ingresa un numero: ");
        int n =scanner.nextInt();
        printNumber(n);
        scanner.close();
    }   


public static void printNumber(int n){
    for( int i=1 ; i<=10 ;i++) {
        int result = n * i;
        System.out.println(n + "X" +i + "=" + result);
    }
}
}

