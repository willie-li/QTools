package com.beautify.qtools.common;

import com.beautify.qtools.utils.UtilsBridge;

import java.lang.reflect.Type;

/**
 * <pre>
 *     desc  : utils about clone
 * </pre>
 */
public final class CloneUtils {

    private CloneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * Deep clone.
     *
     * @param data The data.
     * @param type The type.
     * @param <T>  The value type.
     * @return The object of cloned.
     */
    public static <T> T deepClone(final T data, final Type type) {
        try {
            return UtilsBridge.fromJson(UtilsBridge.toJson(data), type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}