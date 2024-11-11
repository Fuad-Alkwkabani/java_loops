package java_loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MultiplyTableTest {

    @Test
    void testGenerateTabla() {
        // Lista esperada con los resultados de la tabla de multiplicar del 5
        List<String> expected = new ArrayList<>();
        expected.add("5 X 1 = 5");
        expected.add("5 X 2 = 10");
        expected.add("5 X 3 = 15");
        expected.add("5 X 4 = 20");
        expected.add("5 X 5 = 25");
        expected.add("5 X 6 = 30");
        expected.add("5 X 7 = 35");
        expected.add("5 X 8 = 40");
        expected.add("5 X 9 = 45");
        expected.add("5 X 10 = 50");

        // Llama al método generateTabla de MultiplyTable con el número 5
        MultiplyTable.generateTabla(5);

        // Verifica que la tabla generada es igual a la lista esperada
        assertThat(MultiplyTable.getTable(), is(expected));
    }
}
