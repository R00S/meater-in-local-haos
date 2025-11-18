package p241e.p254e.p256b.p257a.p258i;

import java.util.Set;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.InterfaceC8789f;
import p241e.p254e.p256b.p257a.InterfaceC8790g;

/* compiled from: TransportFactoryImpl.java */
/* renamed from: e.e.b.a.i.r */
/* loaded from: classes2.dex */
final class C8875r implements InterfaceC8790g {

    /* renamed from: a */
    private final Set<C8785b> f33609a;

    /* renamed from: b */
    private final AbstractC8874q f33610b;

    /* renamed from: c */
    private final InterfaceC8877t f33611c;

    C8875r(Set<C8785b> set, AbstractC8874q abstractC8874q, InterfaceC8877t interfaceC8877t) {
        this.f33609a = set;
        this.f33610b = abstractC8874q;
        this.f33611c = interfaceC8877t;
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8790g
    /* renamed from: a */
    public <T> InterfaceC8789f<T> mo26454a(String str, Class<T> cls, C8785b c8785b, InterfaceC8788e<T, byte[]> interfaceC8788e) {
        if (this.f33609a.contains(c8785b)) {
            return new C8876s(this.f33610b, str, c8785b, interfaceC8788e, this.f33611c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c8785b, this.f33609a));
    }
}
