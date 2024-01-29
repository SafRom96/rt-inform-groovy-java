class MainUtil {
    static def countElements(list) {
        def elementCountMap = [:].withDefault { 0 }

        list.each { element ->
            elementCountMap[element]++
        }

        return elementCountMap
    }
}