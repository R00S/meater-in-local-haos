package p241e.p254e.p256b.p257a.p258i;

import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.InterfaceC8789f;
import p241e.p254e.p256b.p257a.InterfaceC8791h;

/* compiled from: TransportImpl.java */
/* renamed from: e.e.b.a.i.s */
/* loaded from: classes2.dex */
final class C8876s<T> implements InterfaceC8789f<T> {

    /* renamed from: a */
    private final AbstractC8874q f33612a;

    /* renamed from: b */
    private final String f33613b;

    /* renamed from: c */
    private final C8785b f33614c;

    /* renamed from: d */
    private final InterfaceC8788e<T, byte[]> f33615d;

    /* renamed from: e */
    private final InterfaceC8877t f33616e;

    C8876s(AbstractC8874q abstractC8874q, String str, C8785b c8785b, InterfaceC8788e<T, byte[]> interfaceC8788e, InterfaceC8877t interfaceC8877t) {
        this.f33612a = abstractC8874q;
        this.f33613b = str;
        this.f33614c = c8785b;
        this.f33615d = interfaceC8788e;
        this.f33616e = interfaceC8877t;
    }

    /* renamed from: d */
    static /* synthetic */ void m28172d(Exception exc) {
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8789f
    /* renamed from: a */
    public void mo26452a(AbstractC8786c<T> abstractC8786c) {
        mo26453b(abstractC8786c, new InterfaceC8791h() { // from class: e.e.b.a.i.a
            @Override // p241e.p254e.p256b.p257a.InterfaceC8791h
            /* renamed from: a */
            public final void mo26010a(Exception exc) {
                C8876s.m28172d(exc);
            }
        });
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8789f
    /* renamed from: b */
    public void mo26453b(AbstractC8786c<T> abstractC8786c, InterfaceC8791h interfaceC8791h) {
        this.f33616e.mo28174a(AbstractC8873p.m28167a().mo28130e(this.f33612a).mo28128c(abstractC8786c).mo28131f(this.f33613b).mo28129d(this.f33615d).mo28127b(this.f33614c).mo28126a(), interfaceC8791h);
    }

    /* renamed from: c */
    AbstractC8874q m28173c() {
        return this.f33612a;
    }
}
