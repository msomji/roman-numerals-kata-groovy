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

    def "should return IX when input is 9"() {
        expect:
        underTest.toRomanNumeral(9) == "IX"
    }

    def "should return X when input is 10"() {
        expect:
        underTest.toRomanNumeral(10) == "X"
    }

    def "should return XLV when input is 45"() {
        expect:
        underTest.toRomanNumeral(45) == "XLV"
    }

    def "should return L when input is 50"() {
        expect:
        underTest.toRomanNumeral(50) == "L"
    }

    def "should return XC when input is 90"() {
        expect:
        underTest.toRomanNumeral(90) == "XC"
    }

    def "should return C when input is 100"() {
        expect:
        underTest.toRomanNumeral(100) == "C"
    }

    def "should return CD when input is 400"() {
        expect:
        underTest.toRomanNumeral(400) == "CD"
    }

    def "should return D when input is 500"() {
        expect:
        underTest.toRomanNumeral(500) == "D"
    }

    def "should return CM when input is 900"() {
        expect:
        underTest.toRomanNumeral(900) == "CM"
    }

    def "should return M when input is 1000"() {
        expect:
        underTest.toRomanNumeral(1000) == "M"
    }

    def "should return CMXLVIII when input is 948"() {
        expect:
        underTest.toRomanNumeral(948) == "CMXLVIII"
    }
}