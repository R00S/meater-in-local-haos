package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzku extends Exception {

    /* renamed from: f */
    private final int f26444f;

    /* renamed from: g */
    private final int f26445g;

    private zzku(int i2, String str, Throwable th, int i3) {
        super(null, th);
        this.f26444f = i2;
        this.f26445g = i3;
    }

    /* renamed from: a */
    public static zzku m20191a(IOException iOException) {
        return new zzku(0, null, iOException, -1);
    }

    /* renamed from: b */
    public static zzku m20192b(Exception exc, int i2) {
        return new zzku(1, null, exc, i2);
    }

    /* renamed from: c */
    static zzku m20193c(RuntimeException runtimeException) {
        return new zzku(2, null, runtimeException, -1);
    }
}
