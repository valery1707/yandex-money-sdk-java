package com.yandex.money.utils;

/**
 * @author Slava Yasevich (vyasevich@yamoney.ru)
 */
public final class Strings {

    private Strings() {
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
