package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2625y2;
import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2554p2 extends F4<C2554p2, a> implements InterfaceC2533m5 {
    private static final C2554p2 zzc;
    private static volatile InterfaceC2612w5<C2554p2> zzd;
    private int zze;
    private int zzf;
    private C2625y2 zzg;
    private C2625y2 zzh;
    private boolean zzi;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends F4.a<C2554p2, a> implements InterfaceC2533m5 {
        public final a A(C2625y2 c2625y2) {
            s();
            C2554p2.O((C2554p2) this.f33731C, c2625y2);
            return this;
        }

        public final a B(boolean z10) {
            s();
            C2554p2.M((C2554p2) this.f33731C, z10);
            return this;
        }

        public final a v(int i10) {
            s();
            C2554p2.K((C2554p2) this.f33731C, i10);
            return this;
        }

        public final a w(C2625y2.a aVar) {
            s();
            C2554p2.L((C2554p2) this.f33731C, (C2625y2) ((F4) aVar.x()));
            return this;
        }

        private a() {
            super(C2554p2.zzc);
        }
    }

    static {
        C2554p2 c2554p2 = new C2554p2();
        zzc = c2554p2;
        F4.v(C2554p2.class, c2554p2);
    }

    private C2554p2() {
    }

    static /* synthetic */ void K(C2554p2 c2554p2, int i10) {
        c2554p2.zze |= 1;
        c2554p2.zzf = i10;
    }

    static /* synthetic */ void L(C2554p2 c2554p2, C2625y2 c2625y2) {
        c2625y2.getClass();
        c2554p2.zzg = c2625y2;
        c2554p2.zze |= 2;
    }

    static /* synthetic */ void M(C2554p2 c2554p2, boolean z10) {
        c2554p2.zze |= 8;
        c2554p2.zzi = z10;
    }

    public static a N() {
        return zzc.B();
    }

    static /* synthetic */ void O(C2554p2 c2554p2, C2625y2 c2625y2) {
        c2625y2.getClass();
        c2554p2.zzh = c2625y2;
        c2554p2.zze |= 4;
    }

    public final C2625y2 Q() {
        C2625y2 c2625y2 = this.zzg;
        return c2625y2 == null ? C2625y2.X() : c2625y2;
    }

    public final C2625y2 R() {
        C2625y2 c2625y2 = this.zzh;
        return c2625y2 == null ? C2625y2.X() : c2625y2;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2554p2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2554p2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2554p2.class) {
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
