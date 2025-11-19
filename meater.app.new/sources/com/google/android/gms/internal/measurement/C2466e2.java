package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2457d2;
import com.google.android.gms.internal.measurement.F4;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2466e2 extends F4<C2466e2, a> implements InterfaceC2533m5 {
    private static final C2466e2 zzc;
    private static volatile InterfaceC2612w5<C2466e2> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private C2439b2 zzr;
    private C2482g2 zzs;
    private C2506j2 zzt;
    private C2490h2 zzu;
    private C2474f2 zzv;
    private String zzg = "";
    private L4<C2498i2> zzi = F4.G();
    private L4<C2457d2> zzj = F4.G();
    private L4<P1> zzk = F4.G();
    private String zzl = "";
    private L4<P2> zzn = F4.G();
    private L4<C2448c2> zzo = F4.G();
    private String zzp = "";
    private String zzq = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.e2$a */
    public static final class a extends F4.a<C2466e2, a> implements InterfaceC2533m5 {
        public final a A(int i10, C2457d2.a aVar) {
            s();
            C2466e2.M((C2466e2) this.f33731C, i10, (C2457d2) ((F4) aVar.x()));
            return this;
        }

        public final a B() {
            s();
            C2466e2.L((C2466e2) this.f33731C);
            return this;
        }

        public final String C() {
            return ((C2466e2) this.f33731C).V();
        }

        public final List<P1> D() {
            return Collections.unmodifiableList(((C2466e2) this.f33731C).W());
        }

        public final List<C2448c2> E() {
            return Collections.unmodifiableList(((C2466e2) this.f33731C).X());
        }

        public final int v() {
            return ((C2466e2) this.f33731C).N();
        }

        public final C2457d2 w(int i10) {
            return ((C2466e2) this.f33731C).K(i10);
        }

        private a() {
            super(C2466e2.zzc);
        }
    }

    static {
        C2466e2 c2466e2 = new C2466e2();
        zzc = c2466e2;
        F4.v(C2466e2.class, c2466e2);
    }

    private C2466e2() {
    }

    static /* synthetic */ void L(C2466e2 c2466e2) {
        c2466e2.zzk = F4.G();
    }

    static /* synthetic */ void M(C2466e2 c2466e2, int i10, C2457d2 c2457d2) {
        c2457d2.getClass();
        L4<C2457d2> l42 = c2466e2.zzj;
        if (!l42.d()) {
            c2466e2.zzj = F4.q(l42);
        }
        c2466e2.zzj.set(i10, c2457d2);
    }

    public static a Q() {
        return zzc.B();
    }

    public static C2466e2 S() {
        return zzc;
    }

    public final C2457d2 K(int i10) {
        return this.zzj.get(i10);
    }

    public final int N() {
        return this.zzj.size();
    }

    public final long O() {
        return this.zzf;
    }

    public final C2439b2 P() {
        C2439b2 c2439b2 = this.zzr;
        return c2439b2 == null ? C2439b2.L() : c2439b2;
    }

    public final C2506j2 T() {
        C2506j2 c2506j2 = this.zzt;
        return c2506j2 == null ? C2506j2.L() : c2506j2;
    }

    public final String U() {
        return this.zzg;
    }

    public final String V() {
        return this.zzp;
    }

    public final List<P1> W() {
        return this.zzk;
    }

    public final List<C2448c2> X() {
        return this.zzo;
    }

    public final List<P2> Y() {
        return this.zzn;
    }

    public final List<C2498i2> Z() {
        return this.zzi;
    }

    public final boolean b0() {
        return (this.zze & 128) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    public final boolean d0() {
        return (this.zze & 512) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (C2430a2.f34044a[i10 - 1]) {
            case 1:
                return new C2466e2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2498i2.class, "zzj", C2457d2.class, "zzk", P1.class, "zzl", "zzm", "zzn", P2.class, "zzo", C2448c2.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2466e2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2466e2.class) {
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
