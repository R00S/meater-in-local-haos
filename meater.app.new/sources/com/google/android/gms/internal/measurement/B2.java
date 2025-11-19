package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class B2 extends F4<B2, a> implements InterfaceC2533m5 {
    private static final B2 zzc;
    private static volatile InterfaceC2612w5<B2> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public static final class a extends F4.a<B2, a> implements InterfaceC2533m5 {
        public final a A(long j10) {
            s();
            B2.N((B2) this.f33731C, j10);
            return this;
        }

        public final a B(String str) {
            s();
            B2.O((B2) this.f33731C, str);
            return this;
        }

        public final a C() {
            s();
            B2.Q((B2) this.f33731C);
            return this;
        }

        public final a D(long j10) {
            s();
            B2.R((B2) this.f33731C, j10);
            return this;
        }

        public final a E(String str) {
            s();
            B2.S((B2) this.f33731C, str);
            return this;
        }

        public final a F() {
            s();
            B2.U((B2) this.f33731C);
            return this;
        }

        public final a v() {
            s();
            B2.L((B2) this.f33731C);
            return this;
        }

        public final a w(double d10) {
            s();
            B2.M((B2) this.f33731C, d10);
            return this;
        }

        private a() {
            super(B2.zzc);
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        F4.v(B2.class, b22);
    }

    private B2() {
    }

    static /* synthetic */ void L(B2 b22) {
        b22.zze &= -33;
        b22.zzk = 0.0d;
    }

    static /* synthetic */ void M(B2 b22, double d10) {
        b22.zze |= 32;
        b22.zzk = d10;
    }

    static /* synthetic */ void N(B2 b22, long j10) {
        b22.zze |= 8;
        b22.zzi = j10;
    }

    static /* synthetic */ void O(B2 b22, String str) {
        str.getClass();
        b22.zze |= 2;
        b22.zzg = str;
    }

    static /* synthetic */ void Q(B2 b22) {
        b22.zze &= -9;
        b22.zzi = 0L;
    }

    static /* synthetic */ void R(B2 b22, long j10) {
        b22.zze |= 1;
        b22.zzf = j10;
    }

    static /* synthetic */ void S(B2 b22, String str) {
        str.getClass();
        b22.zze |= 4;
        b22.zzh = str;
    }

    static /* synthetic */ void U(B2 b22) {
        b22.zze &= -5;
        b22.zzh = zzc.zzh;
    }

    public static a W() {
        return zzc.B();
    }

    public final double K() {
        return this.zzk;
    }

    public final float P() {
        return this.zzj;
    }

    public final long T() {
        return this.zzi;
    }

    public final long V() {
        return this.zzf;
    }

    public final String Y() {
        return this.zzg;
    }

    public final String Z() {
        return this.zzh;
    }

    public final boolean b0() {
        return (this.zze & 32) != 0;
    }

    public final boolean c0() {
        return (this.zze & 16) != 0;
    }

    public final boolean d0() {
        return (this.zze & 8) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final boolean f0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<B2> cVar = zzd;
                if (cVar == null) {
                    synchronized (B2.class) {
                        try {
                            cVar = zzd;
                            if (cVar == null) {
                                cVar = new F4.c<>(zzc);
                                zzd = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
