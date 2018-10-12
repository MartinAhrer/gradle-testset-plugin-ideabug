import shared.*
import spock.lang.Specification

class AssertSpec extends Specification {

    def "can assert" () {
        expect:
        new Assert().assertEquals("a", "a")
    }
}
