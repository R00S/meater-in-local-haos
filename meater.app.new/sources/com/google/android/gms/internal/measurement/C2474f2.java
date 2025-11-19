package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2474f2 extends F4<C2474f2, a> implements InterfaceC2533m5 {
    private static final C2474f2 zzc;
    private static volatile InterfaceC2612w5<C2474f2> zzd;
    private L4<String> zze = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.f2$a */
    public static final class a extends F4.a<C2474f2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2474f2.zzc);
        }
    }

    static {
        C2474f2 c2474f2 = new C2474f2();
        zzc = c2474f2;
        F4.v(C2474f2.class, c2474f2);
    }

    private C2474f2() {
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2474f2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2474f2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2474f2.class) {
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
