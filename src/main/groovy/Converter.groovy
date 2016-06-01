class Converter {
    String toRomanNumeral(int integer) {
        def result = []

        for (integer; integer > 0; --integer) {
            result << 'I'
        }

        return result.join()
    }
}
