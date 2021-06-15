package subtask1

import java.time.LocalDate
import java.time.DateTimeException
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val formatDate = DateTimeFormatter.ofPattern(("dd MMMM, EEEE"), Locale("ru"))
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(formatDate)

        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
