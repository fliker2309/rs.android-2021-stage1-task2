package subtask2

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {


        val tempA = a.toUpperCase()

        val matchResult = Regex(tempA).find(b) ?: return "NO"
        return matchResult.toString()

    }
}
