import spock.lang.Specification


class ArabicToRomanSpec extends Specification {

    def underTest = new Converter()

    def "should return I when Input is 1"() {
        expect:
        underTest.toRomanNumeral(1) == "I"
    }

    def "should return II when input is 2"() {
        expect:
        underTest.toRomanNumeral(2) == "II"
    }

    def "should return II when input is 3"() {
        expect:
        underTest.toRomanNumeral(3) == "III"
    }

    def "should return IV when input is 4"() {
        expect:
        underTest.toRomanNumeral(4) == "IV"
    }

    def "should return V when input is 5"() {
        expect:
        underTest.toRomanNumeral(5) == "V"
    }

    def "should return VIII when input is 8"() {
        expect:
        underTest.toRomanNumeral(8) == "VIII"
    }
}