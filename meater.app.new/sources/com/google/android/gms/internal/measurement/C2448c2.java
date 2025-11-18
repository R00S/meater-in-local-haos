package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2448c2 extends F4<C2448c2, a> implements InterfaceC2533m5 {
    private static final C2448c2 zzc;
    private static volatile InterfaceC2612w5<C2448c2> zzd;
    private int zze;
    private String zzf = "";
    private L4<C2490h2> zzg = F4.G();
    private boolean zzh;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.c2$a */
    public static final class a extends F4.a<C2448c2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2448c2.zzc);
        }
    }

    static {
        C2448c2 c2448c2 = new C2448c2();
        zzc = c2448c2;
        F4.v(C2448c2.class, c2448c2);
    }

    private C2448c2() {
    }

    public final String L() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2448c2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C2490h2.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2448c2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2448c2.class) {
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
