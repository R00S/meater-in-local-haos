package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.l1 */
/* loaded from: classes.dex */
abstract class AbstractC0391l1<T, B> {
    AbstractC0391l1() {
    }

    /* renamed from: a */
    abstract void mo2998a(B b2, int i2, int i3);

    /* renamed from: b */
    abstract void mo2999b(B b2, int i2, long j2);

    /* renamed from: c */
    abstract void mo3000c(B b2, int i2, T t);

    /* renamed from: d */
    abstract void mo3001d(B b2, int i2, AbstractC0377h abstractC0377h);

    /* renamed from: e */
    abstract void mo3002e(B b2, int i2, long j2);

    /* renamed from: f */
    abstract B mo3003f(Object obj);

    /* renamed from: g */
    abstract T mo3004g(Object obj);

    /* renamed from: h */
    abstract int mo3005h(T t);

    /* renamed from: i */
    abstract int mo3006i(T t);

    /* renamed from: j */
    abstract void mo3007j(Object obj);

    /* renamed from: k */
    abstract T mo3008k(T t, T t2);

    /* renamed from: l */
    final void m3009l(B b2, InterfaceC0370e1 interfaceC0370e1) throws IOException {
        while (interfaceC0370e1.mo2626A() != Integer.MAX_VALUE && m3010m(b2, interfaceC0370e1)) {
        }
    }

    /* renamed from: m */
    final boolean m3010m(B b2, InterfaceC0370e1 interfaceC0370e1) throws IOException {
        int tag = interfaceC0370e1.getTag();
        int iM3202a = C0409r1.m3202a(tag);
        int iM3203b = C0409r1.m3203b(tag);
        if (iM3203b == 0) {
            mo3002e(b2, iM3202a, interfaceC0370e1.mo2637L());
            return true;
        }
        if (iM3203b == 1) {
            mo2999b(b2, iM3202a, interfaceC0370e1.mo2649f());
            return true;
        }
        if (iM3203b == 2) {
            mo3001d(b2, iM3202a, interfaceC0370e1.mo2628C());
            return true;
        }
        if (iM3203b != 3) {
            if (iM3203b == 4) {
                return false;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            mo2998a(b2, iM3202a, interfaceC0370e1.mo2654k());
            return true;
        }
        B bMo3011n = mo3011n();
        int iM3204c = C0409r1.m3204c(iM3202a, 4);
        m3009l(bMo3011n, interfaceC0370e1);
        if (iM3204c != interfaceC0370e1.getTag()) {
            throw InvalidProtocolBufferException.m2530a();
        }
        mo3000c(b2, iM3202a, mo3015r(bMo3011n));
        return true;
    }

    /* renamed from: n */
    abstract B mo3011n();

    /* renamed from: o */
    abstract void mo3012o(Object obj, B b2);

    /* renamed from: p */
    abstract void mo3013p(Object obj, T t);

    /* renamed from: q */
    abstract boolean mo3014q(InterfaceC0370e1 interfaceC0370e1);

    /* renamed from: r */
    abstract T mo3015r(B b2);

    /* renamed from: s */
    abstract void mo3016s(T t, InterfaceC0412s1 interfaceC0412s1) throws IOException;

    /* renamed from: t */
    abstract void mo3017t(T t, InterfaceC0412s1 interfaceC0412s1) throws IOException;
}
