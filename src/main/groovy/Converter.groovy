class Converter {
    def arabicNumbers = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    def romanNumerals = ["M","CM","D","CD","C","XC","L", "XL", "X", "IX", "V", "IV", "I"]
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
