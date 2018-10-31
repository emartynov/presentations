inline class DollarAmount(val amount: Int)
inline class EuroAmount(val amount: Int)

fun payGoodsInEuro(euros: EuroAmount) {}
fun payGoodsInDollars(dollars: DollarAmount) {}

val euros = EuroAmount(5)
val dollars = DollarAmount(5)

fun test3() {
    payGoodsInDollars(dollars)
}

data class Amount(val amount: Int, val currency: String)

inline class DollarAmount2(val amount: Amount)

fun dollarAmount(amount: Int) = Amount(amount, "USD")
