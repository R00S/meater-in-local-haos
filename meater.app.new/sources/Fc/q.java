package Fc;

import java.nio.charset.StandardCharsets;

/* compiled from: MqttTopic.java */
/* loaded from: classes3.dex */
public class q {
    public static boolean a(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        b(str, true);
        b(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length2 && i11 < length && ((str2.charAt(i11) != '/' || str.charAt(i10) == '/') && (str.charAt(i10) == '+' || str.charAt(i10) == '#' || str.charAt(i10) == str2.charAt(i11)))) {
            if (str.charAt(i10) == '+') {
                int i12 = i11 + 1;
                while (i12 < length && str2.charAt(i12) != '/') {
                    i12 = i11 + 2;
                    i11++;
                }
            } else if (str.charAt(i10) == '#') {
                i11 = length - 1;
            }
            i10++;
            i11++;
        }
        return i11 == length && i10 == length2;
    }

    public static void b(String str, boolean z10) {
        int length = str.getBytes(StandardCharsets.UTF_8).length;
        if (length < 1 || length > 65535) {
            throw new IllegalArgumentException(String.format("Invalid topic length, should be in range[%d, %d]!", 1, 65535));
        }
        if (!z10) {
            if (Mc.b.a(str, "#+")) {
                throw new IllegalArgumentException("The topic name MUST NOT contain any wildcard characters (#+)");
            }
        } else {
            if (Mc.b.d(str, new String[]{"#", "+"})) {
                return;
            }
            if (Mc.b.c(str, "#") <= 1 && (!str.contains("#") || str.endsWith("/#"))) {
                c(str);
                return;
            }
            throw new IllegalArgumentException("Invalid usage of multi-level wildcard in topic string: " + str);
        }
    }

    private static void c(String str) {
        char cCharAt = "+".charAt(0);
        char cCharAt2 = "/".charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 - 1;
            char c10 = i11 >= 0 ? charArray[i11] : (char) 0;
            int i12 = i10 + 1;
            char c11 = i12 < length ? charArray[i12] : (char) 0;
            if (charArray[i10] == cCharAt && ((c10 != cCharAt2 && c10 != 0) || (c11 != cCharAt2 && c11 != 0))) {
                throw new IllegalArgumentException(String.format("Invalid usage of single-level wildcard in topic string '%s'!", str));
            }
            i10 = i12;
        }
    }
}
