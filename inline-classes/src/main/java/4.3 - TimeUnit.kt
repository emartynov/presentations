interface TimeUnit {
    fun toSeconds(): Seconds
}

inline class Seconds(val value: Long) : TimeUnit {
    override fun toSeconds() = this
}

inline class Minutes(val value: Long) : TimeUnit {
    override fun toSeconds() = Seconds(60 * value)
}

inline class Hours(val value: Long) : TimeUnit {
    override fun toSeconds() = Minutes(60 * value).toSeconds()
}

inline class Days(val value: Long) : TimeUnit {
    override fun toSeconds() = Hours(24 * value).toSeconds()
}

// ---

val days = Days(2)
val seconds = Seconds(30)

fun runSportSprint(seconds: Seconds) {}

fun testSeconds() {
    runSportSprint(seconds)
}

