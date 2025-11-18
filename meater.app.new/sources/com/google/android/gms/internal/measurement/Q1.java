package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Q1 extends F4<Q1, a> implements InterfaceC2533m5 {
    private static final Q1 zzc;
    private static volatile InterfaceC2612w5<Q1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private L4<R1> zzh = F4.G();
    private boolean zzi;
    private S1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<Q1, a> implements InterfaceC2533m5 {
        public final a A(String str) {
            s();
            Q1.M((Q1) this.f33731C, str);
            return this;
        }

        public final R1 B(int i10) {
            return ((Q1) this.f33731C).K(i10);
        }

        public final String C() {
            return ((Q1) this.f33731C).R();
        }

        public final int v() {
            return ((Q1) this.f33731C).n();
        }

        public final a w(int i10, R1 r12) {
            s();
            Q1.L((Q1) this.f33731C, i10, r12);
            return this;
        }

        private a() {
            super(Q1.zzc);
        }
    }

    static {
        Q1 q12 = new Q1();
        zzc = q12;
        F4.v(Q1.class, q12);
    }

    private Q1() {
    }

    static /* synthetic */ void L(Q1 q12, int i10, R1 r12) {
        r12.getClass();
        L4<R1> l42 = q12.zzh;
        if (!l42.d()) {
            q12.zzh = F4.q(l42);
        }
        q12.zzh.set(i10, r12);
    }

    static /* synthetic */ void M(Q1 q12, String str) {
        str.getClass();
        q12.zze |= 2;
        q12.zzg = str;
    }

    public static a O() {
        return zzc.B();
    }

    public final R1 K(int i10) {
        return this.zzh.get(i10);
    }

    public final int N() {
        return this.zzf;
    }

    public final S1 Q() {
        S1 s12 = this.zzj;
        return s12 == null ? S1.M() : s12;
    }

    public final String R() {
        return this.zzg;
    }

    public final List<R1> S() {
        return this.zzh;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final boolean U() {
        return this.zzl;
    }

    public final boolean V() {
        return this.zzm;
    }

    public final boolean W() {
        return (this.zze & 8) != 0;
    }

    public final boolean X() {
        return (this.zze & 1) != 0;
    }

    public final boolean Y() {
        return (this.zze & 64) != 0;
    }

    public final int n() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new Q1();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", R1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<Q1> cVar = zzd;
                if (cVar == null) {
                    synchronized (Q1.class) {
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
