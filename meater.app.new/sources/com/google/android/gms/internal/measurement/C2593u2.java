package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2593u2 extends F4<C2593u2, a> implements InterfaceC2533m5 {
    private static final C2593u2 zzc;
    private static volatile InterfaceC2612w5<C2593u2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2538n2 zzh;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.u2$a */
    public static final class a extends F4.a<C2593u2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2593u2.zzc);
        }
    }

    static {
        C2593u2 c2593u2 = new C2593u2();
        zzc = c2593u2;
        F4.v(C2593u2.class, c2593u2);
    }

    private C2593u2() {
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2593u2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2593u2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2593u2.class) {
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
