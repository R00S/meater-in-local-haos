package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public final class zzs {
    /* renamed from: a */
    public static int m20930a(int i2, int i3, String str) {
        String strM20934a;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strM20934a = zzy.m20934a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException("negative size: " + i3);
            }
            strM20934a = zzy.m20934a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strM20934a);
    }

    /* renamed from: b */
    public static int m20931b(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m20933d(i2, i3, "index"));
        }
        return i2;
    }

    /* renamed from: c */
    public static void m20932c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? m20933d(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? m20933d(i3, i4, "end index") : zzy.m20934a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    /* renamed from: d */
    private static String m20933d(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzy.m20934a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzy.m20934a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }
}
