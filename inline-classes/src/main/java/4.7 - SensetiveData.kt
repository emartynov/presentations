inline class Password(val password: String)
inline class Username(val username: String)

fun login(username: Username, password: Password) {}

fun auth() {
    val username = Username("me")
    val password = Password("123")
    login(username, password)
}
