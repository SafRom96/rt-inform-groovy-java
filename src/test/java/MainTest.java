import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testCountElements() {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> elementCounts = (Map<Integer, Integer>) MainUtil.countElements(array);

        // Проверка результата
        assertEquals(2, elementCounts.get(1));
        assertEquals(1, elementCounts.get(3));
        assertEquals(2, elementCounts.get(4));
        assertEquals(2, elementCounts.get(5));
    }
}