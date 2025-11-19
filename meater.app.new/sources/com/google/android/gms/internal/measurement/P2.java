package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class P2 extends F4<P2, a> implements InterfaceC2533m5 {
    private static final P2 zzc;
    private static volatile InterfaceC2612w5<P2> zzd;
    private int zze;
    private L4<Q2> zzf = F4.G();
    private N2 zzg;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<P2, a> implements InterfaceC2533m5 {
        private a() {
            super(P2.zzc);
        }
    }

    static {
        P2 p22 = new P2();
        zzc = p22;
        F4.v(P2.class, p22);
    }

    private P2() {
    }

    public final N2 K() {
        N2 n22 = this.zzg;
        return n22 == null ? N2.L() : n22;
    }

    public final List<Q2> M() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (M2.f33817a[i10 - 1]) {
            case 1:
                return new P2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", Q2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<P2> cVar = zzd;
                if (cVar == null) {
                    synchronized (P2.class) {
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
