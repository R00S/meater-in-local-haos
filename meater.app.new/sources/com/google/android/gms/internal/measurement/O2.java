package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class O2 extends F4<O2, a> implements InterfaceC2533m5 {
    private static final O2 zzc;
    private static volatile InterfaceC2612w5<O2> zzd;
    private int zze;
    private String zzf = "";
    private L4<Q2> zzg = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<O2, a> implements InterfaceC2533m5 {
        private a() {
            super(O2.zzc);
        }
    }

    static {
        O2 o22 = new O2();
        zzc = o22;
        F4.v(O2.class, o22);
    }

    private O2() {
    }

    public final String L() {
        return this.zzf;
    }

    public final List<Q2> M() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (M2.f33817a[i10 - 1]) {
            case 1:
                return new O2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", Q2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<O2> cVar = zzd;
                if (cVar == null) {
                    synchronized (O2.class) {
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
