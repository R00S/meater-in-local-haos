package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzkt {

    /* renamed from: a */
    public static final int f26439a;

    /* renamed from: b */
    public static final UUID f26440b;

    /* renamed from: c */
    private static final UUID f26441c;

    /* renamed from: d */
    private static final UUID f26442d;

    /* renamed from: e */
    private static final UUID f26443e;

    static {
        f26439a = zzsy.f27024a < 23 ? 1020 : 6396;
        f26440b = new UUID(0L, 0L);
        f26441c = new UUID(1186680826959645954L, -5988876978535335093L);
        f26442d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f26443e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m20189a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 / 1000;
    }

    /* renamed from: b */
    public static long m20190b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 * 1000;
    }
}
