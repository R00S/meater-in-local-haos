package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2562q2 extends F4<C2562q2, a> implements InterfaceC2533m5 {
    private static final C2562q2 zzc;
    private static volatile InterfaceC2612w5<C2562q2> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.q2$a */
    public static final class a extends F4.a<C2562q2, a> implements InterfaceC2533m5 {
        public final a v(int i10) {
            s();
            C2562q2.K((C2562q2) this.f33731C, i10);
            return this;
        }

        public final a w(long j10) {
            s();
            C2562q2.L((C2562q2) this.f33731C, j10);
            return this;
        }

        private a() {
            super(C2562q2.zzc);
        }
    }

    static {
        C2562q2 c2562q2 = new C2562q2();
        zzc = c2562q2;
        F4.v(C2562q2.class, c2562q2);
    }

    private C2562q2() {
    }

    static /* synthetic */ void K(C2562q2 c2562q2, int i10) {
        c2562q2.zze |= 1;
        c2562q2.zzf = i10;
    }

    static /* synthetic */ void L(C2562q2 c2562q2, long j10) {
        c2562q2.zze |= 2;
        c2562q2.zzg = j10;
    }

    public static a N() {
        return zzc.B();
    }

    public final long M() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2562q2();
            case 2:
                return new a();
            case 3:
                return F4.t(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2562q2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2562q2.class) {
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
