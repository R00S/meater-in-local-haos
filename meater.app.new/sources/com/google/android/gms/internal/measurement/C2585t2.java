package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2585t2 extends F4<C2585t2, a> implements InterfaceC2533m5 {
    private static final C2585t2 zzc;
    private static volatile InterfaceC2612w5<C2585t2> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private L4<C2585t2> zzk = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.t2$a */
    public static final class a extends F4.a<C2585t2, a> implements InterfaceC2533m5 {
        public final a A(long j10) {
            s();
            C2585t2.N((C2585t2) this.f33731C, j10);
            return this;
        }

        public final a B(a aVar) {
            s();
            C2585t2.O((C2585t2) this.f33731C, (C2585t2) ((F4) aVar.x()));
            return this;
        }

        public final a C(Iterable<? extends C2585t2> iterable) {
            s();
            C2585t2.P((C2585t2) this.f33731C, iterable);
            return this;
        }

        public final a D(String str) {
            s();
            C2585t2.Q((C2585t2) this.f33731C, str);
            return this;
        }

        public final a E() {
            s();
            C2585t2.L((C2585t2) this.f33731C);
            return this;
        }

        public final a F(String str) {
            s();
            C2585t2.T((C2585t2) this.f33731C, str);
            return this;
        }

        public final a G() {
            s();
            C2585t2.S((C2585t2) this.f33731C);
            return this;
        }

        public final a H() {
            s();
            C2585t2.V((C2585t2) this.f33731C);
            return this;
        }

        public final a I() {
            s();
            C2585t2.X((C2585t2) this.f33731C);
            return this;
        }

        public final String J() {
            return ((C2585t2) this.f33731C).b0();
        }

        public final String L() {
            return ((C2585t2) this.f33731C).c0();
        }

        public final int v() {
            return ((C2585t2) this.f33731C).U();
        }

        public final a w(double d10) {
            s();
            C2585t2.M((C2585t2) this.f33731C, d10);
            return this;
        }

        private a() {
            super(C2585t2.zzc);
        }
    }

    static {
        C2585t2 c2585t2 = new C2585t2();
        zzc = c2585t2;
        F4.v(C2585t2.class, c2585t2);
    }

    private C2585t2() {
    }

    static /* synthetic */ void L(C2585t2 c2585t2) {
        c2585t2.zze &= -17;
        c2585t2.zzj = 0.0d;
    }

    static /* synthetic */ void M(C2585t2 c2585t2, double d10) {
        c2585t2.zze |= 16;
        c2585t2.zzj = d10;
    }

    static /* synthetic */ void N(C2585t2 c2585t2, long j10) {
        c2585t2.zze |= 4;
        c2585t2.zzh = j10;
    }

    static /* synthetic */ void O(C2585t2 c2585t2, C2585t2 c2585t22) {
        c2585t22.getClass();
        c2585t2.j0();
        c2585t2.zzk.add(c2585t22);
    }

    static /* synthetic */ void P(C2585t2 c2585t2, Iterable iterable) {
        c2585t2.j0();
        O3.j(iterable, c2585t2.zzk);
    }

    static /* synthetic */ void Q(C2585t2 c2585t2, String str) {
        str.getClass();
        c2585t2.zze |= 1;
        c2585t2.zzf = str;
    }

    static /* synthetic */ void S(C2585t2 c2585t2) {
        c2585t2.zze &= -5;
        c2585t2.zzh = 0L;
    }

    static /* synthetic */ void T(C2585t2 c2585t2, String str) {
        str.getClass();
        c2585t2.zze |= 2;
        c2585t2.zzg = str;
    }

    static /* synthetic */ void V(C2585t2 c2585t2) {
        c2585t2.zzk = F4.G();
    }

    static /* synthetic */ void X(C2585t2 c2585t2) {
        c2585t2.zze &= -3;
        c2585t2.zzg = zzc.zzg;
    }

    public static a Y() {
        return zzc.B();
    }

    private final void j0() {
        L4<C2585t2> l42 = this.zzk;
        if (l42.d()) {
            return;
        }
        this.zzk = F4.q(l42);
    }

    public final double K() {
        return this.zzj;
    }

    public final float R() {
        return this.zzi;
    }

    public final int U() {
        return this.zzk.size();
    }

    public final long W() {
        return this.zzh;
    }

    public final String b0() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzg;
    }

    public final List<C2585t2> d0() {
        return this.zzk;
    }

    public final boolean e0() {
        return (this.zze & 16) != 0;
    }

    public final boolean f0() {
        return (this.zze & 8) != 0;
    }

    public final boolean g0() {
        return (this.zze & 4) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2585t2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2585t2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2585t2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2585t2.class) {
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
