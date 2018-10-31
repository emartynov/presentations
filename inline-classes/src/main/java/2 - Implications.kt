/*
inline class Seconds2() // nope - needs to accept a value!

inline class Minutes2(value: Int) // nope - value needs to be a property

inline class Hours2(var value: Int) // nope - property needs to be read-only

inline class Days2(val value: Int) // yes!
inline class Months2(val count: Int) // yes! - name it what you want

inline class Years2 private constructor(val value: Int) // nope - constructor must be public

inline class Decades2(private val value: Int)  // yes!

inline class Centuries(val value: Int) {
    // nope - "Inline class cannot have an initializer block"
    init {
        require(value >= 0)
    }
}

inline class Minutes4(val minutes: Long)  // yes!
{
    fun toSeconds() = Seconds(60 * minutes)
}

// nope - "Inline class must have exactly one primary constructor parameter"
inline class Years3(val count: Int, val startYear: Int = 12)

open class TimeUnit2
inline class Seconds3(val value: Int) : TimeUnit2() // nope - cannot extend classes

open inline class Minutes3(val value: Int) // nope - "Inline classes can only be final"

class Outer {
    // nope - "Inline classes are only allowed on top level"
    inline class Inner(val value: Int)
}

// nope enums can not be inline classes
inline enum class TimeUnits(val value: Int) {
    SECONDS_PER_MINUTE(60),
    MINUTES_PER_HOUR(60),
    HOURS_PER_DAY(24)
}

// nope identity operator is forbidden for inline classes
val d1 = Days2(2)
val d2 = Days2(2)
val e = d1 === d2
*/
