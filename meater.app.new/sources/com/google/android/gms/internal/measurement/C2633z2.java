package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2633z2 extends F4<C2633z2, a> implements InterfaceC2533m5 {
    private static final C2633z2 zzc;
    private static volatile InterfaceC2612w5<C2633z2> zzd;
    private int zze;
    private int zzf;
    private M4 zzg = F4.F();

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.z2$a */
    public static final class a extends F4.a<C2633z2, a> implements InterfaceC2533m5 {
        public final a v(int i10) {
            s();
            C2633z2.L((C2633z2) this.f33731C, i10);
            return this;
        }

        public final a w(Iterable<? extends Long> iterable) {
            s();
            C2633z2.M((C2633z2) this.f33731C, iterable);
            return this;
        }

        private a() {
            super(C2633z2.zzc);
        }
    }

    static {
        C2633z2 c2633z2 = new C2633z2();
        zzc = c2633z2;
        F4.v(C2633z2.class, c2633z2);
    }

    private C2633z2() {
    }

    static /* synthetic */ void L(C2633z2 c2633z2, int i10) {
        c2633z2.zze |= 1;
        c2633z2.zzf = i10;
    }

    static /* synthetic */ void M(C2633z2 c2633z2, Iterable iterable) {
        M4 m42 = c2633z2.zzg;
        if (!m42.d()) {
            c2633z2.zzg = F4.r(m42);
        }
        O3.j(iterable, c2633z2.zzg);
    }

    public static a O() {
        return zzc.B();
    }

    public final long K(int i10) {
        return this.zzg.s(i10);
    }

    public final int N() {
        return this.zzf;
    }

    public final List<Long> Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2633z2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2633z2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2633z2.class) {
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
