package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class S1 extends F4<S1, b> implements InterfaceC2533m5 {
    private static final S1 zzc;
    private static volatile InterfaceC2612w5<S1> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public enum a implements H4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f33869B;

        a(int i10) {
            this.f33869B = i10;
        }

        public static a c(int i10) {
            if (i10 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i10 == 1) {
                return LESS_THAN;
            }
            if (i10 == 2) {
                return GREATER_THAN;
            }
            if (i10 == 3) {
                return EQUAL;
            }
            if (i10 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static K4 j() {
            return W1.f33921a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33869B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33869B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class b extends F4.a<S1, b> implements InterfaceC2533m5 {
        private b() {
            super(S1.zzc);
        }
    }

    static {
        S1 s12 = new S1();
        zzc = s12;
        F4.v(S1.class, s12);
    }

    private S1() {
    }

    public static S1 M() {
        return zzc;
    }

    public final a K() {
        a aVarC = a.c(this.zzf);
        return aVarC == null ? a.UNKNOWN_COMPARISON_TYPE : aVarC;
    }

    public final String N() {
        return this.zzh;
    }

    public final String O() {
        return this.zzj;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 4) != 0;
    }

    public final boolean T() {
        return (this.zze & 2) != 0;
    }

    public final boolean U() {
        return (this.zze & 16) != 0;
    }

    public final boolean V() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new S1();
            case 2:
                return new b();
            case 3:
                return F4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", a.j(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<S1> cVar = zzd;
                if (cVar == null) {
                    synchronized (S1.class) {
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
