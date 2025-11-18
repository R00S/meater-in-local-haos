package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z1 */
/* loaded from: classes2.dex */
final class C7625z1 implements InterfaceC7573q3 {

    /* renamed from: a */
    private final zzeg f27944a;

    /* renamed from: b */
    private int f27945b;

    /* renamed from: c */
    private int f27946c;

    /* renamed from: d */
    private int f27947d = 0;

    private C7625z1(zzeg zzegVar) {
        zzeg zzegVar2 = (zzeg) zzff.m22291f(zzegVar, "input");
        this.f27944a = zzegVar2;
        zzegVar2.f28044d = this;
    }

    /* renamed from: P */
    public static C7625z1 m21479P(zzeg zzegVar) {
        C7625z1 c7625z1 = zzegVar.f28044d;
        return c7625z1 != null ? c7625z1 : new C7625z1(zzegVar);
    }

    /* renamed from: Q */
    private final void m21480Q(int i2) throws IOException {
        if ((this.f27945b & 7) != i2) {
            throw zzfo.m22301f();
        }
    }

    /* renamed from: R */
    private final void m21481R(List<String> list, boolean z) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if ((this.f27945b & 7) != 2) {
            throw zzfo.m22301f();
        }
        if (!(list instanceof zzfv) || z) {
            do {
                list.add(z ? mo21315j() : mo21329w());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a = this.f27944a.mo21452a();
                }
            } while (iMo21452a == this.f27945b);
            this.f27947d = iMo21452a;
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        do {
            zzfvVar.mo22312n1(mo21311f());
            if (this.f27944a.mo21450A()) {
                return;
            } else {
                iMo21452a2 = this.f27944a.mo21452a();
            }
        } while (iMo21452a2 == this.f27945b);
        this.f27947d = iMo21452a2;
    }

    /* renamed from: S */
    private static void m21482S(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw zzfo.m22302g();
        }
    }

    /* renamed from: T */
    private final <T> T m21483T(InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        int iMo21468t = this.f27944a.mo21468t();
        zzeg zzegVar = this.f27944a;
        if (zzegVar.f28041a >= zzegVar.f28042b) {
            throw new zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo21457h = zzegVar.mo21457h(iMo21468t);
        T tMo21095a = interfaceC7567p3.mo21095a();
        this.f27944a.f28041a++;
        interfaceC7567p3.mo21103i(tMo21095a, this, zzeqVar);
        interfaceC7567p3.mo21100f(tMo21095a);
        this.f27944a.mo21453d(0);
        r5.f28041a--;
        this.f27944a.mo21459j(iMo21457h);
        return tMo21095a;
    }

    /* renamed from: U */
    private static void m21484U(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw zzfo.m22302g();
        }
    }

    /* renamed from: V */
    private final <T> T m21485V(InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        int i2 = this.f27946c;
        this.f27946c = ((this.f27945b >>> 3) << 3) | 4;
        try {
            T tMo21095a = interfaceC7567p3.mo21095a();
            interfaceC7567p3.mo21103i(tMo21095a, this, zzeqVar);
            interfaceC7567p3.mo21100f(tMo21095a);
            if (this.f27945b == this.f27946c) {
                return tMo21095a;
            }
            throw zzfo.m22302g();
        } finally {
            this.f27946c = i2;
        }
    }

    /* renamed from: W */
    private final void m21486W(int i2) throws IOException {
        if (this.f27944a.mo21451B() != i2) {
            throw zzfo.m22296a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: A */
    public final void mo21291A(List<Float> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7542l2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 2) {
                int iMo21468t = this.f27944a.mo21468t();
                m21484U(iMo21468t);
                int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
                do {
                    list.add(Float.valueOf(this.f27944a.mo21456g()));
                } while (this.f27944a.mo21451B() < iMo21451B);
                return;
            }
            if (i2 != 5) {
                throw zzfo.m22301f();
            }
            do {
                list.add(Float.valueOf(this.f27944a.mo21456g()));
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a = this.f27944a.mo21452a();
                }
            } while (iMo21452a == this.f27945b);
            this.f27947d = iMo21452a;
            return;
        }
        C7542l2 c7542l2 = (C7542l2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 2) {
            int iMo21468t2 = this.f27944a.mo21468t();
            m21484U(iMo21468t2);
            int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
            do {
                c7542l2.m21233f(this.f27944a.mo21456g());
            } while (this.f27944a.mo21451B() < iMo21451B2);
            return;
        }
        if (i3 != 5) {
            throw zzfo.m22301f();
        }
        do {
            c7542l2.m21233f(this.f27944a.mo21456g());
            if (this.f27944a.mo21450A()) {
                return;
            } else {
                iMo21452a2 = this.f27944a.mo21452a();
            }
        } while (iMo21452a2 == this.f27945b);
        this.f27947d = iMo21452a2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: B */
    public final void mo21292B(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 2) {
                int iMo21468t = this.f27944a.mo21468t();
                m21484U(iMo21468t);
                int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21470v()));
                } while (this.f27944a.mo21451B() < iMo21451B);
                return;
            }
            if (i2 != 5) {
                throw zzfo.m22301f();
            }
            do {
                list.add(Integer.valueOf(this.f27944a.mo21470v()));
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a = this.f27944a.mo21452a();
                }
            } while (iMo21452a == this.f27945b);
            this.f27947d = iMo21452a;
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 2) {
            int iMo21468t2 = this.f27944a.mo21468t();
            m21484U(iMo21468t2);
            int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
            do {
                c7554n2.m21244h(this.f27944a.mo21470v());
            } while (this.f27944a.mo21451B() < iMo21451B2);
            return;
        }
        if (i3 != 5) {
            throw zzfo.m22301f();
        }
        do {
            c7554n2.m21244h(this.f27944a.mo21470v());
            if (this.f27944a.mo21450A()) {
                return;
            } else {
                iMo21452a2 = this.f27944a.mo21452a();
            }
        } while (iMo21452a2 == this.f27945b);
        this.f27947d = iMo21452a2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: C */
    public final void mo21293C(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21469u()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Integer.valueOf(this.f27944a.mo21469u()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7554n2.m21244h(this.f27944a.mo21469u());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7554n2.m21244h(this.f27944a.mo21469u());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: D */
    public final <K, V> void mo21294D(Map<K, V> map, C7626z2<K, V> c7626z2, zzeq zzeqVar) throws IOException {
        m21480Q(2);
        this.f27944a.mo21457h(this.f27944a.mo21468t());
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: E */
    public final void mo21295E(List<Boolean> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7541l1)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f27944a.mo21464p()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Boolean.valueOf(this.f27944a.mo21464p()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7541l1 c7541l1 = (C7541l1) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7541l1.m21230f(this.f27944a.mo21464p());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7541l1.m21230f(this.f27944a.mo21464p());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: F */
    public final void mo21296F(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 2) {
                int iMo21468t = this.f27944a.mo21468t();
                m21484U(iMo21468t);
                int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21463o()));
                } while (this.f27944a.mo21451B() < iMo21451B);
                return;
            }
            if (i2 != 5) {
                throw zzfo.m22301f();
            }
            do {
                list.add(Integer.valueOf(this.f27944a.mo21463o()));
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a = this.f27944a.mo21452a();
                }
            } while (iMo21452a == this.f27945b);
            this.f27947d = iMo21452a;
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 2) {
            int iMo21468t2 = this.f27944a.mo21468t();
            m21484U(iMo21468t2);
            int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
            do {
                c7554n2.m21244h(this.f27944a.mo21463o());
            } while (this.f27944a.mo21451B() < iMo21451B2);
            return;
        }
        if (i3 != 5) {
            throw zzfo.m22301f();
        }
        do {
            c7554n2.m21244h(this.f27944a.mo21463o());
            if (this.f27944a.mo21450A()) {
                return;
            } else {
                iMo21452a2 = this.f27944a.mo21452a();
            }
        } while (iMo21452a2 == this.f27945b);
        this.f27947d = iMo21452a2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: G */
    public final void mo21297G(List<Long> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7608w2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f27944a.mo21462n()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21468t = this.f27944a.mo21468t();
            m21482S(iMo21468t);
            int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
            do {
                list.add(Long.valueOf(this.f27944a.mo21462n()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            return;
        }
        C7608w2 c7608w2 = (C7608w2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 1) {
            do {
                c7608w2.mo21439G0(this.f27944a.mo21462n());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21468t2 = this.f27944a.mo21468t();
        m21482S(iMo21468t2);
        int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
        do {
            c7608w2.mo21439G0(this.f27944a.mo21462n());
        } while (this.f27944a.mo21451B() < iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: H */
    public final void mo21298H(List<Double> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7482b2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f27944a.mo21454e()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21468t = this.f27944a.mo21468t();
            m21482S(iMo21468t);
            int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
            do {
                list.add(Double.valueOf(this.f27944a.mo21454e()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            return;
        }
        C7482b2 c7482b2 = (C7482b2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 1) {
            do {
                c7482b2.m20983f(this.f27944a.mo21454e());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21468t2 = this.f27944a.mo21468t();
        m21482S(iMo21468t2);
        int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
        do {
            c7482b2.m20983f(this.f27944a.mo21454e());
        } while (this.f27944a.mo21451B() < iMo21451B2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: I */
    public final <T> void mo21299I(List<T> list, InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        int iMo21452a;
        int i2 = this.f27945b;
        if ((i2 & 7) != 3) {
            throw zzfo.m22301f();
        }
        do {
            list.add(m21485V(interfaceC7567p3, zzeqVar));
            if (this.f27944a.mo21450A() || this.f27947d != 0) {
                return;
            } else {
                iMo21452a = this.f27944a.mo21452a();
            }
        } while (iMo21452a == i2);
        this.f27947d = iMo21452a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: J */
    public final <T> T mo21300J(InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        m21480Q(2);
        return (T) m21483T(interfaceC7567p3, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: K */
    public final <T> T mo21301K(InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        m21480Q(3);
        return (T) m21485V(interfaceC7567p3, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: L */
    public final void mo21302L(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21461m()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Integer.valueOf(this.f27944a.mo21461m()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7554n2.m21244h(this.f27944a.mo21461m());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7554n2.m21244h(this.f27944a.mo21461m());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: M */
    public final void mo21303M(List<Long> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7608w2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f27944a.mo21460l()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Long.valueOf(this.f27944a.mo21460l()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7608w2 c7608w2 = (C7608w2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7608w2.mo21439G0(this.f27944a.mo21460l());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7608w2.mo21439G0(this.f27944a.mo21460l());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: N */
    public final <T> void mo21304N(List<T> list, InterfaceC7567p3<T> interfaceC7567p3, zzeq zzeqVar) throws IOException {
        int iMo21452a;
        int i2 = this.f27945b;
        if ((i2 & 7) != 2) {
            throw zzfo.m22301f();
        }
        do {
            list.add(m21483T(interfaceC7567p3, zzeqVar));
            if (this.f27944a.mo21450A() || this.f27947d != 0) {
                return;
            } else {
                iMo21452a = this.f27944a.mo21452a();
            }
        } while (iMo21452a == i2);
        this.f27947d = iMo21452a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: O */
    public final boolean mo21305O() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21464p();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: a */
    public final int mo21306a() throws IOException {
        int i2 = this.f27947d;
        if (i2 != 0) {
            this.f27945b = i2;
            this.f27947d = 0;
        } else {
            this.f27945b = this.f27944a.mo21452a();
        }
        int i3 = this.f27945b;
        if (i3 == 0 || i3 == this.f27946c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: b */
    public final int mo21307b() {
        return this.f27945b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: c */
    public final boolean mo21308c() throws IOException {
        int i2;
        if (this.f27944a.mo21450A() || (i2 = this.f27945b) == this.f27946c) {
            return false;
        }
        return this.f27944a.mo21455f(i2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: d */
    public final double mo21309d() throws IOException {
        m21480Q(1);
        return this.f27944a.mo21454e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: e */
    public final float mo21310e() throws IOException {
        m21480Q(5);
        return this.f27944a.mo21456g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: f */
    public final zzdu mo21311f() throws IOException {
        m21480Q(2);
        return this.f27944a.mo21467s();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: g */
    public final int mo21312g() throws IOException {
        m21480Q(5);
        return this.f27944a.mo21470v();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: h */
    public final long mo21313h() throws IOException {
        m21480Q(1);
        return this.f27944a.mo21471w();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: i */
    public final void mo21314i(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21472x()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Integer.valueOf(this.f27944a.mo21472x()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7554n2.m21244h(this.f27944a.mo21472x());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7554n2.m21244h(this.f27944a.mo21472x());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: j */
    public final String mo21315j() throws IOException {
        m21480Q(2);
        return this.f27944a.mo21466r();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: k */
    public final int mo21316k() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21469u();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: l */
    public final long mo21317l() throws IOException {
        m21480Q(1);
        return this.f27944a.mo21462n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: m */
    public final int mo21318m() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21461m();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: n */
    public final void mo21319n(List<Long> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7608w2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f27944a.mo21471w()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21468t = this.f27944a.mo21468t();
            m21482S(iMo21468t);
            int iMo21451B = this.f27944a.mo21451B() + iMo21468t;
            do {
                list.add(Long.valueOf(this.f27944a.mo21471w()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            return;
        }
        C7608w2 c7608w2 = (C7608w2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 1) {
            do {
                c7608w2.mo21439G0(this.f27944a.mo21471w());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21468t2 = this.f27944a.mo21468t();
        m21482S(iMo21468t2);
        int iMo21451B2 = this.f27944a.mo21451B() + iMo21468t2;
        do {
            c7608w2.mo21439G0(this.f27944a.mo21471w());
        } while (this.f27944a.mo21451B() < iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: o */
    public final void mo21320o(List<String> list) throws IOException {
        m21481R(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: p */
    public final int mo21321p() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21468t();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: q */
    public final long mo21322q() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21458i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: r */
    public final void mo21323r(List<String> list) throws IOException {
        m21481R(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: s */
    public final long mo21324s() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21460l();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: t */
    public final void mo21325t(List<Long> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7608w2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f27944a.mo21473y()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Long.valueOf(this.f27944a.mo21473y()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7608w2 c7608w2 = (C7608w2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7608w2.mo21439G0(this.f27944a.mo21473y());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7608w2.mo21439G0(this.f27944a.mo21473y());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: u */
    public final void mo21326u(List<Integer> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7554n2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27944a.mo21468t()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Integer.valueOf(this.f27944a.mo21468t()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7554n2 c7554n2 = (C7554n2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7554n2.m21244h(this.f27944a.mo21468t());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7554n2.m21244h(this.f27944a.mo21468t());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: u0 */
    public final void mo21327u0(List<Long> list) throws IOException {
        int iMo21452a;
        int iMo21452a2;
        if (!(list instanceof C7608w2)) {
            int i2 = this.f27945b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f27944a.mo21458i()));
                    if (this.f27944a.mo21450A()) {
                        return;
                    } else {
                        iMo21452a = this.f27944a.mo21452a();
                    }
                } while (iMo21452a == this.f27945b);
                this.f27947d = iMo21452a;
                return;
            }
            if (i2 != 2) {
                throw zzfo.m22301f();
            }
            int iMo21451B = this.f27944a.mo21451B() + this.f27944a.mo21468t();
            do {
                list.add(Long.valueOf(this.f27944a.mo21458i()));
            } while (this.f27944a.mo21451B() < iMo21451B);
            m21486W(iMo21451B);
            return;
        }
        C7608w2 c7608w2 = (C7608w2) list;
        int i3 = this.f27945b & 7;
        if (i3 == 0) {
            do {
                c7608w2.mo21439G0(this.f27944a.mo21458i());
                if (this.f27944a.mo21450A()) {
                    return;
                } else {
                    iMo21452a2 = this.f27944a.mo21452a();
                }
            } while (iMo21452a2 == this.f27945b);
            this.f27947d = iMo21452a2;
            return;
        }
        if (i3 != 2) {
            throw zzfo.m22301f();
        }
        int iMo21451B2 = this.f27944a.mo21451B() + this.f27944a.mo21468t();
        do {
            c7608w2.mo21439G0(this.f27944a.mo21458i());
        } while (this.f27944a.mo21451B() < iMo21451B2);
        m21486W(iMo21451B2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: v */
    public final int mo21328v() throws IOException {
        m21480Q(5);
        return this.f27944a.mo21463o();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: w */
    public final String mo21329w() throws IOException {
        m21480Q(2);
        return this.f27944a.mo21465q();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: x */
    public final int mo21330x() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21472x();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: y */
    public final long mo21331y() throws IOException {
        m21480Q(0);
        return this.f27944a.mo21473y();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7573q3
    /* renamed from: z */
    public final void mo21332z(List<zzdu> list) throws IOException {
        int iMo21452a;
        if ((this.f27945b & 7) != 2) {
            throw zzfo.m22301f();
        }
        do {
            list.add(mo21311f());
            if (this.f27944a.mo21450A()) {
                return;
            } else {
                iMo21452a = this.f27944a.mo21452a();
            }
        } while (iMo21452a == this.f27945b);
        this.f27947d = iMo21452a;
    }
}
