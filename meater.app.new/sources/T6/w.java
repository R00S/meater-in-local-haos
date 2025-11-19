package T6;

import U6.InterfaceC1742d;
import java.util.concurrent.Executor;
import ma.InterfaceC4015a;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes2.dex */
public final class w implements O6.b<v> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Executor> f16228a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC1742d> f16229b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<x> f16230c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<V6.a> f16231d;

    public w(InterfaceC4015a<Executor> interfaceC4015a, InterfaceC4015a<InterfaceC1742d> interfaceC4015a2, InterfaceC4015a<x> interfaceC4015a3, InterfaceC4015a<V6.a> interfaceC4015a4) {
        this.f16228a = interfaceC4015a;
        this.f16229b = interfaceC4015a2;
        this.f16230c = interfaceC4015a3;
        this.f16231d = interfaceC4015a4;
    }

    public static w a(InterfaceC4015a<Executor> interfaceC4015a, InterfaceC4015a<InterfaceC1742d> interfaceC4015a2, InterfaceC4015a<x> interfaceC4015a3, InterfaceC4015a<V6.a> interfaceC4015a4) {
        return new w(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4);
    }

    public static v c(Executor executor, InterfaceC1742d interfaceC1742d, x xVar, V6.a aVar) {
        return new v(executor, interfaceC1742d, xVar, aVar);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f16228a.get(), this.f16229b.get(), this.f16230c.get(), this.f16231d.get());
    }
}
