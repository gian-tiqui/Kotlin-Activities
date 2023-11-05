package fundamentals.variables

import kotlin.reflect.typeOf

class Datatypes {

    fun run() {

        // We can create variables without declaring their types

        var num = 7
        var floatingNum = 7.0
        var bool = true
        var letter = 'G'
        var word = "Da string"

        // But we can also specify their types if you want your program to be strict

        var num2: Int = 12
        var floatingNum2: Double = 12.0
        var bool2: Boolean = false
        var letter2: Char = 'K'
        var word2: String = "Da string 2"

        // Misc datatypes

        var byeNum: Byte = 120
        var shortNum: Short = 19238
        var longNum: Long = 1092319283910238901

        // Print the type of a variable using ${variableName::class.simpleName}

        println(num::class.simpleName)
    }

    fun exercise() {

        /*
        * Create five variables with different data types
        * Output all those variables next to their types using variable::class.simpleName
         */
    }
}