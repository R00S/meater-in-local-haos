package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class T1 extends F4<T1, a> implements InterfaceC2533m5 {
    private static final T1 zzc;
    private static volatile InterfaceC2612w5<T1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private R1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<T1, a> implements InterfaceC2533m5 {
        public final a v(String str) {
            s();
            T1.K((T1) this.f33731C, str);
            return this;
        }

        private a() {
            super(T1.zzc);
        }
    }

    static {
        T1 t12 = new T1();
        zzc = t12;
        F4.v(T1.class, t12);
    }

    private T1() {
    }

    static /* synthetic */ void K(T1 t12, String str) {
        str.getClass();
        t12.zze |= 2;
        t12.zzg = str;
    }

    public static a M() {
        return zzc.B();
    }

    public final R1 L() {
        R1 r12 = this.zzh;
        return r12 == null ? R1.M() : r12;
    }

    public final String O() {
        return this.zzg;
    }

    public final boolean P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzj;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 32) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new T1();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<T1> cVar = zzd;
                if (cVar == null) {
                    synchronized (T1.class) {
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
