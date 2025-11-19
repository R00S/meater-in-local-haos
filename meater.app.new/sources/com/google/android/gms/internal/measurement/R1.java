package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class R1 extends F4<R1, a> implements InterfaceC2533m5 {
    private static final R1 zzc;
    private static volatile InterfaceC2612w5<R1> zzd;
    private int zze;
    private U1 zzf;
    private S1 zzg;
    private boolean zzh;
    private String zzi = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<R1, a> implements InterfaceC2533m5 {
        public final a v(String str) {
            s();
            R1.L((R1) this.f33731C, str);
            return this;
        }

        private a() {
            super(R1.zzc);
        }
    }

    static {
        R1 r12 = new R1();
        zzc = r12;
        F4.v(R1.class, r12);
    }

    private R1() {
    }

    static /* synthetic */ void L(R1 r12, String str) {
        str.getClass();
        r12.zze |= 8;
        r12.zzi = str;
    }

    public static R1 M() {
        return zzc;
    }

    public final S1 N() {
        S1 s12 = this.zzg;
        return s12 == null ? S1.M() : s12;
    }

    public final U1 O() {
        U1 u12 = this.zzf;
        return u12 == null ? U1.M() : u12;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzh;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new R1();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<R1> cVar = zzd;
                if (cVar == null) {
                    synchronized (R1.class) {
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
