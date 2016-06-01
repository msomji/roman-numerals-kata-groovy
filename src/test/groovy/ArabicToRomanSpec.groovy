import spock.lang.Specification


class ArabicToRomanSpec extends Specification {

    def arabicToRoman = new Converter()


    def "should return I when Input is 1"() {
        expect:
        arabicToRoman.toRomanNumeral(1) == "I"
    }

    def "should return II when input is 2"() {
        expect:
        arabicToRoman.toRomanNumeral(2) == "II"

    }

    def "should return II when input is 3"() {
        expect:
        arabicToRoman.toRomanNumeral(3) == "III"

    }
}