package java_loops;

import java.util.Scanner;
import java.util.List;

public class MainView {

    // Método para solicitar un número al usuario
    public int index() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para la tabla de multiplicar: ");
        int numb = scanner.nextInt();
        scanner.close();
        return numb;
    }

    // Método para renderizar o mostrar la tabla de multiplicar en la consola
    public void render(List<String> table) {
        System.out.println("Tabla de multiplicar:");
        for (String line : table) {
            System.out.println(line);
        }
    }
}


