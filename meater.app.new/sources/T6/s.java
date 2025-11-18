package T6;

import U6.InterfaceC1741c;
import U6.InterfaceC1742d;
import android.content.Context;
import java.util.concurrent.Executor;
import ma.InterfaceC4015a;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes2.dex */
public final class s implements O6.b<r> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f16213a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<N6.e> f16214b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC1742d> f16215c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<x> f16216d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4015a<Executor> f16217e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4015a<V6.a> f16218f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f16219g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f16220h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC1741c> f16221i;

    public s(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<N6.e> interfaceC4015a2, InterfaceC4015a<InterfaceC1742d> interfaceC4015a3, InterfaceC4015a<x> interfaceC4015a4, InterfaceC4015a<Executor> interfaceC4015a5, InterfaceC4015a<V6.a> interfaceC4015a6, InterfaceC4015a<W6.a> interfaceC4015a7, InterfaceC4015a<W6.a> interfaceC4015a8, InterfaceC4015a<InterfaceC1741c> interfaceC4015a9) {
        this.f16213a = interfaceC4015a;
        this.f16214b = interfaceC4015a2;
        this.f16215c = interfaceC4015a3;
        this.f16216d = interfaceC4015a4;
        this.f16217e = interfaceC4015a5;
        this.f16218f = interfaceC4015a6;
        this.f16219g = interfaceC4015a7;
        this.f16220h = interfaceC4015a8;
        this.f16221i = interfaceC4015a9;
    }

    public static s a(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<N6.e> interfaceC4015a2, InterfaceC4015a<InterfaceC1742d> interfaceC4015a3, InterfaceC4015a<x> interfaceC4015a4, InterfaceC4015a<Executor> interfaceC4015a5, InterfaceC4015a<V6.a> interfaceC4015a6, InterfaceC4015a<W6.a> interfaceC4015a7, InterfaceC4015a<W6.a> interfaceC4015a8, InterfaceC4015a<InterfaceC1741c> interfaceC4015a9) {
        return new s(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4, interfaceC4015a5, interfaceC4015a6, interfaceC4015a7, interfaceC4015a8, interfaceC4015a9);
    }

    public static r c(Context context, N6.e eVar, InterfaceC1742d interfaceC1742d, x xVar, Executor executor, V6.a aVar, W6.a aVar2, W6.a aVar3, InterfaceC1741c interfaceC1741c) {
        return new r(context, eVar, interfaceC1742d, xVar, executor, aVar, aVar2, aVar3, interfaceC1741c);
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f16213a.get(), this.f16214b.get(), this.f16215c.get(), this.f16216d.get(), this.f16217e.get(), this.f16218f.get(), this.f16219g.get(), this.f16220h.get(), this.f16221i.get());
    }
}
