package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2439b2 extends F4<C2439b2, a> implements InterfaceC2533m5 {
    private static final C2439b2 zzc;
    private static volatile InterfaceC2612w5<C2439b2> zzd;
    private int zze;
    private boolean zzi;
    private L4<b> zzf = F4.G();
    private L4<c> zzg = F4.G();
    private L4<f> zzh = F4.G();
    private L4<b> zzj = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$a */
    public static final class a extends F4.a<C2439b2, a> implements InterfaceC2533m5 {
        private a() {
            super(C2439b2.zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$b */
    public static final class b extends F4<b, a> implements InterfaceC2533m5 {
        private static final b zzc;
        private static volatile InterfaceC2612w5<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.b2$b$a */
        public static final class a extends F4.a<b, a> implements InterfaceC2533m5 {
            private a() {
                super(b.zzc);
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            F4.v(b.class, bVar);
        }

        private b() {
        }

        public final d L() {
            d dVarC = d.c(this.zzg);
            return dVarC == null ? d.CONSENT_STATUS_UNSPECIFIED : dVarC;
        }

        public final e M() {
            e eVarC = e.c(this.zzf);
            return eVarC == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarC;
        }

        @Override // com.google.android.gms.internal.measurement.F4
        protected final Object s(int i10, Object obj, Object obj2) {
            switch (C2430a2.f34044a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.j(), "zzg", d.j()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2612w5<b> cVar = zzd;
                    if (cVar == null) {
                        synchronized (b.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$c */
    public static final class c extends F4<c, a> implements InterfaceC2533m5 {
        private static final c zzc;
        private static volatile InterfaceC2612w5<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.b2$c$a */
        public static final class a extends F4.a<c, a> implements InterfaceC2533m5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            F4.v(c.class, cVar);
        }

        private c() {
        }

        public final e L() {
            e eVarC = e.c(this.zzg);
            return eVarC == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarC;
        }

        public final e M() {
            e eVarC = e.c(this.zzf);
            return eVarC == null ? e.CONSENT_TYPE_UNSPECIFIED : eVarC;
        }

        @Override // com.google.android.gms.internal.measurement.F4
        protected final Object s(int i10, Object obj, Object obj2) {
            switch (C2430a2.f34044a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.j(), "zzg", e.j()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2612w5<c> cVar = zzd;
                    if (cVar == null) {
                        synchronized (c.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$d */
    public enum d implements H4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* renamed from: B, reason: collision with root package name */
        private final int f34053B;

        d(int i10) {
            this.f34053B = i10;
        }

        public static d c(int i10) {
            if (i10 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GRANTED;
            }
            if (i10 != 2) {
                return null;
            }
            return DENIED;
        }

        public static K4 j() {
            return C2514k2.f34180a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f34053B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f34053B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$e */
    public enum e implements H4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f34060B;

        e(int i10) {
            this.f34060B = i10;
        }

        public static e c(int i10) {
            if (i10 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_STORAGE;
            }
            if (i10 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i10 == 3) {
                return AD_USER_DATA;
            }
            if (i10 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static K4 j() {
            return C2522l2.f34196a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f34060B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f34060B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.b2$f */
    public static final class f extends F4<f, a> implements InterfaceC2533m5 {
        private static final f zzc;
        private static volatile InterfaceC2612w5<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.b2$f$a */
        public static final class a extends F4.a<f, a> implements InterfaceC2533m5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            F4.v(f.class, fVar);
        }

        private f() {
        }

        public final String L() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.F4
        protected final Object s(int i10, Object obj, Object obj2) {
            switch (C2430a2.f34044a[i10 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2612w5<f> cVar = zzd;
                    if (cVar == null) {
                        synchronized (f.class) {
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

    static {
        C2439b2 c2439b2 = new C2439b2();
        zzc = c2439b2;
        F4.v(C2439b2.class, c2439b2);
    }

    private C2439b2() {
    }

    public static C2439b2 L() {
        return zzc;
    }

    public final List<f> M() {
        return this.zzh;
    }

    public final List<b> N() {
        return this.zzf;
    }

    public final List<c> O() {
        return this.zzg;
    }

    public final List<b> P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzi;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2439b2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2439b2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2439b2.class) {
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
