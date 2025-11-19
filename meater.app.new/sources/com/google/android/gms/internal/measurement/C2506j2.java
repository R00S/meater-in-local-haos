package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2506j2 extends F4<C2506j2, a> implements InterfaceC2533m5 {
    private static final C2506j2 zzc;
    private static volatile InterfaceC2612w5<C2506j2> zzd;
    private int zze;
    private int zzi;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.j2$a */
    public static final class a extends F4.a<C2506j2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2506j2.zzc);
        }
    }

    static {
        C2506j2 c2506j2 = new C2506j2();
        zzc = c2506j2;
        F4.v(C2506j2.class, c2506j2);
    }

    private C2506j2() {
    }

    public static C2506j2 L() {
        return zzc;
    }

    public final String M() {
        return this.zzg;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzf;
    }

    public final int n() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2506j2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2506j2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2506j2.class) {
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
