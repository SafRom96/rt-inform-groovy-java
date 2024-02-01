import groovy.util.GroovyTestCase

class MainUtilTest extends GroovyTestCase {
    void testCountElements() {
        def inputList = [1, 3, 4, 5, 1, 5, 4]
        def result = MainUtil.countElements(inputList)
        assert result.size() == 4
        assert result[1] == 2
        assert result[3] == 1
        assert result[4] == 2
        assert result[5] == 2
    }

    void testCountElementsWithEmptyList() {
        def result = MainUtil.countElements([])
        assert result.isEmpty()
    }

    void testCountElementsWithSingleElement() {
        def result = MainUtil.countElements([1])
        assert result.size() == 1
        assert result[1] == 1
    }
}