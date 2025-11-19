package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2490h2 extends F4<C2490h2, a> implements InterfaceC2533m5 {
    private static final C2490h2 zzc;
    private static volatile InterfaceC2612w5<C2490h2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.h2$a */
    public static final class a extends F4.a<C2490h2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2490h2.zzc);
        }
    }

    static {
        C2490h2 c2490h2 = new C2490h2();
        zzc = c2490h2;
        F4.v(C2490h2.class, c2490h2);
    }

    private C2490h2() {
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2490h2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2490h2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2490h2.class) {
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
