package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2482g2 extends F4<C2482g2, a> implements InterfaceC2533m5 {
    private static final C2482g2 zzc;
    private static volatile InterfaceC2612w5<C2482g2> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.g2$a */
    public static final class a extends F4.a<C2482g2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2482g2.zzc);
        }
    }

    static {
        C2482g2 c2482g2 = new C2482g2();
        zzc = c2482g2;
        F4.v(C2482g2.class, c2482g2);
    }

    private C2482g2() {
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2482g2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2482g2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2482g2.class) {
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
