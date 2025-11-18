package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.T1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class P1 extends F4<P1, a> implements InterfaceC2533m5 {
    private static final P1 zzc;
    private static volatile InterfaceC2612w5<P1> zzd;
    private int zze;
    private int zzf;
    private L4<T1> zzg = F4.G();
    private L4<Q1> zzh = F4.G();
    private boolean zzi;
    private boolean zzj;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<P1, a> implements InterfaceC2533m5 {
        public final a A(int i10, T1.a aVar) {
            s();
            P1.M((P1) this.f33731C, i10, (T1) ((F4) aVar.x()));
            return this;
        }

        public final Q1 B(int i10) {
            return ((P1) this.f33731C).K(i10);
        }

        public final int C() {
            return ((P1) this.f33731C).P();
        }

        public final T1 D(int i10) {
            return ((P1) this.f33731C).O(i10);
        }

        public final int v() {
            return ((P1) this.f33731C).N();
        }

        public final a w(int i10, Q1.a aVar) {
            s();
            P1.L((P1) this.f33731C, i10, (Q1) ((F4) aVar.x()));
            return this;
        }

        private a() {
            super(P1.zzc);
        }
    }

    static {
        P1 p12 = new P1();
        zzc = p12;
        F4.v(P1.class, p12);
    }

    private P1() {
    }

    static /* synthetic */ void L(P1 p12, int i10, Q1 q12) {
        q12.getClass();
        L4<Q1> l42 = p12.zzh;
        if (!l42.d()) {
            p12.zzh = F4.q(l42);
        }
        p12.zzh.set(i10, q12);
    }

    static /* synthetic */ void M(P1 p12, int i10, T1 t12) {
        t12.getClass();
        L4<T1> l42 = p12.zzg;
        if (!l42.d()) {
            p12.zzg = F4.q(l42);
        }
        p12.zzg.set(i10, t12);
    }

    public final Q1 K(int i10) {
        return this.zzh.get(i10);
    }

    public final int N() {
        return this.zzh.size();
    }

    public final T1 O(int i10) {
        return this.zzg.get(i10);
    }

    public final int P() {
        return this.zzg.size();
    }

    public final List<Q1> R() {
        return this.zzh;
    }

    public final List<T1> S() {
        return this.zzg;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new P1();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", T1.class, "zzh", Q1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<P1> cVar = zzd;
                if (cVar == null) {
                    synchronized (P1.class) {
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
