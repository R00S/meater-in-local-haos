package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Q2 extends F4<Q2, a> implements InterfaceC2533m5 {
    private static final Q2 zzc;
    private static volatile InterfaceC2612w5<Q2> zzd;
    private int zze;
    private int zzf;
    private L4<Q2> zzg = F4.G();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class a extends F4.a<Q2, a> implements InterfaceC2533m5 {
        private a() {
            super(Q2.zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public enum b implements H4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f33851B;

        b(int i10) {
            this.f33851B = i10;
        }

        public static b c(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return STRING;
            }
            if (i10 == 2) {
                return NUMBER;
            }
            if (i10 == 3) {
                return BOOLEAN;
            }
            if (i10 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static K4 j() {
            return R2.f33856a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33851B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33851B + " name=" + name() + '>';
        }
    }

    static {
        Q2 q22 = new Q2();
        zzc = q22;
        F4.v(Q2.class, q22);
    }

    private Q2() {
    }

    public final double K() {
        return this.zzk;
    }

    public final b L() {
        b bVarC = b.c(this.zzf);
        return bVarC == null ? b.UNKNOWN : bVarC;
    }

    public final String N() {
        return this.zzh;
    }

    public final String O() {
        return this.zzi;
    }

    public final List<Q2> P() {
        return this.zzg;
    }

    public final boolean Q() {
        return this.zzj;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final boolean S() {
        return (this.zze & 16) != 0;
    }

    public final boolean T() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (M2.f33817a[i10 - 1]) {
            case 1:
                return new Q2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.j(), "zzg", Q2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<Q2> cVar = zzd;
                if (cVar == null) {
                    synchronized (Q2.class) {
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
