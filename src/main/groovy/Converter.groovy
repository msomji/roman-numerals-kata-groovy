class Converter {
    def result = []

    String toRomanNumeral(int integer) {
        while (integer > 0){
            if(integer >= 5){
                integer = incrementBy5(integer)
            }else if(integer >=4){
                integer = incrementBy4(integer)
            }else {
                integer = incrementBy1(integer)
            }
        }

        return result.join()
    }

    private int incrementBy5(int integer) {
        result << "V"
        integer = integer - 5
        integer
    }

    private int incrementBy4(int integer) {
        result << "IV"
        integer = integer - 4
        integer
    }

    private int incrementBy1(int integer) {
        result << 'I'
        integer = integer - 1
        integer
    }
    
}
