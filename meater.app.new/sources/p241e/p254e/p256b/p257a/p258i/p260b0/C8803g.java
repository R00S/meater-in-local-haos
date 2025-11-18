package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* renamed from: e.e.b.a.i.b0.g */
/* loaded from: classes2.dex */
public final class C8803g implements InterfaceC8882b<AbstractC6290t> {

    /* renamed from: a */
    private final Provider<InterfaceC8854a> f33459a;

    public C8803g(Provider<InterfaceC8854a> provider) {
        this.f33459a = provider;
    }

    /* renamed from: a */
    public static AbstractC6290t m27967a(InterfaceC8854a interfaceC8854a) {
        return (AbstractC6290t) C8884d.m28189c(AbstractC8802f.m27966a(interfaceC8854a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8803g m27968b(Provider<InterfaceC8854a> provider) {
        return new C8803g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC6290t get() {
        return m27967a(this.f33459a.get());
    }
}
