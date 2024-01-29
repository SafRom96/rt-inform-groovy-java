import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> elementCounts = (Map<Integer, Integer>) MainUtil.countElements(array);

        // Вывод результата
        for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}