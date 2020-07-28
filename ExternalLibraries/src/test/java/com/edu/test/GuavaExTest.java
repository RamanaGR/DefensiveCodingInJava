package com.edu.test;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuavaExTest {
    /**
     * Guava is an open source, Java-based library developed by Google. It facilitates best coding practices and helps
     * reduce coding errors. It provides utility methods for collections, caching, primitives support, concurrency,
     * common annotations, string processing, I/O, and validations. This tutorial adopts a simple and intuitive way to
     * describe the basic-to-advanced concepts of Guava and how to use its APIs.
     * <p>
     * https://github.com/google/guava/wiki
     * https://github.com/google/guava/tree/master/guava-tests/test/com/google/common/base
     */

    public static void main(String[] args) {

    }

    private static final String NON_NULL_STRING = "foo";


    @Test
    public void testPadStart_somePadding() {
        assertEquals("-", Strings.padStart("", 1, '-'));
        assertEquals("--", Strings.padStart("", 2, '-'));
        assertEquals("-x", Strings.padStart("x", 2, '-'));
        assertEquals("--x", Strings.padStart("x", 3, '-'));
        assertEquals("-xx", Strings.padStart("xx", 3, '-'));
    }

    public void testRepeat() {
        String input = "20";
        assertEquals("", Strings.repeat(input, 0));
        assertEquals("20", Strings.repeat(input, 1));
        assertEquals("2020", Strings.repeat(input, 2));
        assertEquals("202020", Strings.repeat(input, 3));

        assertEquals("", Strings.repeat("", 4));

        for (int i = 0; i < 100; ++i) {
            assertEquals(2 * i, Strings.repeat(input, i).length());
        }
    }

    public void testNullToEmpty() {
        assertEquals("", Strings.nullToEmpty(null));
        assertEquals("", Strings.nullToEmpty(""));
        assertEquals("a", Strings.nullToEmpty("a"));
    }

    public void testEmptyToNull() {
        assertNull(Strings.emptyToNull(null));
        assertNull(Strings.emptyToNull(""));
        assertEquals("a", Strings.emptyToNull("a"));
    }

    public void testIsNullOrEmpty() {
        assertTrue(Strings.isNullOrEmpty(null));
        assertTrue(Strings.isNullOrEmpty(""));
        assertFalse(Strings.isNullOrEmpty("a"));
    }


    public void testCheckState_simple_success() {
        Preconditions.checkState(true);
    }

    public void testCheckState_simple_failure() {
        try {
            Preconditions.checkState(false);
            fail("no exception thrown");
        } catch (IllegalStateException expected) {
        }
    }


    public void testCheckNotNull_simple_success() {
        String result = Preconditions.checkNotNull(NON_NULL_STRING);
        assertSame(NON_NULL_STRING, result);
    }

    public void testCheckNotNull_simple_failure() {
        try {
            Preconditions.checkNotNull(null);
            fail("no exception thrown");
        } catch (NullPointerException expected) {
        }
    }

}
