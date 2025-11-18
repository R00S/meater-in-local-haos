package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzlr {

    /* renamed from: a */
    public static final zzlr f26496a = new t00();

    /* renamed from: a */
    public final boolean m20216a() {
        return mo15900g() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m20217b(int r3, com.google.android.gms.internal.ads.zzlt r4, com.google.android.gms.internal.ads.zzlu r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.mo15897c(r3, r4, r0)
            r2.m20218d(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.mo15900g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.mo15900g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.m20218d(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlr.m20217b(int, com.google.android.gms.internal.ads.zzlt, com.google.android.gms.internal.ads.zzlu, int):int");
    }

    /* renamed from: c */
    public abstract zzlt mo15897c(int i2, zzlt zzltVar, boolean z);

    /* renamed from: d */
    public final zzlu m20218d(int i2, zzlu zzluVar, boolean z) {
        return mo15898e(i2, zzluVar, false, 0L);
    }

    /* renamed from: e */
    public abstract zzlu mo15898e(int i2, zzlu zzluVar, boolean z, long j2);

    /* renamed from: f */
    public abstract int mo15899f(Object obj);

    /* renamed from: g */
    public abstract int mo15900g();

    /* renamed from: h */
    public abstract int mo15901h();
}
