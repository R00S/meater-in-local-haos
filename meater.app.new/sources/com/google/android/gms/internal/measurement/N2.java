package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class N2 extends F4<N2, a> implements InterfaceC2533m5 {
    private static final N2 zzc;
    private static volatile InterfaceC2612w5<N2> zzd;
    private L4<O2> zze = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<N2, a> implements InterfaceC2533m5 {
        private a() {
            super(N2.zzc);
        }
    }

    static {
        N2 n22 = new N2();
        zzc = n22;
        F4.v(N2.class, n22);
    }

    private N2() {
    }

    public static N2 L() {
        return zzc;
    }

    public final List<O2> M() {
        return this.zze;
    }

    public final int n() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (M2.f33817a[i10 - 1]) {
            case 1:
                return new N2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", O2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<N2> cVar = zzd;
                if (cVar == null) {
                    synchronized (N2.class) {
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
