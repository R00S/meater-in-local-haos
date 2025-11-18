package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2457d2 extends F4<C2457d2, a> implements InterfaceC2533m5 {
    private static final C2457d2 zzc;
    private static volatile InterfaceC2612w5<C2457d2> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.d2$a */
    public static final class a extends F4.a<C2457d2, a> implements InterfaceC2533m5 {
        public final String A() {
            return ((C2457d2) this.f33731C).M();
        }

        public final boolean B() {
            return ((C2457d2) this.f33731C).N();
        }

        public final boolean C() {
            return ((C2457d2) this.f33731C).O();
        }

        public final boolean D() {
            return ((C2457d2) this.f33731C).P();
        }

        public final boolean E() {
            return ((C2457d2) this.f33731C).Q();
        }

        public final boolean F() {
            return ((C2457d2) this.f33731C).R();
        }

        public final int v() {
            return ((C2457d2) this.f33731C).n();
        }

        public final a w(String str) {
            s();
            C2457d2.K((C2457d2) this.f33731C, str);
            return this;
        }

        private a() {
            super(C2457d2.zzc);
        }
    }

    static {
        C2457d2 c2457d2 = new C2457d2();
        zzc = c2457d2;
        F4.v(C2457d2.class, c2457d2);
    }

    private C2457d2() {
    }

    static /* synthetic */ void K(C2457d2 c2457d2, String str) {
        str.getClass();
        c2457d2.zze |= 1;
        c2457d2.zzf = str;
    }

    public final String M() {
        return this.zzf;
    }

    public final boolean N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final int n() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2457d2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2457d2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2457d2.class) {
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
