package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* loaded from: classes2.dex */
abstract class AbstractC7520h4<T, B> {
    AbstractC7520h4() {
    }

    /* renamed from: a */
    abstract B mo21125a();

    /* renamed from: b */
    abstract T mo21126b(B b2);

    /* renamed from: c */
    abstract void mo21127c(B b2, int i2, int i3);

    /* renamed from: d */
    abstract void mo21128d(B b2, int i2, long j2);

    /* renamed from: e */
    abstract void mo21129e(B b2, int i2, zzdu zzduVar);

    /* renamed from: f */
    abstract void mo21130f(B b2, int i2, T t);

    /* renamed from: g */
    abstract void mo21131g(T t, InterfaceC7622y4 interfaceC7622y4) throws IOException;

    /* renamed from: h */
    abstract void mo21132h(Object obj, T t);

    /* renamed from: i */
    abstract boolean mo21133i(InterfaceC7573q3 interfaceC7573q3);

    /* renamed from: j */
    final boolean m21134j(B b2, InterfaceC7573q3 interfaceC7573q3) throws IOException {
        int iMo21307b = interfaceC7573q3.mo21307b();
        int i2 = iMo21307b >>> 3;
        int i3 = iMo21307b & 7;
        if (i3 == 0) {
            mo21128d(b2, i2, interfaceC7573q3.mo21324s());
            return true;
        }
        if (i3 == 1) {
            mo21136l(b2, i2, interfaceC7573q3.mo21317l());
            return true;
        }
        if (i3 == 2) {
            mo21129e(b2, i2, interfaceC7573q3.mo21311f());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzfo.m22301f();
            }
            mo21127c(b2, i2, interfaceC7573q3.mo21328v());
            return true;
        }
        B bMo21125a = mo21125a();
        int i4 = 4 | (i2 << 3);
        while (interfaceC7573q3.mo21306a() != Integer.MAX_VALUE && m21134j(bMo21125a, interfaceC7573q3)) {
        }
        if (i4 != interfaceC7573q3.mo21307b()) {
            throw zzfo.m22300e();
        }
        mo21130f(b2, i2, mo21126b(bMo21125a));
        return true;
    }

    /* renamed from: k */
    abstract T mo21135k(Object obj);

    /* renamed from: l */
    abstract void mo21136l(B b2, int i2, long j2);

    /* renamed from: m */
    abstract void mo21137m(T t, InterfaceC7622y4 interfaceC7622y4) throws IOException;

    /* renamed from: n */
    abstract void mo21138n(Object obj, B b2);

    /* renamed from: o */
    abstract B mo21139o(Object obj);

    /* renamed from: p */
    abstract T mo21140p(T t, T t2);

    /* renamed from: q */
    abstract void mo21141q(Object obj);

    /* renamed from: r */
    abstract int mo21142r(T t);

    /* renamed from: s */
    abstract int mo21143s(T t);
}
