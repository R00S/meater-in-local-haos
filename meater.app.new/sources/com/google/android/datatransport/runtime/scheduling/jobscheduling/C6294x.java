package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: WorkInitializer_Factory.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.x */
/* loaded from: classes2.dex */
public final class C6294x implements InterfaceC8882b<C6293w> {

    /* renamed from: a */
    private final Provider<Executor> f16861a;

    /* renamed from: b */
    private final Provider<InterfaceC8825j0> f16862b;

    /* renamed from: c */
    private final Provider<InterfaceC6295y> f16863c;

    /* renamed from: d */
    private final Provider<InterfaceC6296a> f16864d;

    public C6294x(Provider<Executor> provider, Provider<InterfaceC8825j0> provider2, Provider<InterfaceC6295y> provider3, Provider<InterfaceC6296a> provider4) {
        this.f16861a = provider;
        this.f16862b = provider2;
        this.f16863c = provider3;
        this.f16864d = provider4;
    }

    /* renamed from: a */
    public static C6294x m13596a(Provider<Executor> provider, Provider<InterfaceC8825j0> provider2, Provider<InterfaceC6295y> provider3, Provider<InterfaceC6296a> provider4) {
        return new C6294x(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C6293w m13597c(Executor executor, InterfaceC8825j0 interfaceC8825j0, InterfaceC6295y interfaceC6295y, InterfaceC6296a interfaceC6296a) {
        return new C6293w(executor, interfaceC8825j0, interfaceC6295y, interfaceC6296a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6293w get() {
        return m13597c(this.f16861a.get(), this.f16862b.get(), this.f16863c.get(), this.f16864d.get());
    }
}
