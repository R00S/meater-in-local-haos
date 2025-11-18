package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.cx */
/* loaded from: classes2.dex */
abstract class AbstractC6578cx<T, B> {
    AbstractC6578cx() {
    }

    /* renamed from: a */
    abstract void mo14996a(B b2, int i2, long j2);

    /* renamed from: b */
    abstract void mo14997b(B b2, int i2, zzdmr zzdmrVar);

    /* renamed from: c */
    abstract void mo14998c(B b2, int i2, T t);

    /* renamed from: d */
    abstract void mo14999d(T t, InterfaceC7244ux interfaceC7244ux) throws IOException;

    /* renamed from: e */
    abstract boolean mo15000e(InterfaceC6873kw interfaceC6873kw);

    /* renamed from: f */
    final boolean m15001f(B b2, InterfaceC6873kw interfaceC6873kw) throws IOException {
        int tag = interfaceC6873kw.getTag();
        int i2 = tag >>> 3;
        int i3 = tag & 7;
        if (i3 == 0) {
            mo14996a(b2, i2, interfaceC6873kw.mo15453K());
            return true;
        }
        if (i3 == 1) {
            mo15009n(b2, i2, interfaceC6873kw.mo15454L());
            return true;
        }
        if (i3 == 2) {
            mo14997b(b2, i2, interfaceC6873kw.mo15462T());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzdok.m19755f();
            }
            mo15010o(b2, i2, interfaceC6873kw.mo15460R());
            return true;
        }
        B bMo15008m = mo15008m();
        int i4 = 4 | (i2 << 3);
        while (interfaceC6873kw.mo15456N() != Integer.MAX_VALUE && m15001f(bMo15008m, interfaceC6873kw)) {
        }
        if (i4 != interfaceC6873kw.getTag()) {
            throw zzdok.m19754e();
        }
        mo14998c(b2, i2, mo15003h(bMo15008m));
        return true;
    }

    /* renamed from: g */
    abstract void mo15002g(Object obj);

    /* renamed from: h */
    abstract T mo15003h(B b2);

    /* renamed from: i */
    abstract int mo15004i(T t);

    /* renamed from: j */
    abstract T mo15005j(Object obj);

    /* renamed from: k */
    abstract B mo15006k(Object obj);

    /* renamed from: l */
    abstract int mo15007l(T t);

    /* renamed from: m */
    abstract B mo15008m();

    /* renamed from: n */
    abstract void mo15009n(B b2, int i2, long j2);

    /* renamed from: o */
    abstract void mo15010o(B b2, int i2, int i3);

    /* renamed from: p */
    abstract void mo15011p(T t, InterfaceC7244ux interfaceC7244ux) throws IOException;

    /* renamed from: q */
    abstract void mo15012q(Object obj, T t);

    /* renamed from: r */
    abstract void mo15013r(Object obj, B b2);

    /* renamed from: s */
    abstract T mo15014s(T t, T t2);
}
