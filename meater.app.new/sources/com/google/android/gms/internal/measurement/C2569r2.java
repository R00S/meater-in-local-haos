package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2585t2;
import com.google.android.gms.internal.measurement.F4;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2569r2 extends F4<C2569r2, a> implements InterfaceC2533m5 {
    private static final C2569r2 zzc;
    private static volatile InterfaceC2612w5<C2569r2> zzd;
    private int zze;
    private L4<C2585t2> zzf = F4.G();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends F4.a<C2569r2, a> implements InterfaceC2533m5 {
        public final a A(int i10, C2585t2.a aVar) {
            s();
            C2569r2.N((C2569r2) this.f33731C, i10, (C2585t2) ((F4) aVar.x()));
            return this;
        }

        public final a B(int i10, C2585t2 c2585t2) {
            s();
            C2569r2.N((C2569r2) this.f33731C, i10, c2585t2);
            return this;
        }

        public final a C(long j10) {
            s();
            C2569r2.O((C2569r2) this.f33731C, j10);
            return this;
        }

        public final a D(C2585t2.a aVar) {
            s();
            C2569r2.P((C2569r2) this.f33731C, (C2585t2) ((F4) aVar.x()));
            return this;
        }

        public final a E(C2585t2 c2585t2) {
            s();
            C2569r2.P((C2569r2) this.f33731C, c2585t2);
            return this;
        }

        public final a F(Iterable<? extends C2585t2> iterable) {
            s();
            C2569r2.Q((C2569r2) this.f33731C, iterable);
            return this;
        }

        public final a G(String str) {
            s();
            C2569r2.R((C2569r2) this.f33731C, str);
            return this;
        }

        public final long H() {
            return ((C2569r2) this.f33731C).U();
        }

        public final a I(long j10) {
            s();
            C2569r2.T((C2569r2) this.f33731C, j10);
            return this;
        }

        public final C2585t2 J(int i10) {
            return ((C2569r2) this.f33731C).K(i10);
        }

        public final long L() {
            return ((C2569r2) this.f33731C).V();
        }

        public final a M() {
            s();
            C2569r2.L((C2569r2) this.f33731C);
            return this;
        }

        public final String N() {
            return ((C2569r2) this.f33731C).Y();
        }

        public final List<C2585t2> O() {
            return Collections.unmodifiableList(((C2569r2) this.f33731C).Z());
        }

        public final boolean P() {
            return ((C2569r2) this.f33731C).d0();
        }

        public final int v() {
            return ((C2569r2) this.f33731C).S();
        }

        public final a w(int i10) {
            s();
            C2569r2.M((C2569r2) this.f33731C, i10);
            return this;
        }

        private a() {
            super(C2569r2.zzc);
        }
    }

    static {
        C2569r2 c2569r2 = new C2569r2();
        zzc = c2569r2;
        F4.v(C2569r2.class, c2569r2);
    }

    private C2569r2() {
    }

    static /* synthetic */ void L(C2569r2 c2569r2) {
        c2569r2.zzf = F4.G();
    }

    static /* synthetic */ void M(C2569r2 c2569r2, int i10) {
        c2569r2.e0();
        c2569r2.zzf.remove(i10);
    }

    static /* synthetic */ void N(C2569r2 c2569r2, int i10, C2585t2 c2585t2) {
        c2585t2.getClass();
        c2569r2.e0();
        c2569r2.zzf.set(i10, c2585t2);
    }

    static /* synthetic */ void O(C2569r2 c2569r2, long j10) {
        c2569r2.zze |= 4;
        c2569r2.zzi = j10;
    }

    static /* synthetic */ void P(C2569r2 c2569r2, C2585t2 c2585t2) {
        c2585t2.getClass();
        c2569r2.e0();
        c2569r2.zzf.add(c2585t2);
    }

    static /* synthetic */ void Q(C2569r2 c2569r2, Iterable iterable) {
        c2569r2.e0();
        O3.j(iterable, c2569r2.zzf);
    }

    static /* synthetic */ void R(C2569r2 c2569r2, String str) {
        str.getClass();
        c2569r2.zze |= 1;
        c2569r2.zzg = str;
    }

    static /* synthetic */ void T(C2569r2 c2569r2, long j10) {
        c2569r2.zze |= 2;
        c2569r2.zzh = j10;
    }

    public static a W() {
        return zzc.B();
    }

    private final void e0() {
        L4<C2585t2> l42 = this.zzf;
        if (l42.d()) {
            return;
        }
        this.zzf = F4.q(l42);
    }

    public final C2585t2 K(int i10) {
        return this.zzf.get(i10);
    }

    public final int S() {
        return this.zzf.size();
    }

    public final long U() {
        return this.zzi;
    }

    public final long V() {
        return this.zzh;
    }

    public final String Y() {
        return this.zzg;
    }

    public final List<C2585t2> Z() {
        return this.zzf;
    }

    public final boolean b0() {
        return (this.zze & 8) != 0;
    }

    public final boolean c0() {
        return (this.zze & 4) != 0;
    }

    public final boolean d0() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2569r2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2585t2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2569r2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2569r2.class) {
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
