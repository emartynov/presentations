import android.support.annotation.NonNull;

public class Email1 {
    private final String value;

    public Email1(@NonNull String value) {
        if (value.isEmpty())
            throw new IllegalArgumentException("Email can not be empty");

        // TODO: Proper regexp check if email is correct
        if (value.indexOf('@') == -1)
            throw new IllegalArgumentException("Email should contain `@` symbol");

        this.value = value;
    }

    @NonNull
    public String getValue() {
        return value;
    }
}
