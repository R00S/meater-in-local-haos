package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2516k4 extends AbstractC2524l4 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f34181c;

    /* renamed from: d, reason: collision with root package name */
    private int f34182d;

    /* renamed from: e, reason: collision with root package name */
    private int f34183e;

    /* renamed from: f, reason: collision with root package name */
    private int f34184f;

    /* renamed from: g, reason: collision with root package name */
    private int f34185g;

    /* renamed from: h, reason: collision with root package name */
    private int f34186h;

    private final void f() {
        int i10 = this.f34182d + this.f34183e;
        this.f34182d = i10;
        int i11 = i10 - this.f34185g;
        int i12 = this.f34186h;
        if (i11 <= i12) {
            this.f34183e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f34183e = i13;
        this.f34182d = i10 - i13;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2524l4
    public final int a(int i10) throws zzkp {
        if (i10 < 0) {
            throw zzkp.d();
        }
        int iD = i10 + d();
        if (iD < 0) {
            throw zzkp.e();
        }
        int i11 = this.f34186h;
        if (iD > i11) {
            throw zzkp.g();
        }
        this.f34186h = iD;
        f();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2524l4
    public final int d() {
        return this.f34184f - this.f34185g;
    }

    private C2516k4(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f34186h = Integer.MAX_VALUE;
        this.f34181c = bArr;
        this.f34182d = i11 + i10;
        this.f34184f = i10;
        this.f34185g = i10;
    }
}
