class Converter {
    def arabicNumbers = [10, 9, 5, 4, 1]
    def romanNumerals = ["X", "IX", "V", "IV", "I"]
    def result = []

    String toRomanNumeral(int integer) {

        arabicNumbers.eachWithIndex { number, index ->
            while (number <= integer) {
                result << romanNumerals[index]
                integer = integer - number
            }
        }
        return result.join()
    }
}
