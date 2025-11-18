package com.airbnb.epoxy;

/* compiled from: IdUtils.java */
/* renamed from: com.airbnb.epoxy.y */
/* loaded from: classes.dex */
public final class C5172y {
    /* renamed from: a */
    public static long m9368a(long j2) {
        long j3 = j2 ^ (j2 << 21);
        long j4 = j3 ^ (j3 >>> 35);
        return j4 ^ (j4 << 4);
    }

    /* renamed from: b */
    public static long m9369b(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long jCharAt = -3750763034362895579L;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            jCharAt = (jCharAt ^ charSequence.charAt(i2)) * 1099511628211L;
        }
        return jCharAt;
    }
}
