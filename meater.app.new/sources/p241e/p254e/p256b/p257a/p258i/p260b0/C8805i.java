package p241e.p254e.p256b.p257a.p258i.p260b0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* renamed from: e.e.b.a.i.b0.i */
/* loaded from: classes2.dex */
public final class C8805i implements InterfaceC8882b<InterfaceC6295y> {

    /* renamed from: a */
    private final Provider<Context> f33460a;

    /* renamed from: b */
    private final Provider<InterfaceC8825j0> f33461b;

    /* renamed from: c */
    private final Provider<AbstractC6290t> f33462c;

    /* renamed from: d */
    private final Provider<InterfaceC8854a> f33463d;

    public C8805i(Provider<Context> provider, Provider<InterfaceC8825j0> provider2, Provider<AbstractC6290t> provider3, Provider<InterfaceC8854a> provider4) {
        this.f33460a = provider;
        this.f33461b = provider2;
        this.f33462c = provider3;
        this.f33463d = provider4;
    }

    /* renamed from: a */
    public static C8805i m27971a(Provider<Context> provider, Provider<InterfaceC8825j0> provider2, Provider<AbstractC6290t> provider3, Provider<InterfaceC8854a> provider4) {
        return new C8805i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static InterfaceC6295y m27972c(Context context, InterfaceC8825j0 interfaceC8825j0, AbstractC6290t abstractC6290t, InterfaceC8854a interfaceC8854a) {
        return (InterfaceC6295y) C8884d.m28189c(AbstractC8804h.m27970a(context, interfaceC8825j0, abstractC6290t, interfaceC8854a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6295y get() {
        return m27972c(this.f33460a.get(), this.f33461b.get(), this.f33462c.get(), this.f33463d.get());
    }
}
