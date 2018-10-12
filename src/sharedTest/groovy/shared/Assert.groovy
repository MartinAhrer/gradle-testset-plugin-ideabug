package shared

class Assert {
    boolean assertEquals(def left, def right) {
        println "$left, $right"
        left == right
    }
}
