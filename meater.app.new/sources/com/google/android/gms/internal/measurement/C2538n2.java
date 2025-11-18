package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2538n2 extends F4<C2538n2, a> implements InterfaceC2533m5 {
    private static final C2538n2 zzc;
    private static volatile InterfaceC2612w5<C2538n2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.n2$a */
    public static final class a extends F4.a<C2538n2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2538n2.zzc);
        }
    }

    static {
        C2538n2 c2538n2 = new C2538n2();
        zzc = c2538n2;
        F4.v(C2538n2.class, c2538n2);
    }

    private C2538n2() {
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2538n2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2538n2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2538n2.class) {
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
