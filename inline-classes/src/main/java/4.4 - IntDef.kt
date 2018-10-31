



enum class ThreeStateEnum(val wrapped: Int) {
    FIRST_STATE(1),
    SECOND_STATE(2),
    THIRD_STATE(3)
}


const val FIRST_STATE = 1


///------------------------------

inline class ThreeState(val value: Int)

object PerfMatters {
    val FIRST_STATE = ThreeState(1)
    val SECOND_STATE = ThreeState(2)
    val THIRD_STATE = ThreeState(3)
}

val v = PerfMatters.FIRST_STATE

// java
fun perfMattersPrint(p: ThreeState) {
    println(p)

    when (p) {
        PerfMatters.FIRST_STATE -> println("First state")
    }
}

fun test() {
    perfMattersPrint(PerfMatters.FIRST_STATE)
}
