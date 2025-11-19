package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2609w2;
import com.google.android.gms.internal.measurement.F4;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2601v2 extends F4<C2601v2, b> implements InterfaceC2533m5 {
    private static final C2601v2 zzc;
    private static volatile InterfaceC2612w5<C2601v2> zzd;
    private int zze;
    private L4<C2609w2> zzf = F4.G();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.v2$a */
    public enum a implements H4 {
        SDK(0),
        SGTM(1);


        /* renamed from: B, reason: collision with root package name */
        private final int f34409B;

        a(int i10) {
            this.f34409B = i10;
        }

        public static a c(int i10) {
            if (i10 == 0) {
                return SDK;
            }
            if (i10 != 1) {
                return null;
            }
            return SGTM;
        }

        public static K4 j() {
            return G2.f33745a;
        }

        @Override // com.google.android.gms.internal.measurement.H4
        public final int a() {
            return this.f34409B;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f34409B + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.v2$b */
    public static final class b extends F4.a<C2601v2, b> implements InterfaceC2533m5 {
        public final b A(C2609w2.a aVar) {
            s();
            C2601v2.N((C2601v2) this.f33731C, (C2609w2) ((F4) aVar.x()));
            return this;
        }

        public final b B(Iterable<? extends C2609w2> iterable) {
            s();
            C2601v2.O((C2601v2) this.f33731C, iterable);
            return this;
        }

        public final b C(String str) {
            s();
            C2601v2.P((C2601v2) this.f33731C, str);
            return this;
        }

        public final C2609w2 D(int i10) {
            return ((C2601v2) this.f33731C).L(i10);
        }

        public final b E() {
            s();
            C2601v2.R((C2601v2) this.f33731C);
            return this;
        }

        public final b F(String str) {
            s();
            C2601v2.S((C2601v2) this.f33731C, str);
            return this;
        }

        public final String G() {
            return ((C2601v2) this.f33731C).U();
        }

        public final List<C2609w2> H() {
            return Collections.unmodifiableList(((C2601v2) this.f33731C).W());
        }

        public final int v() {
            return ((C2601v2) this.f33731C).n();
        }

        public final b w(int i10, C2609w2.a aVar) {
            s();
            C2601v2.M((C2601v2) this.f33731C, i10, (C2609w2) ((F4) aVar.x()));
            return this;
        }

        private b() {
            super(C2601v2.zzc);
        }
    }

    static {
        C2601v2 c2601v2 = new C2601v2();
        zzc = c2601v2;
        F4.v(C2601v2.class, c2601v2);
    }

    private C2601v2() {
    }

    public static b K(C2601v2 c2601v2) {
        return zzc.o(c2601v2);
    }

    static /* synthetic */ void M(C2601v2 c2601v2, int i10, C2609w2 c2609w2) {
        c2609w2.getClass();
        c2601v2.Z();
        c2601v2.zzf.set(i10, c2609w2);
    }

    static /* synthetic */ void N(C2601v2 c2601v2, C2609w2 c2609w2) {
        c2609w2.getClass();
        c2601v2.Z();
        c2601v2.zzf.add(c2609w2);
    }

    static /* synthetic */ void O(C2601v2 c2601v2, Iterable iterable) {
        c2601v2.Z();
        O3.j(iterable, c2601v2.zzf);
    }

    static /* synthetic */ void P(C2601v2 c2601v2, String str) {
        str.getClass();
        c2601v2.zze |= 1;
        c2601v2.zzg = str;
    }

    public static b Q() {
        return zzc.B();
    }

    static /* synthetic */ void R(C2601v2 c2601v2) {
        c2601v2.zzf = F4.G();
    }

    static /* synthetic */ void S(C2601v2 c2601v2, String str) {
        str.getClass();
        c2601v2.zze |= 2;
        c2601v2.zzh = str;
    }

    private final void Z() {
        L4<C2609w2> l42 = this.zzf;
        if (l42.d()) {
            return;
        }
        this.zzf = F4.q(l42);
    }

    public final C2609w2 L(int i10) {
        return this.zzf.get(i10);
    }

    public final String U() {
        return this.zzg;
    }

    public final String V() {
        return this.zzh;
    }

    public final List<C2609w2> W() {
        return this.zzf;
    }

    public final boolean X() {
        return (this.zze & 1) != 0;
    }

    public final boolean Y() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final Object s(int i10, Object obj, Object obj2) {
        switch (E2.f33714a[i10 - 1]) {
            case 1:
                return new C2601v2();
            case 2:
                return new b();
            case 3:
                return F4.t(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C2609w2.class, "zzg", "zzh", "zzi", a.j()});
            case 4:
                return zzc;
            case 5:
                InterfaceC2612w5<C2601v2> cVar = zzd;
                if (cVar == null) {
                    synchronized (C2601v2.class) {
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
