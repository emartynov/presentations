
import android.support.annotation.StringRes

inline class StringRes(@StringRes val value: Int)

object R {
    object id {
        const val some_view = 5
    }
}

val res = StringRes(R.id.some_view)

@StringRes val res1 = R.id.some_view
