package com.edu.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean isValidEmail(String str) {
        Pattern validEmail =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    Matcher matcher = validEmail.matcher(str);
    return matcher.find();
    }
}
