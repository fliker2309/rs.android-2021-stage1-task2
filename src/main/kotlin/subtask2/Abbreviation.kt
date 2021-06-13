package subtask2

import java.util.regex.Pattern

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        //b - regex
        //tempA string
        val tempA = a.toUpperCase()
        val pattern = Pattern.compile(b)
        val matcher = pattern.matcher(tempA)

        return if (matcher.find()) "YES" else "NO"
    }
}
