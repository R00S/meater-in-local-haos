package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2577s2;
import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2617x2 extends F4<C2617x2, b> implements InterfaceC2533m5 {
    private static final C2617x2 zzc;
    private static volatile InterfaceC2612w5<C2617x2> zzd;
    private int zze;
    private int zzf = 1;
    private L4<C2577s2> zzg = F4.G();

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.x2$a */
    public enum a implements H4 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: B, reason: collision with root package name */
        private final int f34443B;

        a(int i10) {
            this.f34443B = i10;
        }

        public static a c(int i10) {
            if (i10 == 1) {
                return RADS;
            }
            if (i10 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static K4 j() {
            return H2.f33772a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f34443B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f34443B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.x2$b */
    public static final class b extends F4.a<C2617x2, b> implements InterfaceC2533m5 {
        public final b v(C2577s2.a aVar) {
            s();
            C2617x2.L((C2617x2) this.f33731C, (C2577s2) ((F4) aVar.x()));
            return this;
        }

        private b() {
            super(C2617x2.zzc);
        }
    }

    static {
        C2617x2 c2617x2 = new C2617x2();
        zzc = c2617x2;
        F4.v(C2617x2.class, c2617x2);
    }

    private C2617x2() {
    }

    public static b K() {
        return zzc.B();
    }

    static /* synthetic */ void L(C2617x2 c2617x2, C2577s2 c2577s2) {
        c2577s2.getClass();
        L4<C2577s2> l42 = c2617x2.zzg;
        if (!l42.d()) {
            c2617x2.zzg = F4.q(l42);
        }
        c2617x2.zzg.add(c2577s2);
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2617x2();
            case 2:
                return new b();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.j(), "zzg", C2577s2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2617x2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2617x2.class) {
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
