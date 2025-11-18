package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

/* loaded from: classes2.dex */
public class BeanUtil {
    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        return rawType != null && rawType.isArray() && (packageName = ClassUtil.getPackageName(rawType.getComponentType())) != null && packageName.contains(".cglib") && (packageName.startsWith("net.sf.cglib") || packageName.startsWith("org.hibernate.repackage.cglib") || packageName.startsWith("org.springframework.cglib"));
    }

    protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        return (rawType == null || rawType.isArray() || (packageName = ClassUtil.getPackageName(rawType)) == null || !packageName.startsWith("groovy.lang")) ? false : true;
    }

    protected static String legacyManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char cCharAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        while (true) {
            i2++;
            if (i2 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i2, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z) {
        String name = annotatedMethod.getName();
        String strOkNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z);
        return strOkNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z) : strOkNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z ? stdManglePropertyName(str, 2) : legacyManglePropertyName(str, 2);
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String name = annotatedMethod.getName();
        if (!name.startsWith(str)) {
            return null;
        }
        int length = str.length();
        return z ? stdManglePropertyName(name, length) : legacyManglePropertyName(name, length);
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return z ? stdManglePropertyName(str, 3) : legacyManglePropertyName(str, 3);
    }

    protected static String stdManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char cCharAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i2);
        }
        int i3 = i2 + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i3, length);
        return sb.toString();
    }
}
