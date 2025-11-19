package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2524l4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f34198b = 100;

    /* renamed from: a, reason: collision with root package name */
    private int f34199a;

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static AbstractC2524l4 c(byte[] bArr, int i10, int i11, boolean z10) {
        C2516k4 c2516k4 = new C2516k4(bArr, i11);
        try {
            c2516k4.a(i11);
            return c2516k4;
        } catch (zzkp e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int a(int i10);

    public abstract int d();

    private AbstractC2524l4() {
        this.f34199a = f34198b;
    }
}
