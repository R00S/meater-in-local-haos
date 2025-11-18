package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2530m2 extends F4<C2530m2, a> implements InterfaceC2533m5 {
    private static final C2530m2 zzc;
    private static volatile InterfaceC2612w5<C2530m2> zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.m2$a */
    public static final class a extends F4.a<C2530m2, a> implements InterfaceC2533m5 {
        public final a A(String str) {
            s();
            C2530m2.N((C2530m2) this.f33731C, str);
            return this;
        }

        public final long B() {
            return ((C2530m2) this.f33731C).O();
        }

        public final a C(long j10) {
            s();
            C2530m2.Q((C2530m2) this.f33731C, j10);
            return this;
        }

        public final a D(String str) {
            s();
            C2530m2.R((C2530m2) this.f33731C, str);
            return this;
        }

        public final a E() {
            s();
            C2530m2.L((C2530m2) this.f33731C);
            return this;
        }

        public final a F(String str) {
            s();
            C2530m2.U((C2530m2) this.f33731C, str);
            return this;
        }

        public final a G() {
            s();
            C2530m2.P((C2530m2) this.f33731C);
            return this;
        }

        public final a H(String str) {
            s();
            C2530m2.X((C2530m2) this.f33731C, str);
            return this;
        }

        public final a I() {
            s();
            C2530m2.T((C2530m2) this.f33731C);
            return this;
        }

        public final a J(String str) {
            s();
            C2530m2.b0((C2530m2) this.f33731C, str);
            return this;
        }

        public final a L() {
            s();
            C2530m2.W((C2530m2) this.f33731C);
            return this;
        }

        public final a M(String str) {
            s();
            C2530m2.e0((C2530m2) this.f33731C, str);
            return this;
        }

        public final a N() {
            s();
            C2530m2.Z((C2530m2) this.f33731C);
            return this;
        }

        public final a O() {
            s();
            C2530m2.d0((C2530m2) this.f33731C);
            return this;
        }

        public final long v() {
            return ((C2530m2) this.f33731C).K();
        }

        public final a w(long j10) {
            s();
            C2530m2.M((C2530m2) this.f33731C, j10);
            return this;
        }

        private a() {
            super(C2530m2.zzc);
        }
    }

    static {
        C2530m2 c2530m2 = new C2530m2();
        zzc = c2530m2;
        F4.v(C2530m2.class, c2530m2);
    }

    private C2530m2() {
    }

    static /* synthetic */ void L(C2530m2 c2530m2) {
        c2530m2.zze &= -5;
        c2530m2.zzh = zzc.zzh;
    }

    static /* synthetic */ void M(C2530m2 c2530m2, long j10) {
        c2530m2.zze |= 8;
        c2530m2.zzi = j10;
    }

    static /* synthetic */ void N(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 4;
        c2530m2.zzh = str;
    }

    static /* synthetic */ void P(C2530m2 c2530m2) {
        c2530m2.zze &= -3;
        c2530m2.zzg = zzc.zzg;
    }

    static /* synthetic */ void Q(C2530m2 c2530m2, long j10) {
        c2530m2.zze |= 128;
        c2530m2.zzm = j10;
    }

    static /* synthetic */ void R(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 2;
        c2530m2.zzg = str;
    }

    public static a S() {
        return zzc.B();
    }

    static /* synthetic */ void T(C2530m2 c2530m2) {
        c2530m2.zze &= -2;
        c2530m2.zzf = zzc.zzf;
    }

    static /* synthetic */ void U(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 1;
        c2530m2.zzf = str;
    }

    static /* synthetic */ void W(C2530m2 c2530m2) {
        c2530m2.zze &= -65;
        c2530m2.zzl = zzc.zzl;
    }

    static /* synthetic */ void X(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 64;
        c2530m2.zzl = str;
    }

    public static C2530m2 Y() {
        return zzc;
    }

    static /* synthetic */ void Z(C2530m2 c2530m2) {
        c2530m2.zze &= -33;
        c2530m2.zzk = zzc.zzk;
    }

    static /* synthetic */ void b0(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 32;
        c2530m2.zzk = str;
    }

    static /* synthetic */ void d0(C2530m2 c2530m2) {
        c2530m2.zze &= -17;
        c2530m2.zzj = zzc.zzj;
    }

    static /* synthetic */ void e0(C2530m2 c2530m2, String str) {
        str.getClass();
        c2530m2.zze |= 16;
        c2530m2.zzj = str;
    }

    public final long K() {
        return this.zzi;
    }

    public final long O() {
        return this.zzm;
    }

    public final String c0() {
        return this.zzh;
    }

    public final String f0() {
        return this.zzg;
    }

    public final String g0() {
        return this.zzf;
    }

    public final String h0() {
        return this.zzl;
    }

    public final String i0() {
        return this.zzk;
    }

    public final String j0() {
        return this.zzj;
    }

    public final boolean k0() {
        return (this.zze & 4) != 0;
    }

    public final boolean l0() {
        return (this.zze & 2) != 0;
    }

    public final boolean m0() {
        return (this.zze & 1) != 0;
    }

    public final boolean n0() {
        return (this.zze & 8) != 0;
    }

    public final boolean o0() {
        return (this.zze & 128) != 0;
    }

    public final boolean p0() {
        return (this.zze & 64) != 0;
    }

    public final boolean q0() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2530m2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2530m2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2530m2.class) {
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

    public final boolean s0() {
        return (this.zze & 16) != 0;
    }
}
