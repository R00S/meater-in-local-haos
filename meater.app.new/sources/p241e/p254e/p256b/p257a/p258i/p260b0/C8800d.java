package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.backends.InterfaceC6262e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: DefaultScheduler_Factory.java */
/* renamed from: e.e.b.a.i.b0.d */
/* loaded from: classes2.dex */
public final class C8800d implements InterfaceC8882b<C8799c> {

    /* renamed from: a */
    private final Provider<Executor> f33454a;

    /* renamed from: b */
    private final Provider<InterfaceC6262e> f33455b;

    /* renamed from: c */
    private final Provider<InterfaceC6295y> f33456c;

    /* renamed from: d */
    private final Provider<InterfaceC8825j0> f33457d;

    /* renamed from: e */
    private final Provider<InterfaceC6296a> f33458e;

    public C8800d(Provider<Executor> provider, Provider<InterfaceC6262e> provider2, Provider<InterfaceC6295y> provider3, Provider<InterfaceC8825j0> provider4, Provider<InterfaceC6296a> provider5) {
        this.f33454a = provider;
        this.f33455b = provider2;
        this.f33456c = provider3;
        this.f33457d = provider4;
        this.f33458e = provider5;
    }

    /* renamed from: a */
    public static C8800d m27963a(Provider<Executor> provider, Provider<InterfaceC6262e> provider2, Provider<InterfaceC6295y> provider3, Provider<InterfaceC8825j0> provider4, Provider<InterfaceC6296a> provider5) {
        return new C8800d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C8799c m27964c(Executor executor, InterfaceC6262e interfaceC6262e, InterfaceC6295y interfaceC6295y, InterfaceC8825j0 interfaceC8825j0, InterfaceC6296a interfaceC6296a) {
        return new C8799c(executor, interfaceC6262e, interfaceC6295y, interfaceC8825j0, interfaceC6296a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8799c get() {
        return m27964c(this.f33454a.get(), this.f33455b.get(), this.f33456c.get(), this.f33457d.get(), this.f33458e.get());
    }
}
