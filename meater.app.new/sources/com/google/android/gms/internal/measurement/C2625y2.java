package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2625y2 extends F4<C2625y2, a> implements InterfaceC2533m5 {
    private static final C2625y2 zzc;
    private static volatile InterfaceC2612w5<C2625y2> zzd;
    private M4 zze = F4.F();
    private M4 zzf = F4.F();
    private L4<C2562q2> zzg = F4.G();
    private L4<C2633z2> zzh = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    public static final class a extends F4.a<C2625y2, a> implements InterfaceC2533m5 {
        public final a A() {
            s();
            C2625y2.N((C2625y2) this.f33731C);
            return this;
        }

        public final a B(Iterable<? extends Long> iterable) {
            s();
            C2625y2.O((C2625y2) this.f33731C, iterable);
            return this;
        }

        public final a C() {
            s();
            C2625y2.Q((C2625y2) this.f33731C);
            return this;
        }

        public final a D(Iterable<? extends C2633z2> iterable) {
            s();
            C2625y2.R((C2625y2) this.f33731C, iterable);
            return this;
        }

        public final a E() {
            s();
            C2625y2.T((C2625y2) this.f33731C);
            return this;
        }

        public final a F(Iterable<? extends Long> iterable) {
            s();
            C2625y2.U((C2625y2) this.f33731C, iterable);
            return this;
        }

        public final a v() {
            s();
            C2625y2.K((C2625y2) this.f33731C);
            return this;
        }

        public final a w(Iterable<? extends C2562q2> iterable) {
            s();
            C2625y2.L((C2625y2) this.f33731C, iterable);
            return this;
        }

        private a() {
            super(C2625y2.zzc);
        }
    }

    static {
        C2625y2 c2625y2 = new C2625y2();
        zzc = c2625y2;
        F4.v(C2625y2.class, c2625y2);
    }

    private C2625y2() {
    }

    static /* synthetic */ void K(C2625y2 c2625y2) {
        c2625y2.zzg = F4.G();
    }

    static /* synthetic */ void L(C2625y2 c2625y2, Iterable iterable) {
        L4<C2562q2> l42 = c2625y2.zzg;
        if (!l42.d()) {
            c2625y2.zzg = F4.q(l42);
        }
        O3.j(iterable, c2625y2.zzg);
    }

    static /* synthetic */ void N(C2625y2 c2625y2) {
        c2625y2.zzf = F4.F();
    }

    static /* synthetic */ void O(C2625y2 c2625y2, Iterable iterable) {
        M4 m42 = c2625y2.zzf;
        if (!m42.d()) {
            c2625y2.zzf = F4.r(m42);
        }
        O3.j(iterable, c2625y2.zzf);
    }

    static /* synthetic */ void Q(C2625y2 c2625y2) {
        c2625y2.zzh = F4.G();
    }

    static /* synthetic */ void R(C2625y2 c2625y2, Iterable iterable) {
        L4<C2633z2> l42 = c2625y2.zzh;
        if (!l42.d()) {
            c2625y2.zzh = F4.q(l42);
        }
        O3.j(iterable, c2625y2.zzh);
    }

    static /* synthetic */ void T(C2625y2 c2625y2) {
        c2625y2.zze = F4.F();
    }

    static /* synthetic */ void U(C2625y2 c2625y2, Iterable iterable) {
        M4 m42 = c2625y2.zze;
        if (!m42.d()) {
            c2625y2.zze = F4.r(m42);
        }
        O3.j(iterable, c2625y2.zze);
    }

    public static a V() {
        return zzc.B();
    }

    public static C2625y2 X() {
        return zzc;
    }

    public final int M() {
        return this.zzf.size();
    }

    public final int P() {
        return this.zzh.size();
    }

    public final int S() {
        return this.zze.size();
    }

    public final List<C2562q2> Y() {
        return this.zzg;
    }

    public final List<Long> Z() {
        return this.zzf;
    }

    public final List<C2633z2> b0() {
        return this.zzh;
    }

    public final List<Long> c0() {
        return this.zze;
    }

    public final int n() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2625y2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2562q2.class, "zzh", C2633z2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2625y2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2625y2.class) {
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
