package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2468e4 {

    /* renamed from: a, reason: collision with root package name */
    private final zzjn f34104a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34105b;

    public final Y3 a() {
        this.f34104a.I();
        return new C2484g4(this.f34105b);
    }

    public final zzjn b() {
        return this.f34104a;
    }

    private C2468e4(int i10) {
        byte[] bArr = new byte[i10];
        this.f34105b = bArr;
        this.f34104a = zzjn.H(bArr);
    }
}
