import kotlin.random.Random

val data =  runCatching {
    getRealData()
}.getOrNull()

fun getRealData(): String {
    val success = Random.nextBoolean()
    return if (success) "Success"
    else throw IllegalStateException("Unsuccess")
}
