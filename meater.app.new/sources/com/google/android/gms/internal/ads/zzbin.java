package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public final class zzbin {

    /* renamed from: a */
    private final int f23070a;

    /* renamed from: b */
    public final int f23071b;

    /* renamed from: c */
    public final int f23072c;

    private zzbin(int i2, int i3, int i4) {
        this.f23070a = i2;
        this.f23072c = i3;
        this.f23071b = i4;
    }

    /* renamed from: b */
    public static zzbin m17735b() {
        return new zzbin(0, 0, 0);
    }

    /* renamed from: c */
    public static zzbin m17736c() {
        return new zzbin(4, 0, 0);
    }

    /* renamed from: d */
    public static zzbin m17737d() {
        return new zzbin(5, 0, 0);
    }

    /* renamed from: i */
    public static zzbin m17738i(zzyd zzydVar) {
        return zzydVar.f27450i ? new zzbin(3, 0, 0) : zzydVar.f27455n ? new zzbin(2, 0, 0) : zzydVar.f27454m ? m17735b() : m17739j(zzydVar.f27452k, zzydVar.f27449h);
    }

    /* renamed from: j */
    public static zzbin m17739j(int i2, int i3) {
        return new zzbin(1, i2, i3);
    }

    /* renamed from: a */
    public final boolean m17740a() {
        return this.f23070a == 2;
    }

    /* renamed from: e */
    public final boolean m17741e() {
        return this.f23070a == 3;
    }

    /* renamed from: f */
    public final boolean m17742f() {
        return this.f23070a == 0;
    }

    /* renamed from: g */
    public final boolean m17743g() {
        return this.f23070a == 4;
    }

    /* renamed from: h */
    public final boolean m17744h() {
        return this.f23070a == 5;
    }
}
