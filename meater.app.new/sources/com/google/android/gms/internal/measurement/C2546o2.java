package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2546o2 extends F4<C2546o2, a> implements InterfaceC2533m5 {
    private static final C2546o2 zzc;
    private static volatile InterfaceC2612w5<C2546o2> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.o2$a */
    public static final class a extends F4.a<C2546o2, a> implements InterfaceC2533m5 {
        public final a A(boolean z10) {
            s();
            C2546o2.P((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a B(boolean z10) {
            s();
            C2546o2.Q((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a C(boolean z10) {
            s();
            C2546o2.S((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a D(boolean z10) {
            s();
            C2546o2.U((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a E(boolean z10) {
            s();
            C2546o2.W((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a v(boolean z10) {
            s();
            C2546o2.L((C2546o2) this.f33731C, z10);
            return this;
        }

        public final a w(boolean z10) {
            s();
            C2546o2.N((C2546o2) this.f33731C, z10);
            return this;
        }

        private a() {
            super(C2546o2.zzc);
        }
    }

    static {
        C2546o2 c2546o2 = new C2546o2();
        zzc = c2546o2;
        F4.v(C2546o2.class, c2546o2);
    }

    private C2546o2() {
    }

    public static a K() {
        return zzc.B();
    }

    static /* synthetic */ void L(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 32;
        c2546o2.zzk = z10;
    }

    static /* synthetic */ void N(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 16;
        c2546o2.zzj = z10;
    }

    public static C2546o2 O() {
        return zzc;
    }

    static /* synthetic */ void P(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 1;
        c2546o2.zzf = z10;
    }

    static /* synthetic */ void Q(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 64;
        c2546o2.zzl = z10;
    }

    static /* synthetic */ void S(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 2;
        c2546o2.zzg = z10;
    }

    static /* synthetic */ void U(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 4;
        c2546o2.zzh = z10;
    }

    static /* synthetic */ void W(C2546o2 c2546o2, boolean z10) {
        c2546o2.zze |= 8;
        c2546o2.zzi = z10;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean T() {
        return this.zzj;
    }

    public final boolean V() {
        return this.zzf;
    }

    public final boolean X() {
        return this.zzl;
    }

    public final boolean Y() {
        return this.zzg;
    }

    public final boolean Z() {
        return this.zzh;
    }

    public final boolean b0() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2546o2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2546o2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2546o2.class) {
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
