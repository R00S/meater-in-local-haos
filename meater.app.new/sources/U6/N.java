package U6;

import ma.InterfaceC4015a;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes2.dex */
public final class N implements O6.b<M> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f17582a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f17583b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<AbstractC1743e> f17584c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<W> f17585d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4015a<String> f17586e;

    public N(InterfaceC4015a<W6.a> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<AbstractC1743e> interfaceC4015a3, InterfaceC4015a<W> interfaceC4015a4, InterfaceC4015a<String> interfaceC4015a5) {
        this.f17582a = interfaceC4015a;
        this.f17583b = interfaceC4015a2;
        this.f17584c = interfaceC4015a3;
        this.f17585d = interfaceC4015a4;
        this.f17586e = interfaceC4015a5;
    }

    public static N a(InterfaceC4015a<W6.a> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<AbstractC1743e> interfaceC4015a3, InterfaceC4015a<W> interfaceC4015a4, InterfaceC4015a<String> interfaceC4015a5) {
        return new N(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4, interfaceC4015a5);
    }

    public static M c(W6.a aVar, W6.a aVar2, Object obj, Object obj2, InterfaceC4015a<String> interfaceC4015a) {
        return new M(aVar, aVar2, (AbstractC1743e) obj, (W) obj2, interfaceC4015a);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c(this.f17582a.get(), this.f17583b.get(), this.f17584c.get(), this.f17585d.get(), this.f17586e);
    }
}
