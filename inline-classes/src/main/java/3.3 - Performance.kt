inline class Email4(val email: String?)

fun printEmail(v: Email4?) {}

fun test5() {
    val email4 = Email4("hello@mom.com")
    printEmail(email4)
}
