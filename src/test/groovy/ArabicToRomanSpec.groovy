import spock.lang.Specification


class ArabicToRomanSpec extends Specification {
    def arabicToRoman = new ArabicToRoman()


    def "should return I when Input is 1"() {
        expect:
        arabicToRoman.convert(1) == "I"
    }
}