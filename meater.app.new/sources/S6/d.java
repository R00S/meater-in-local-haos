package S6;

import T6.x;
import U6.InterfaceC1742d;
import java.util.concurrent.Executor;
import ma.InterfaceC4015a;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes2.dex */
public final class d implements O6.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Executor> f15510a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<N6.e> f15511b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<x> f15512c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC1742d> f15513d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4015a<V6.a> f15514e;

    public d(InterfaceC4015a<Executor> interfaceC4015a, InterfaceC4015a<N6.e> interfaceC4015a2, InterfaceC4015a<x> interfaceC4015a3, InterfaceC4015a<InterfaceC1742d> interfaceC4015a4, InterfaceC4015a<V6.a> interfaceC4015a5) {
        this.f15510a = interfaceC4015a;
        this.f15511b = interfaceC4015a2;
        this.f15512c = interfaceC4015a3;
        this.f15513d = interfaceC4015a4;
        this.f15514e = interfaceC4015a5;
    }

    public static d a(InterfaceC4015a<Executor> interfaceC4015a, InterfaceC4015a<N6.e> interfaceC4015a2, InterfaceC4015a<x> interfaceC4015a3, InterfaceC4015a<InterfaceC1742d> interfaceC4015a4, InterfaceC4015a<V6.a> interfaceC4015a5) {
        return new d(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4, interfaceC4015a5);
    }

    public static c c(Executor executor, N6.e eVar, x xVar, InterfaceC1742d interfaceC1742d, V6.a aVar) {
        return new c(executor, eVar, xVar, interfaceC1742d, aVar);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f15510a.get(), this.f15511b.get(), this.f15512c.get(), this.f15513d.get(), this.f15514e.get());
    }
}
