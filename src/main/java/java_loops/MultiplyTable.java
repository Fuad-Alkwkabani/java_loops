package java_loops;

import java.util.ArrayList;
import java.util.List;

public class MultiplyTable {

    private static List<String> table = new ArrayList<>();

    // Método para generar la tabla de multiplicar de un número dado
    public static void generateTabla(int numb) {
        table.clear(); // Limpiamos la tabla si ya tenía datos
        for (int i = 1; i <= 10; i++) {
            int result = numb * i;
            table.add(numb + " X " + i + " = " + result);
        }
    }

    // Método para obtener la tabla generada
    public static List<String> getTable() {
        return table;
    }
}
