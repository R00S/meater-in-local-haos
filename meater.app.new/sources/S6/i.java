package S6;

import T6.x;
import U6.InterfaceC1742d;
import android.content.Context;
import ma.InterfaceC4015a;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes2.dex */
public final class i implements O6.b<x> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4015a<Context> f15516a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4015a<InterfaceC1742d> f15517b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4015a<T6.f> f15518c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4015a<W6.a> f15519d;

    public i(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<InterfaceC1742d> interfaceC4015a2, InterfaceC4015a<T6.f> interfaceC4015a3, InterfaceC4015a<W6.a> interfaceC4015a4) {
        this.f15516a = interfaceC4015a;
        this.f15517b = interfaceC4015a2;
        this.f15518c = interfaceC4015a3;
        this.f15519d = interfaceC4015a4;
    }

    public static i a(InterfaceC4015a<Context> interfaceC4015a, InterfaceC4015a<InterfaceC1742d> interfaceC4015a2, InterfaceC4015a<T6.f> interfaceC4015a3, InterfaceC4015a<W6.a> interfaceC4015a4) {
        return new i(interfaceC4015a, interfaceC4015a2, interfaceC4015a3, interfaceC4015a4);
    }

    public static x c(Context context, InterfaceC1742d interfaceC1742d, T6.f fVar, W6.a aVar) {
        return (x) O6.d.d(h.a(context, interfaceC1742d, fVar, aVar));
    }

    @Override // ma.InterfaceC4015a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f15516a.get(), this.f15517b.get(), this.f15518c.get(), this.f15519d.get());
    }
}
