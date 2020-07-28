package com.edu.examples;


import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;


import java.io.File;

public class CommonsEx {
    public static void main(String[] args) {
        boolean os = SystemUtils.IS_OS_MAC_OSX_PUMA;
        String javaHome = SystemUtils.JAVA_HOME;
        File java = SystemUtils.getJavaHome();
        boolean version = SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_0_9);
        System.out.println(version);
    }

    private void method1(String str) {
        if(str == null && str.isEmpty()){
            throw new IllegalArgumentException("Emptu or Null input Not allowed ");
        }
        if(StringUtils.isEmpty(str)){
            throw new IllegalArgumentException("Emptu or Null input Not allowed ");
        }
    }
   //https://www.baeldung.com/java-commons-lang-3

}
