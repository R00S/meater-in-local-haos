package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class U1 extends F4<U1, b> implements InterfaceC2533m5 {
    private static final U1 zzc;
    private static volatile InterfaceC2612w5<U1> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private L4<String> zzi = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public enum a implements H4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: B, reason: collision with root package name */
        private final int f33900B;

        a(int i10) {
            this.f33900B = i10;
        }

        public static a c(int i10) {
            switch (i10) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static K4 j() {
            return Z1.f34023a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33900B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33900B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    public static final class b extends F4.a<U1, b> implements InterfaceC2533m5 {
        private b() {
            super(U1.zzc);
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        F4.v(U1.class, u12);
    }

    private U1() {
    }

    public static U1 M() {
        return zzc;
    }

    public final a K() {
        a aVarC = a.c(this.zzf);
        return aVarC == null ? a.UNKNOWN_MATCH_TYPE : aVarC;
    }

    public final String N() {
        return this.zzg;
    }

    public final List<String> O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (V1.f33904a[i10 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new b();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.j(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<U1> cVar = zzd;
                if (cVar == null) {
                    synchronized (U1.class) {
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
