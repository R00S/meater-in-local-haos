package S6;

import ma.InterfaceC4015a;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes2.dex */
public final class g implements O6.b<T6.f> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f15515a;

    public g(InterfaceC4015a<W6.a> interfaceC4015a) {
        this.f15515a = interfaceC4015a;
    }

    public static T6.f a(W6.a aVar) {
        return (T6.f) O6.d.d(f.a(aVar));
    }

    public static g b(InterfaceC4015a<W6.a> interfaceC4015a) {
        return new g(interfaceC4015a);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T6.f get() {
        return a(this.f15515a.get());
    }
}
