package p241e.p254e.p256b.p257a.p258i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6291u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6293w;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8801e;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: TransportRuntime_Factory.java */
/* renamed from: e.e.b.a.i.w */
/* loaded from: classes2.dex */
public final class C8880w implements InterfaceC8882b<C8878u> {

    /* renamed from: a */
    private final Provider<InterfaceC8854a> f33622a;

    /* renamed from: b */
    private final Provider<InterfaceC8854a> f33623b;

    /* renamed from: c */
    private final Provider<InterfaceC8801e> f33624c;

    /* renamed from: d */
    private final Provider<C6291u> f33625d;

    /* renamed from: e */
    private final Provider<C6293w> f33626e;

    public C8880w(Provider<InterfaceC8854a> provider, Provider<InterfaceC8854a> provider2, Provider<InterfaceC8801e> provider3, Provider<C6291u> provider4, Provider<C6293w> provider5) {
        this.f33622a = provider;
        this.f33623b = provider2;
        this.f33624c = provider3;
        this.f33625d = provider4;
        this.f33626e = provider5;
    }

    /* renamed from: a */
    public static C8880w m28181a(Provider<InterfaceC8854a> provider, Provider<InterfaceC8854a> provider2, Provider<InterfaceC8801e> provider3, Provider<C6291u> provider4, Provider<C6293w> provider5) {
        return new C8880w(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C8878u m28182c(InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2, InterfaceC8801e interfaceC8801e, C6291u c6291u, C6293w c6293w) {
        return new C8878u(interfaceC8854a, interfaceC8854a2, interfaceC8801e, c6291u, c6293w);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8878u get() {
        return m28182c(this.f33622a.get(), this.f33623b.get(), this.f33624c.get(), this.f33625d.get(), this.f33626e.get());
    }
}
