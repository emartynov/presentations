interface Marker

inline class InlineClass(val v: Int) : Marker

private fun countMarker(m: Marker) {}

fun countInlineClass(i: InlineClass) {}

fun testMarkerAndInlineClass() {
    val inlineClass = InlineClass(4)
    countMarker(inlineClass)
    countInlineClass(inlineClass)
}
