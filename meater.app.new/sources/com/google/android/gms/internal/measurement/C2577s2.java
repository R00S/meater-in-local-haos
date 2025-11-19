package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2577s2 extends F4<C2577s2, a> implements InterfaceC2533m5 {
    private static final C2577s2 zzc;
    private static volatile InterfaceC2612w5<C2577s2> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.s2$a */
    public static final class a extends F4.a<C2577s2, a> implements InterfaceC2533m5 {
        public final a v(long j10) {
            s();
            C2577s2.L((C2577s2) this.f33731C, j10);
            return this;
        }

        public final a w(String str) {
            s();
            C2577s2.M((C2577s2) this.f33731C, str);
            return this;
        }

        private a() {
            super(C2577s2.zzc);
        }
    }

    static {
        C2577s2 c2577s2 = new C2577s2();
        zzc = c2577s2;
        F4.v(C2577s2.class, c2577s2);
    }

    private C2577s2() {
    }

    public static a K() {
        return zzc.B();
    }

    static /* synthetic */ void L(C2577s2 c2577s2, long j10) {
        c2577s2.zze |= 2;
        c2577s2.zzg = j10;
    }

    static /* synthetic */ void M(C2577s2 c2577s2, String str) {
        str.getClass();
        c2577s2.zze |= 1;
        c2577s2.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2577s2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2577s2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2577s2.class) {
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
