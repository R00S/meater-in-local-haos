package com.google.gson.p215t;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PreJava9DateFormatProvider.java */
/* renamed from: com.google.gson.t.j */
/* loaded from: classes2.dex */
public class C8597j {
    /* renamed from: a */
    private static String m27105a(int i2) {
        if (i2 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i2 == 1) {
            return "MMMM d, yyyy";
        }
        if (i2 == 2) {
            return "MMM d, yyyy";
        }
        if (i2 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
    }

    /* renamed from: b */
    private static String m27106b(int i2) {
        if (i2 == 0 || i2 == 1) {
            return "h:mm:ss a z";
        }
        if (i2 == 2) {
            return "h:mm:ss a";
        }
        if (i2 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
    }

    /* renamed from: c */
    public static DateFormat m27107c(int i2, int i3) {
        return new SimpleDateFormat(m27105a(i2) + " " + m27106b(i3), Locale.US);
    }
}
