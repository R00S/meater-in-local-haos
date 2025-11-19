package com.google.android.gms.common.util;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final h f33520a = new h();

    private h() {
    }

    public static e d() {
        return f33520a;
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.e
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
