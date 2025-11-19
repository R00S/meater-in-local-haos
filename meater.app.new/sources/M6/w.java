package M6;

import ma.InterfaceC4015a;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes2.dex */
public final class w implements O6.b<u> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f12117a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f12118b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<S6.e> f12119c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<T6.r> f12120d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4015a<T6.v> f12121e;

    public w(InterfaceC4015a<W6.a> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<S6.e> interfaceC4015a3, InterfaceC4015a<T6.r> interfaceC4015a4, InterfaceC4015a<T6.v> interfaceC4015a5) {
        this.f12117a = interfaceC4015a;
        this.f12118b = interfaceC4015a2;
        this.f12119c = interfaceC4015a3;
        this.f12120d = interfaceC4015a4;
        this.f12121e = interfaceC4015a5;
    }

    public static w a(InterfaceC4015a<W6.a> interfaceC4015a, InterfaceC4015a<W6.a> interfaceC4015a2, InterfaceC4015a<S6.e> interfaceC4015a3, InterfaceC4015a<T6.r> interfaceC4015a4, InterfaceC4015a<T6.v> interfaceC4015a5) {
        return new w(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4, interfaceC4015a5);
    }

    public static u c(W6.a aVar, W6.a aVar2, S6.e eVar, T6.r rVar, T6.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f12117a.get(), this.f12118b.get(), this.f12119c.get(), this.f12120d.get(), this.f12121e.get());
    }
}
