package com.google.zxing.p225i;

/* compiled from: CodaBarReader.java */
/* renamed from: com.google.zxing.i.a */
/* loaded from: classes2.dex */
public final class C8654a extends AbstractC8666m {

    /* renamed from: a */
    static final char[] f32862a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    static final int[] f32863b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    private static final char[] f32864c = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    static boolean m27379a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
