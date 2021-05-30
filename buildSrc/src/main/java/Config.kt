import org.gradle.api.Project

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

object Config {
    const val id = "com.mcoresoftware.applogger"
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30

    @JvmStatic
    private fun generateDebugVersionName(): String {
        val today = Date()
        return SimpleDateFormat("1.0.yyww", Locale.US).format(today)
    }

    @JvmStatic
    fun releaseVersionName(project: Project): String {
        val today = Date()
        return if (project.hasProperty("versionName")) {
            val versionName = project.property("versionName") as String
            val date = SimpleDateFormat(".yyww", Locale.US).format(today)
            versionName + date
        } else ""
    }

    @ExperimentalStdlibApi
    @JvmStatic
    fun generateBuildDate(): String {
        val dateTime = LocalDateTime.now()
        val timeFormatter = DateTimeFormatter.ofPattern("h:mm a")

        return "${dateTime.dayOfWeek.toString().toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)} ${dateTime.monthValue}/${dateTime.dayOfMonth} @ ${timeFormatter.format(dateTime)}"
    }
}