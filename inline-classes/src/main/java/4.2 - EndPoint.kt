const val PRODUCTION = "https://www.production.com"

fun getDataFromServer(endPoint: String): Any {
    return Any()
}

fun callItUnsafe() {
    val data1 = getDataFromServer(PRODUCTION)
    val data2 = getDataFromServer("my wrongly typed URL")
}

//-------

inline class EndPoint(val url: String)

object Network {
    val PRODUCTION = EndPoint("my production url")
    val INTERNAL = EndPoint("my dev url")
}

fun getDataFromServer(endPoint: EndPoint): Any {
    return Any()
}

fun callItSafe() {
    val data = getDataFromServer(Network.PRODUCTION)
    val data0 = getDataFromServer(EndPoint("trash data"))
}
