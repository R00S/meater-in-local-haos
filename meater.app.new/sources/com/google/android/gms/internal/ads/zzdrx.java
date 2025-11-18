package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdrx {
    /* renamed from: a */
    private static void m19826a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            if (!(obj instanceof zzdrw)) {
                String strM19828c = m19828c(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strM19828c);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String strConcat = (String) obj;
                    if (!strConcat.startsWith("http") && strConcat.length() > 200) {
                        strConcat = String.valueOf(strConcat.substring(0, 200)).concat("[...]");
                    }
                    int length = strConcat.length();
                    StringBuilder sb = new StringBuilder(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = strConcat.charAt(i2);
                        if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                            sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(string);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    stringBuffer2.append('\"');
                    for (byte b2 : (byte[]) obj) {
                        int i3 = b2 & 255;
                        if (i3 == 92 || i3 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) i3);
                        } else if (i3 < 32 || i3 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                        } else {
                            stringBuffer2.append((char) i3);
                        }
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(m19828c(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        m19826a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i4 = 0; i4 < length3; i4++) {
                            m19826a(name, Array.get(obj2, i4), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        String strValueOf = String.valueOf(strSubstring);
                        if (((Boolean) cls.getMethod(strValueOf.length() != 0 ? "has".concat(strValueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String strValueOf2 = String.valueOf(strSubstring);
                            m19826a(strSubstring, cls.getMethod(strValueOf2.length() != 0 ? "get".concat(strValueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    /* renamed from: b */
    public static <T extends zzdrw> String m19827b(T t) throws SecurityException, IllegalArgumentException {
        if (t == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m19826a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            return strValueOf.length() != 0 ? "Error printing proto: ".concat(strValueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e3) {
            String strValueOf2 = String.valueOf(e3.getMessage());
            return strValueOf2.length() != 0 ? "Error printing proto: ".concat(strValueOf2) : new String("Error printing proto: ");
        }
    }

    /* renamed from: c */
    private static String m19828c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }
}
