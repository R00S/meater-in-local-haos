package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class A2 extends F4<A2, b> implements InterfaceC2533m5 {
    private static final A2 zzc;
    private static volatile InterfaceC2612w5<A2> zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public enum a implements H4 {
        CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        CLIENT_UPLOAD_ELIGIBLE(1),
        MEASUREMENT_SERVICE_NOT_ENABLED(2),
        ANDROID_TOO_OLD(3),
        NON_PLAY_MODE(4),
        SDK_TOO_OLD(5),
        MISSING_JOB_SCHEDULER(6),
        NOT_ENABLED_IN_MANIFEST(7),
        CLIENT_FLAG_OFF(8),
        SERVICE_FLAG_OFF(20),
        PINNED_TO_SERVICE_UPLOAD(21),
        MISSING_SGTM_SERVER_URL(22);


        /* renamed from: B, reason: collision with root package name */
        private final int f33585B;

        a(int i10) {
            this.f33585B = i10;
        }

        public static a c(int i10) {
            switch (i10) {
                case 0:
                    return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                case 1:
                    return CLIENT_UPLOAD_ELIGIBLE;
                case 2:
                    return MEASUREMENT_SERVICE_NOT_ENABLED;
                case 3:
                    return ANDROID_TOO_OLD;
                case 4:
                    return NON_PLAY_MODE;
                case 5:
                    return SDK_TOO_OLD;
                case 6:
                    return MISSING_JOB_SCHEDULER;
                case 7:
                    return NOT_ENABLED_IN_MANIFEST;
                case 8:
                    return CLIENT_FLAG_OFF;
                default:
                    switch (i10) {
                        case 20:
                            return SERVICE_FLAG_OFF;
                        case 21:
                            return PINNED_TO_SERVICE_UPLOAD;
                        case 22:
                            return MISSING_SGTM_SERVER_URL;
                        default:
                            return null;
                    }
            }
        }

        public static K4 j() {
            return I2.f33781a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33585B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33585B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public static final class b extends F4.a<A2, b> implements InterfaceC2533m5 {
        public final b A(d dVar) {
            s();
            A2.N((A2) this.f33731C, dVar);
            return this;
        }

        public final b v(a aVar) {
            s();
            A2.L((A2) this.f33731C, aVar);
            return this;
        }

        public final b w(c cVar) {
            s();
            A2.M((A2) this.f33731C, cVar);
            return this;
        }

        private b() {
            super(A2.zzc);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public enum c implements H4 {
        SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN(0),
        SERVICE_UPLOAD_ELIGIBLE(1),
        NOT_IN_ROLLOUT(2),
        MISSING_SGTM_SETTINGS(3),
        MISSING_SGTM_PROXY_INFO(4),
        NON_PLAY_MISSING_SGTM_SERVER_URL(5);


        /* renamed from: B, reason: collision with root package name */
        private final int f33593B;

        c(int i10) {
            this.f33593B = i10;
        }

        public static c c(int i10) {
            if (i10 == 0) {
                return SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN;
            }
            if (i10 == 1) {
                return SERVICE_UPLOAD_ELIGIBLE;
            }
            if (i10 == 2) {
                return NOT_IN_ROLLOUT;
            }
            if (i10 == 3) {
                return MISSING_SGTM_SETTINGS;
            }
            if (i10 == 4) {
                return MISSING_SGTM_PROXY_INFO;
            }
            if (i10 != 5) {
                return null;
            }
            return NON_PLAY_MISSING_SGTM_SERVER_URL;
        }

        public static K4 j() {
            return J2.f33791a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33593B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33593B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public enum d implements H4 {
        UPLOAD_TYPE_UNKNOWN(0),
        GA_UPLOAD(1),
        SDK_CLIENT_UPLOAD(2),
        PACKAGE_SERVICE_UPLOAD(3),
        SDK_SERVICE_UPLOAD(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f33600B;

        d(int i10) {
            this.f33600B = i10;
        }

        public static d c(int i10) {
            if (i10 == 0) {
                return UPLOAD_TYPE_UNKNOWN;
            }
            if (i10 == 1) {
                return GA_UPLOAD;
            }
            if (i10 == 2) {
                return SDK_CLIENT_UPLOAD;
            }
            if (i10 == 3) {
                return PACKAGE_SERVICE_UPLOAD;
            }
            if (i10 != 4) {
                return null;
            }
            return SDK_SERVICE_UPLOAD;
        }

        public static K4 j() {
            return K2.f33801a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f33600B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f33600B + " name=" + name() + '>';
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        F4.v(A2.class, a22);
    }

    private A2() {
    }

    public static b K() {
        return zzc.B();
    }

    static /* synthetic */ void L(A2 a22, a aVar) {
        a22.zzg = aVar.a();
        a22.zze |= 2;
    }

    static /* synthetic */ void M(A2 a22, c cVar) {
        a22.zzh = cVar.a();
        a22.zze |= 4;
    }

    static /* synthetic */ void N(A2 a22, d dVar) {
        a22.zzf = dVar.a();
        a22.zze |= 1;
    }

    public static A2 S() {
        return zzc;
    }

    public final a O() {
        a aVarC = a.c(this.zzg);
        return aVarC == null ? a.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : aVarC;
    }

    public final c P() {
        c cVarC = c.c(this.zzh);
        return cVarC == null ? c.SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN : cVarC;
    }

    public final d Q() {
        d dVarC = d.c(this.zzf);
        return dVarC == null ? d.UPLOAD_TYPE_UNKNOWN : dVarC;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new b();
            case 3:
                return F4.t(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", d.j(), "zzg", a.j(), "zzh", c.j()});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<A2> cVar = zzd;
                if (cVar == null) {
                    synchronized (A2.class) {
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
