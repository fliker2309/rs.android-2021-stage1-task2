package subtask2

import java.util.regex.Pattern

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        val tempA = a.toUpperCase()
        val builder = StringBuilder()
        val charArray = b.toCharArray()
        for (i in charArray){
            builder.append(i).append("\\S*?")
        }

        val pat = builder.toString()
        val pattern = Pattern.compile(pat)
        val matcher = pattern.matcher(tempA)
        return if (matcher.find()) "YES" else "NO"
    }
}
