package fit.core;

import java.util.function.Function;

public class FuncLogger {

    public static Function<String, String> create(String prefix) {
        return create(prefix, " ");
    }

    private static Function<String, String> create(String prefix, String separator) {
        return str -> {
            var text = String.format("%s%s%s", prefix, separator, str);
            System.out.println(text);

            return text;
        };
    }
}
