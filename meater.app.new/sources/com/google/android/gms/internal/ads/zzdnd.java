package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzdnd {

    /* renamed from: a */
    int f25665a;

    /* renamed from: b */
    int f25666b;

    /* renamed from: c */
    private int f25667c;

    /* renamed from: d */
    C7093qu f25668d;

    /* renamed from: e */
    private boolean f25669e;

    private zzdnd() {
        this.f25666b = 100;
        this.f25667c = Integer.MAX_VALUE;
        this.f25669e = false;
    }

    /* renamed from: B */
    public static int m19606B(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* renamed from: v */
    static zzdnd m19607v(byte[] bArr, int i2, int i3, boolean z) {
        C7056pu c7056pu = new C7056pu(bArr, i2, i3, z);
        try {
            c7056pu.mo15783z(i3);
            return c7056pu;
        } catch (zzdok e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: w */
    public static long m19608w(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    /* renamed from: A */
    public abstract void mo15759A(int i2);

    /* renamed from: a */
    public abstract double mo15760a() throws IOException;

    /* renamed from: b */
    public abstract float mo15761b() throws IOException;

    /* renamed from: c */
    public abstract String mo15762c() throws IOException;

    /* renamed from: d */
    public abstract int mo15763d() throws IOException;

    /* renamed from: e */
    public abstract long mo15764e() throws IOException;

    /* renamed from: f */
    public abstract long mo15765f() throws IOException;

    /* renamed from: g */
    public abstract int mo15766g() throws IOException;

    /* renamed from: h */
    public abstract long mo15767h() throws IOException;

    /* renamed from: i */
    public abstract int mo15768i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo15769j() throws IOException;

    /* renamed from: k */
    public abstract String mo15770k() throws IOException;

    /* renamed from: l */
    public abstract zzdmr mo15771l() throws IOException;

    /* renamed from: m */
    public abstract int mo15772m() throws IOException;

    /* renamed from: n */
    public abstract int mo15773n() throws IOException;

    /* renamed from: o */
    public abstract int mo15774o() throws IOException;

    /* renamed from: p */
    public abstract long mo15775p() throws IOException;

    /* renamed from: q */
    public abstract int mo15776q() throws IOException;

    /* renamed from: r */
    public abstract long mo15777r() throws IOException;

    /* renamed from: s */
    abstract long mo15778s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo15779t() throws IOException;

    /* renamed from: u */
    public abstract int mo15780u();

    /* renamed from: x */
    public abstract void mo15781x(int i2) throws zzdok;

    /* renamed from: y */
    public abstract boolean mo15782y(int i2) throws IOException;

    /* renamed from: z */
    public abstract int mo15783z(int i2) throws zzdok;
}
